package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 1;
		boolean trueFlag = true;
		double somaProduto = 0;
		double dinheiro = 0;
		double troco = 0;

		System.out.println("Lojas Tabajara");

		while (trueFlag == true) {
			System.out.print("Produto " + cont + ": R$ ");
			double valorProduto = scan.nextDouble();
			somaProduto += valorProduto;
			cont++;
			if (valorProduto == 0) {
				System.out.printf("Total: R$ %.2f \n", somaProduto);
				System.out.print("Dinheiro: ");
				dinheiro = scan.nextDouble();
				troco = dinheiro - somaProduto;
				System.out.printf("Troco: R$ %.2f \n", troco);
				System.out.println("-------------------------------");

				somaProduto = 0;
				cont = 1;
			}

		}

	}

}
