package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int cont = 0;

		System.out.println("Digite " + vetorA.length + " idades: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			if (vetorA[i] > 35) {
				cont++;
			}

		}
		System.out.println("Pessoas com idade superior a 35 anos: " + cont);
	}

}
