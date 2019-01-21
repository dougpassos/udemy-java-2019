package aplication;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Rent[] vetor = new Rent[10];

		System.out.println("Quantos quartos vc desejar alugar?: ");

		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Aluguel #" + i + ":");

			System.out.println("Nome: ");
			String name = scan.nextLine();

			System.out.println("E-mail: ");
			String email = scan.nextLine();

			System.out.println("Quarto: ");
			int quarto = scan.nextInt();
			scan.nextLine();

			vetor[quarto] = new Rent(name, email);

		}

		scan.close();

		System.out.println();
		System.out.println("Lista de quartos ocupados:");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);

			}

		}
		
		System.out.println();
		System.out.println("Lista de quartos - Completa:");

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);

			}else {
				System.out.println(i + ": Vago");
			}

		}

	}

}
