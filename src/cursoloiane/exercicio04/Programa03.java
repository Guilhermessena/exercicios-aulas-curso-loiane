package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		System.out.println("Digite " + vetorA.length + " números");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			vetorB[i] = vetorA[i] * vetorA[i];
		}

		System.out.print("valores do vetor A: ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("valores do vetor B: ");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}

	}

}
