package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n?mero: ");
		int num = scan.nextInt();

		boolean primo = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("N?o ? primo, pois ? divisivel por: " + i);
				primo = false;
			}
		}
		if (primo) {
			System.out.println("? um primo");
		}
	}
}
