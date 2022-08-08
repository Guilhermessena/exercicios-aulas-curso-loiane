package cursoloiane.exercicio03;

import java.util.Iterator;
import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Fazer média de quantas notas: ");
		int notas = scan.nextInt();
		int soma = 0;
		int nota = 0;

		for (int i = 1; i <= notas; i++) {
			System.out.println("Digite a nota: ");
			nota = scan.nextInt();
			soma += nota;
		}

		double media = soma / notas;
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

	}

}
