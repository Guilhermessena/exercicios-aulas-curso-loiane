package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero de 0 a 10");
		int num1 = scan.nextInt();

		while (num1 > 10 || num1 < 0) {
			System.out.println("Valor inv�lido");
			System.out.println("Digite um n�mero de 0 a 10");
			num1 = scan.nextInt();
		}
		
		System.out.println("Valor v�lido");
	}

}
