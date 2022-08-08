package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os graus Celsius: ");
		double c = scan.nextDouble();

		double f = c * 9 / 5 + 32;
		System.out.println(f);

	}

}
