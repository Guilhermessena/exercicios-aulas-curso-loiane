package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int percentualImpar = 0;
		int contImpar = 0;
		int percentualPar = 0;
		int contPar = 0;

		System.out.println("Digite " + vetorA.length + " números: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 == 0) {
				contPar++;
			}
			if (!(vetorA[i] % 2 == 0)) {
				contImpar++;
			}
		}
		percentualPar = (contPar * 100) / vetorA.length;
		percentualImpar = (contImpar * 100) / vetorA.length;

		System.out.println("Percentual par: " + percentualPar + "%");
		System.out.println("Percentual impar: " + percentualImpar + "%");
	}
}
