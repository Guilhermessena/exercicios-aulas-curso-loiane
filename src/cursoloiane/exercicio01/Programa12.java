package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua altura: ");

		double altura = scan.nextDouble();
		double imc = (double) (72.7 * altura) - 58;
		System.out.println(imc);
	}

}
