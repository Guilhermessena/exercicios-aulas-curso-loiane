package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Valor do p�o: R$ ");
		double valorPao = scan.nextDouble();

		double somaPao = 0;

		System.out.println("Panificadora P�o de ontem - Tabela de Pre�os");

		for (int i = 1; i <= 50; i++) {
			somaPao += valorPao;
			System.out.print(i + " - R$ ");
			System.out.printf("%.2f \n", somaPao);

		}
	}

}
