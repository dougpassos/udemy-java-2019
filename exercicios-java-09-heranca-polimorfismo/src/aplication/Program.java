package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Informe o numero de produtos:");
		int numProd = scan.nextInt();

		for (int i = 1; i <= numProd; i++) {
			System.out.println("Produto #" + i + " data:");
			System.out.print("Comum, usado ou importado (c/u/i)?");
			scan.nextLine();
			char tipoProduto = scan.nextLine().charAt(0);

			System.out.print("Nome: ");
			String name = scan.nextLine();

			System.out.print("Preço: ");
			double price = scan.nextDouble();

			if (tipoProduto == 'c') {
				list.add(new Product(name, price));

			} else if (tipoProduto == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date manufatureData = sdf.parse(scan.next());
				list.add(new UsedProduct(name, price, manufatureData));

			} else if (tipoProduto == 'i') {
				System.out.print("Taxa alfandegária: ");
				double customsFee = scan.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else {
				System.out.println("ERRO: TIPO DE PRODUTO NÃO EXISTE!!!");
				System.out.println("PRODUTO NÃO FOI REGISTRADO.");
			}

		}

		scan.close();

		System.out.println();
		System.out.println("Etiquetas de Preço:");
		for (Product producto : list) {
			System.out.println(producto.priceTag());
		}

	}

}
