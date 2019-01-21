package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe os dados do produto: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Pre�o: ");
		double price = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);

//		System.out.println(produto.name + "," + produto.price + "," + produto.quantity);
//		System.out.println(produto);
		
		
		System.out.println();
		System.out.println("Product data: " + produto);
		System.out.println();
		System.out.print("Enter com o numero de produtos a serem adicionados no estoque: ");
		quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		System.out.println();
		System.out.print("Enter com o numero de produtos a serem removidos no estoque: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		sc.close();

	}

}
