package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		double num3 = scan.nextDouble();

		double calculo1 = (num1 * 2) + (num2 / 2);
		System.out.println(calculo1);
		double calculo2 = (num1 * 3) + num3;
		System.out.println(calculo2);
		double calculo3 = Math.pow(num3, 3);
		System.out.println(calculo3);

	}

}
