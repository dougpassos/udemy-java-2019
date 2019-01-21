package aplicativo_triangulo;

import java.util.Locale;
import java.util.Scanner;

import aplicativo_triangulo_entidades.Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Informe as medidas do triangulo A:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Informe as medidas do triangulo B:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		sc.close();

		/*double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));*/
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area do Trinagulo X: %.4f%n", areaX);
		System.out.printf("Area do Trinagulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Area maior: X");
		} else {
			System.out.println("Area maior: Y");
		}

	}

}
