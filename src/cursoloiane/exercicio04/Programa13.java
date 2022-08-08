package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int somaVetorA = 0;

		System.out.println("Digite " + vetorA.length + " números: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 5 == 0) {
				somaVetorA += vetorA[i];
			}

		}

		System.out.println("A soma dos elementos múltiplos de 5: " + somaVetorA);
	}
}
