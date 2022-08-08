package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		while (nome.length() <= 3) {
			System.out.println("nome precisa ser maior que 3 caracteres");
			System.out.print("Digite seu nome: ");
			nome = scan.nextLine();
		}

		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		while (idade > 150 || idade < 0) {
			System.out.println("idade precisa ser maior que 0 e menor que 150");
			System.out.print("Digite seu nome: ");
			idade = scan.nextInt();
		}

		System.out.print("Digite seu salario: ");
		double salario = scan.nextDouble();
		while (salario < 0) {
			System.out.println("salario precisa ser maior que 0");
			System.out.print("Digite seu salario: ");
			salario = scan.nextDouble();
		}

		System.out.print("Digite seu sexo: ");
		String sexo = scan.next();
		while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
			System.out.println("informe o sexo correto");
			System.out.print("Digite seu sexo: ");
			sexo = scan.nextLine();
		}

		System.out.print("Digite seu estado civil: ");
		String estadoCivil = scan.next();
		while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")
				&& !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("informe o estado civil correto");
			System.out.print("Digite seu estado civil: ");
			estadoCivil = scan.nextLine();
		}

		System.out.println("Success!");

	}

}
