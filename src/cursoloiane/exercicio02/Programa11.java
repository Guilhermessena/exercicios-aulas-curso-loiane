package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o seu salário?");
		double salario = scan.nextDouble();
		double percentual = 0;
		double novoSalario = 0;
		double reajuste = 0;

		if (salario <= 280) {
			percentual = 0.2;
			reajuste = salario * percentual;
			novoSalario = salario * 1.2;
		} else if (salario >= 280 && salario < 700) {
			percentual = 0.15;
			reajuste = salario * percentual;
			novoSalario = salario * 1.15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 0.1;
			reajuste = salario * percentual;
			novoSalario = salario * 1.1;
		} else if (salario >= 1500) {
			percentual = 0.05;
			reajuste = salario * percentual;
			novoSalario = salario * 1.05;
		}

		System.out.println("O valor antes do reajuste R$" + salario + " foi aplicado um valor percentual de "
				+ percentual + ". O valor do aumento R$" + reajuste + " Novo salario após aumento R$" + novoSalario);

	}

}
