package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeira valor: ");
		int valor1 = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		int valor2 = scan.nextInt();
		System.out.print("Digite o terceiro valor: ");
		int valor3 = scan.nextInt();

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("número maior " + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("número maior " + valor2);
		} else {
			System.out.println("número maior " + valor3);
		}

	}

}
