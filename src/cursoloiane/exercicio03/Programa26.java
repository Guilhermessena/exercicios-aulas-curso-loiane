package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Fatorial: ");
		int num = scan.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}

		System.out.print(num + "! = ");
		System.out.print(num);
		num = num - 1;
		for (int i = num; i >= 1; i--) {
			System.out.print(" . " + i);
		}
		System.out.println(" = " + fatorial);

	}

}
