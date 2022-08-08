package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos Kg de morango: ");
		int kgMorango = scan.nextInt();
		System.out.println("Quantos Kg de maçã: ");
		int kgMaca = scan.nextInt();

		double valorMorango = 0;
		double valorMaca = 0;

		if (kgMorango < 5) {
			valorMorango = 2.5;
		} else {
			valorMorango = 2.2;
		}

		if (kgMaca < 5) {
			valorMaca = 1.8;
		} else {
			valorMaca = 1.5;
		}

		double valorTotal = (valorMorango * kgMorango) + (valorMaca * kgMaca);

		if (kgMorango + kgMaca > 8 || valorTotal > 25) {
			valorTotal = valorTotal * 0.9;
		}

		System.out.println("valor a ser pago: R$" + valorTotal);

	}

}
