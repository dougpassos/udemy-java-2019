package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		/* Criando a matrix */
		int m = scan.nextInt();
		int n = scan.nextInt();

		Integer[][] matrix = new Integer[m][n];

		/* Preenchendo a matrix */

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();

			}
		}

		// Localizando numero

		int numero = scan.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == numero) {
					System.out.println("Position [" + i + "],[" + j + "]:");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}

					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}

					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
					
					System.out.println("==============================");

				}

			}
		}

		scan.close();

	}

}
