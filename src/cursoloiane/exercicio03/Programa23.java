package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double valorItem = 1.99;
		double somaItens = 0;

		System.out.println("Loja quase 2 - Tabela de Preços");

		for (int i = 1; i <= 50; i++) {
			somaItens += valorItem;
			System.out.print(i + " - R$ ");
			System.out.printf("%.2f \n", somaItens);

		}
	}
}
