package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual periodo você estuda?");
		String periodo = scan.next();

		switch (periodo) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Boa noite!");
			break;

		default:
			System.out.println("valor invalido");
			break;
		}

	}

}
