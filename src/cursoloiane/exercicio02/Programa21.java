package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos litros de combustível você quer: ");
		int litros = scan.nextInt();
		System.out.println("Qual o tipo de combustível A-alcool/G-gasolina: ");
		String tipo = scan.next();
		double valorA = 1.90;
		double valorG = 2.50;

		double valorAtual = 0;

		if (tipo.equalsIgnoreCase("a")) {
			if (litros < 20) {
				valorAtual = valorA * 0.97;
			} else if (litros >= 20) {
				valorAtual = valorA * 0.95;
			}
		}

		if (tipo.equalsIgnoreCase("g")) {
			if (litros < 20) {
				valorAtual = valorG * 0.96;
			} else if (litros >= 20) {
				valorAtual = valorG * 0.94;
			}
		}

		double valorFinal = litros * valorAtual;

		System.out.println("Valor a ser pago R$:" + valorFinal);

	}

}
