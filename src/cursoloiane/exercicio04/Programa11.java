package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int cont = 0;

		System.out.println("Digite " + vetorA.length + " números: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.println("O número de elementos que são pares: " + cont);
	}
}
