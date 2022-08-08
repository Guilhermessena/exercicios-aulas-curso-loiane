package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("digite um determinado ano: ");
		int ano = scan.nextInt();
		double bissexto = ano % 4;

		if (bissexto == 0) {
			System.out.println("ano bissexto");
		} else {
			System.out.println("ano normal");
		}

	}

}
