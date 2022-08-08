package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		int valor1 = scan.nextInt();
		System.out.print("Digite a segunda nota: ");
		int valor2 = scan.nextInt();

		double media = (valor1 + valor2) / 2;

		if (media >= 7) {
			if (media == 10) {
				System.out.println("Aprovado com Distinção");
			} else {
				System.out.println("Aprovado");
			}

		} else {
			System.out.println("Reprovado");
		}

	}

}
