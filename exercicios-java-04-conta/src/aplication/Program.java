package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Account conta;

		System.out.print("Entre com o numero da conta: ");
		int number = scan.nextInt();
		scan.nextLine();

		System.out.print("Entre com o nome do cliente: ");
		String holder = scan.nextLine();

		System.out.print("Deseja fazer um deposito inicial: (y/n)? ");
		char inicialDeposito = scan.next().charAt(0);

		double balance;
		if (inicialDeposito == 'y') {
			System.out.print("Entre com o valor do deposito: ");
			balance = scan.nextDouble();
			conta = new Account(number, holder, balance);

		} else {
			conta = new Account(number, holder);
		}
		
		System.out.print(conta);

		System.out.print("Entre com valor de deposito: $");
		double amount = scan.nextDouble();
		conta.deposit(amount);
		System.out.println(conta);

		System.out.print("Entre com valor de saque: $");
		amount = scan.nextDouble();
		conta.whithdraw(amount);
		System.out.println(conta);

		scan.close();

	}

}
