package cursoloiane.exercicio05;

import java.util.Random;

public class Programa02 {
	public static void main(String[] args) {

		int[][] matriz = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(100);
			}
		}
		int maxLinha = 0;
		int minLinha = 100;
		int maxColuna = 0;
		int minColuna = 100;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[5][j] > maxLinha) {
					maxLinha = matriz[5][j];
				} else if (matriz[5][j] < minLinha) {
					minLinha = matriz[5][j];
				}
				if (matriz[i][7] > maxColuna) {
					maxColuna = matriz[i][7];
				} else if (matriz[i][7] < minColuna) {
					minColuna = matriz[i][7];
				}
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Maior valor Linha 5: " + maxLinha);
		System.out.println("Menor valor Linha 5: " + minLinha);
		System.out.println("Maior valor Coluna 7: " + maxColuna);
		System.out.println("Maior valor Coluna 7: " + minColuna);

	}

}
