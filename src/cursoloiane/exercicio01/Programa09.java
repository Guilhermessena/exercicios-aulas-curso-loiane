package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o graus em farenheit: ");
		double f = scan.nextDouble();

		double c = (5 * (f - 32) / 9);
		System.out.println(c);
	}

}
