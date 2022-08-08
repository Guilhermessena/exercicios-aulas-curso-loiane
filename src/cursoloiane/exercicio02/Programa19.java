package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número 1: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o número 2: ");
		int num2 = scan.nextInt();
		int resultado = 0;

		System.out.println("Qual operação deseja realizar : ");
		String operacao = scan.next();

		if (operacao.equals("+")) {
			resultado = num1 + num2;
			if ((resultado % 2) == 0) {
				System.out.println(resultado + " é par!");
			} else {
				System.out.println(resultado + " é impar!");
			}

			if (resultado >= 0) {
				System.out.println("é positivo");
			} else {
				System.out.println("é negativo");
			}
		} else if (operacao.equals("-")) {
			resultado = num1 - num2;
			if ((resultado % 2) == 0) {
				System.out.println(resultado + " é par!");
			} else {
				System.out.println(resultado + " é impar!");
			}

			if (resultado >= 0) {
				System.out.println("é positivo");
			} else {
				System.out.println("é negativo");
			}
		}

	}

}
