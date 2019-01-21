package cursoJava.scanner;

import java.util.Locale;
import java.util.Scanner;

public class CapturaDeDados2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); //35
		sc.nextLine(); // flush limpeza de linha ou nextLine pendente 
		String nome = sc.nextLine(); // Bob brow
		char genero = sc.next().charAt(0); //F
		String s = sc.next(); //b5
		char letra = s.charAt(0);
		int digito = Integer.parseInt(s.substring(1));	
		double n2 = sc.nextDouble(); //4.32
		
		//Maria F 23 1.68
		
		String nome2 = sc.next();
		char ch = sc.next().charAt(0);
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(nome);
		System.out.println(genero);
		System.out.println(letra);
		System.out.println(digito);
		System.out.println(n2);
		System.out.println("----------------------------");
		System.out.println(nome2);
		System.out.println(ch);
		System.out.println(idade);
		System.out.println(altura);
		sc.close();

	}

}
