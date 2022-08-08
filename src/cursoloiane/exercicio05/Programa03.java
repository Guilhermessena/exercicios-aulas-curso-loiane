package cursoloiane.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int contPar = 0;
		int contImpar = 0;

		System.out.println("Digite 9 números: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = scan.nextInt();
				if (matriz[i][j] % 2 == 0) {
					contPar++;
				} else if (!(matriz[i][j] % 2 == 0)) {
					contImpar++;
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Quantidade números pares: " + contPar);
		System.out.println("Quantidade números impares: " + contImpar);

	}

}
