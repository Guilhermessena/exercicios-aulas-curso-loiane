package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();

		if ((num1 % 2) == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		}

	}

}
