package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um conjunto de temperaturas: ");
		int temperaturas = scan.nextInt();
		double temp = 0;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		double somaTemp = 0;
		double mediaTemp = 0;

		System.out.println("Digite as temperaturas: ");
		for (int i = 0; i < temperaturas; i++) {
			temp = scan.nextDouble();

			if (temp > max) {
				max = temp;
			} else if (temp < min) {
				min = temp;
			}

			somaTemp += temp;
			mediaTemp = somaTemp / temperaturas;
		}

		System.out.println("A maior temperatura foi: " + max);
		System.out.println("A menor temperatura foi: " + min);
		System.out.println("A media entre elas foi: " + mediaTemp);
	}

}
