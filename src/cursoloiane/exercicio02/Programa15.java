package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("digite o valor do primeiro lado: ");
		int lado1 = scan.nextInt();
		System.out.print("digite o valor do primeiro lado: ");
		int lado2 = scan.nextInt();
		System.out.print("digite o valor do primeiro lado: ");
		int lado3 = scan.nextInt();

		if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
			System.out.println("É um triangulo!");
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("equilátero");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("escaleno");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("isóceles");
			}
		} else {
			System.out.println("Não é um triangulo");
		}

	}

}
