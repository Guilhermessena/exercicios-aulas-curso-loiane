package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];

		System.out.println("Digite " + vetorA.length + " números");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i]*i;
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
