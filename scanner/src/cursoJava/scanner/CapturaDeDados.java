package cursoJava.scanner;

import java.util.Scanner;

public class CapturaDeDados {

	
	public static void main(String[] args) {
		System.out.println("Digite alguma String:");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String x,y,z;
		
		System.out.println("Voce escreveu: "+ sentence);
		
		x = scan.next();
		y = scan.next();
		z = scan.next();
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		x = scan.next();
		y = scan.next();
		z = scan.next();
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		scan.close();

	}

}
