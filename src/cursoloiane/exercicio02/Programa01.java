package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int valor2 = scan.nextInt();

		if (valor1 > valor2) {
			System.out.println(valor1);
		} else {
			System.out.println(valor2);
		}
	}
}
