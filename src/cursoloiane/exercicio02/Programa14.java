package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("digite a segunda nota: ");
		double nota2 = scan.nextDouble();

		String conceito = null;
		double media = (nota1 + nota2) / 2;

		if (media >= 0 && media < 4) {
			conceito = "E";

		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 7.5 && media < 9) {
			conceito = "A";
		}

		System.out.println("nota 1:" + nota1 + " nota 2:" + nota2);
		System.out.println("media:" + media + " conceito:" + conceito);

		switch (conceito) {
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO");
			break;
		case "D":
		case "E":
			System.out.println("REPROVADO");
		default:
			break;
		}

	}

}
