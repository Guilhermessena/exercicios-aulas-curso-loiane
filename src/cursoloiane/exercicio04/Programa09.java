package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		System.out.println("Digite os valores de A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		System.out.println("Digite os valores de B: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}

		System.out.println("Valores do vetor A");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("Valores do vetor B");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("Valores do vetor C");
		for (double c : vetorC) {
			System.out.printf("%.2f ", c);
		}
	}
}
