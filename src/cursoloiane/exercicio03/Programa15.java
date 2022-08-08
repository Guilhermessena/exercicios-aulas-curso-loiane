package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("serie de fibonacci: ");
		int primeiroNum = 1;
		int segundoNum = 1;
		int proximo;
		int max = 100;

		System.out.println("Digite um n-ésimo termo para terminar a sequencia de fibonacci: ");
		int n = scan.nextInt();
		System.out.println(" " + primeiroNum);
		System.out.println(" " + segundoNum);
		for (int i = 3; i < n; i++) {
			proximo = primeiroNum + segundoNum;
			primeiroNum = segundoNum;
			segundoNum = proximo;
			System.out.println(" " + proximo);
		}

	}

}
