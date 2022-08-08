package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int somaVetorA = 0;
		int soma = 0;
		int media = 0;
		int cont = 0;
		int contI = 0;

		System.out.println("Digite " + vetorA.length + " números: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 15) {
				somaVetorA += vetorA[i];
			}
			if (vetorA[i] == 15) {
				cont++;
			}
			if (vetorA[i] > 15) {
				contI++;
				soma += vetorA[i];
				media = soma / contI;
			}

		}
		System.out.println("soma dos valores maiores que 15: " + somaVetorA);
		System.out.println("contagem dos valores iguais a 15: " + cont);
		System.out.println("media dos valores maiores que 15: " + media);
	}

}
