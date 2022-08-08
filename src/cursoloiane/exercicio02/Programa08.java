package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro preço: ");
		double valor1 = scan.nextDouble();
		System.out.print("Digite o segundo preço: ");
		double valor2 = scan.nextDouble();
		System.out.print("Digite o terceiro preço: ");
		double valor3 = scan.nextDouble();

		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("menor preço " + valor1);
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("menor preço " + valor2);
		} else {
			System.out.println("menor preço " + valor3);
		}

	}

}
