package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 5 números");
		int num = 0;
		double media = 0;
		int i = 0;
		int soma = 0;

		for (; i < 5; i++) {
			num = scan.nextInt();
			soma += num;
		}
		media = soma / 5;

		System.out.println("valor da media" + media);
	}

}
