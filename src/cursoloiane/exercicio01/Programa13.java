package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Quantas horas você trabalha no mês: ");
		double horaMes = scan.nextDouble();
		double salarioMes = valorHora * horaMes;

		double ir = salarioMes * 0.11;
		double inss = salarioMes * 0.08;
		double sindicato = salarioMes * 0.05;
		double salarioLiquido = salarioMes - ir - inss - sindicato;

		System.out.println("Salário Bruto: R$" + salarioMes + " - Imposto de Renda (11%): R$" + ir + " - INSS (8%): R$"
				+ inss + " - Sindicato (5%): R$" + sindicato + " - Salário Liquido: R$" + salarioLiquido);
	}

}
