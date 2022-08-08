package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("serie de fibonacci: ");
		int primeiroNum = 1;
		int segundoNum = 1;
		int proximo;
		int n = 500;

		System.out.println(" " + primeiroNum);
		System.out.println(" " + segundoNum);
		do {
			proximo = primeiroNum + segundoNum;
			primeiroNum = segundoNum;
			segundoNum = proximo;
			System.out.println(" " + proximo);
		} while (proximo < n);

	}

}
