package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora: ");
		double valorHora = scan.nextDouble();
		System.out.print("Quantas horas você trabalha no mês: ");
		double horaMes = scan.nextDouble();
		double salarioMes = valorHora * horaMes;

		System.out.println(salarioMes);
	}

}
