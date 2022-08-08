package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 5 números");
		int num = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			num = scan.nextInt();

			if (num > max) {
				max = num;
			}
		}
		System.out.println("O maior número digitado foi: " + max);
	}
}
