package cursoJava.scanner;

import java.util.Locale;
import java.util.Scanner;

public class CapturaDeDadosExercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nome = scan.nextLine(); //Alex Green
				
		System.out.println("Quantos quartos tem a sua casa:");
		int casa = scan.nextInt(); //3
		
		System.out.println("Entre com o preço do produto:");
		double preco = scan.nextDouble(); // 500.50
		
		System.out.println("Entre com seus ultimo nome, idade e altura:");
		// Green 21 1.73
		
		String sobreNome = scan.next();
		int idade = scan.nextInt();		
		double altura = scan.nextDouble();
		
		System.out.println(nome);
		System.out.println(casa);
		System.out.printf("%.2f%n",preco);
		System.out.println(sobreNome);
		System.out.println(idade);
		System.out.println(altura);
		scan.close();

	}

}
