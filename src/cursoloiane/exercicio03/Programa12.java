package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o número que queira ver a tabuada: ");
		int num = scan.nextInt();
		int multiplicacao = 0;

		for (int i = 1; i < 11; i++) {
			multiplicacao = num * i;
			System.out.println(num + " x " + i + " = " + multiplicacao);
		}

	}

}
