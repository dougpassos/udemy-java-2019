package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o preço do Dollar? ");
		double dollarPrice = sc.nextDouble();

		System.out.println("Quantos dolares você deseja comprar? ");
		double amount = sc.nextDouble();
		//double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Valor a ser pago (com impostos) em reais = %.2f%n", 
				CurrencyConverter.dollarToReal(amount, dollarPrice));
		

		sc.close();
	}

}
