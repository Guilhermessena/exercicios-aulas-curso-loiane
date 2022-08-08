package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor = scan.nextInt();

		if (valor >= 0) {
			System.out.println("positivo");
		} else {
			System.out.println("negativo");
		}

	}

}
