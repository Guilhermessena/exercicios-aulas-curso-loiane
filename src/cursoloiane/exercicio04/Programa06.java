package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
		System.out.println();
		for (int c : vetorC) {
			System.out.print(c + " ");
		}
		System.out.println();

	}

}
