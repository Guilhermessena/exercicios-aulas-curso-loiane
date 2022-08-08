package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double valorMedioCd = 0;
		double somaCds = 0;

		System.out.println("Digite o número de CDs comprados");
		int numCds = scan.nextInt();

		for (int i = 0; i < numCds; i++) {
			System.out.print("Qual o valor deste Cd: ");
			double valorCd = scan.nextDouble();

			somaCds += valorCd;
		}

		valorMedioCd = somaCds / numCds;

		System.out.printf("O valor total de CDs commprados foi: %.2f", somaCds);
		System.out.printf(" e o valor médio de cada CD %.2f" , valorMedioCd);

	}

}
