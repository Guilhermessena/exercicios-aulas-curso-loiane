package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
		}

		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
	}

}
