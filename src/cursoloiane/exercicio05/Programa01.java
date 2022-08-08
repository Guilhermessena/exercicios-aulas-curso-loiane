package cursoloiane.exercicio05;

import java.util.Random;

public class Programa01 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];

		Random numeroRandom = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(9);
			}
		}
		int linha = 0;
		int coluna = 0;
		int max = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > max) {

					max = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Maior valor: " + max);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);

	}
}
