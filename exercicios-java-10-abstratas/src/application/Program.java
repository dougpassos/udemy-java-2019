package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		List<Contribuintes> list = new ArrayList<>();

		System.out.print("Informe o numero de pagadores: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Dados do pagador #" + i + ": ");

			System.out.print("Individual or company (i/c)? ");
			char tipo = scan.next().charAt(0);

			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();

			System.out.print("renda Anual: ");
			Double rendaAnual = scan.nextDouble();

			if (tipo == 'i') {
				System.out.print("Gastos com Saúde: ");
				Double gastosSaude = scan.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Numero de Funcionários: ");
				Integer numeroFuncionarios = scan.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));

			}

		}

		Double soma = 0.0;
		System.out.println();
		System.out.println("Resumo de Pagamento de Impostos:");
		for (Contribuintes cont : list) {
			double imposto = cont.impostoPago();
			System.out.println(cont.getNome() + ": $" + String.format("%.2f", imposto));
			soma += imposto;

		}

		System.out.println();
		System.out.println("Total de impostos pagos: $" + String.format("%.2f", soma));

		scan.close();
	}

}
