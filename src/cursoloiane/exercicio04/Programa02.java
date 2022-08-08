package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];

		System.out.println("Digite " + vetorA.length + " números");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			vetorB[i] = 2 * vetorA[i];
		}

		System.out.print("Valores do A: ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Valores do B: ");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}

	}

}
