package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];

		System.out.println("Digite " + vetorA.length + " n�meros");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);
		}

		System.out.print("valores do vetor A: ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("valores do vetor B: ");
		for (double b : vetorB) {
			System.out.print(b + " ");
		}

	}

}
