package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 10 números: ");
		int num;
		int par = 0;
		int impar = 0;

		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			if (num % 2 == 0) {
				par++;
			} else if (num % 2 != 0) {
				impar++;
			}
		}
		System.out.println("par: " + par);
		System.out.println("impar: " + impar);
	}
}
