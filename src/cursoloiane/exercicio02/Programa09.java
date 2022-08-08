package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro preço: ");
		int valor1 = scan.nextInt();
		System.out.print("Digite o segundo preço: ");
		int valor2 = scan.nextInt();
		System.out.print("Digite o terceiro preço: ");
		int valor3 = scan.nextInt();

		if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);
		} else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
			System.out.println(valor1);
			System.out.println(valor3);
			System.out.println(valor2);
		} else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
			System.out.println(valor2);
			System.out.println(valor1);
			System.out.println(valor3);
		} else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
			System.out.println(valor2);
			System.out.println(valor3);
			System.out.println(valor1);
		} else if (valor3 > valor1 && valor3 > valor2 && valor2 > valor1) {
			System.out.println(valor3);
			System.out.println(valor2);
			System.out.println(valor1);
		} else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
			System.out.println(valor3);
			System.out.println(valor1);
			System.out.println(valor2);
		} else {
			System.out.println("possuem valores iguais");
		}

	}

}
