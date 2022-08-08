package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("informe a base numero: ");
		int base = scan.nextInt();
		System.out.print("informe o expoente numero: ");
		int expoente = scan.nextInt();

		int potencia = 1;

		for (int i = 0; i < expoente; i++) {
			potencia *= base;
		}

		System.out.println("a potência " + base + "^" + expoente + " = " + potencia);
	}

}
