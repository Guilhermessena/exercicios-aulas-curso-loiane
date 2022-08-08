package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int posicaoMax = 0;
		int posicaoMin = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.println("Digite " + vetorA.length + " idades: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			if (vetorA[i] > max) {
				max = vetorA[i];
				posicaoMax = i;
			}
			if (vetorA[i] < min) {
				min = vetorA[i];
				posicaoMin = i;
			}

		}
		System.out.println("Menor idade digitada: " + min + " anos de idade, na posição " + posicaoMin);

		System.out.println("Maior idade digitada: " + max + " anos de idade, na posição " + posicaoMax);

	}
}
