package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo valor: ");
		int num2 = scan.nextInt();

		int soma = 0;

		System.out.print("Valores entre o num1 e o num2: ");
		for (; num1 <= num2; num1++) {
			System.out.print(" " + num1);
		}
	}

}
