package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite F/M: ");
		String sexo = scan.nextLine();

		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("feminino");
		} else if (sexo.equalsIgnoreCase("m")) {
			System.out.println("masculino");
		} else {
			System.out.println("sexo invalido");
		}

	}

}
