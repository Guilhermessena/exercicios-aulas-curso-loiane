package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		int num2 = scan.nextInt();

		int resultado = num1 + num2;
		System.out.println(resultado);
	}

}
