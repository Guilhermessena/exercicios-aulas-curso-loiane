package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Quantas horas você trabalha no mês: ");
		double horaMes = scan.nextDouble();
		double salarioBruto = valorHora * horaMes;
		double ir = 0;
		double inss = 10;
		double sindicato = 3;
		double fgts = 11;

		if (salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			ir = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			ir = 10;
		} else {
			ir = 20;
		}

		double salarioLiquido = salarioBruto
				- ((salarioBruto * (ir / 100)) + (salarioBruto * (inss / 100)) + (salarioBruto * (fgts / 100)));
		double totalDescontos = (salarioBruto * (ir / 100)) + (salarioBruto * (inss / 100))
				+ (salarioBruto * (fgts / 100)) + (salarioBruto * (sindicato / 100));

		System.out.println("Salário Bruto:  (" + valorHora + " * " + horaMes + ")    : R$" + salarioBruto);
		System.out.println("(-) IR (" + ir + "%)                     : R$" + (salarioBruto * (ir / 100)));
		System.out.println("(-) INSS (" + inss + "%)                  : R$" + (salarioBruto * (inss / 100)));
		System.out.println("FGTS (" + fgts + "%)                      : R$" + (salarioBruto * (fgts / 100)));
		System.out.println("TOTAL DE DESCONTOS                : R$" + totalDescontos);
		System.out.println("SALÁRIO LIQUIDO                   : R$" + salarioLiquido);

	}

}
