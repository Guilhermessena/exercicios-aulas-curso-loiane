package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite sua senha: ");
		String senha = scan.nextLine();

		while (senha.equalsIgnoreCase(nome)) {
			System.out.println("senha não pode coincidir com nome");
			System.out.print("Digite seu nome: ");
			nome = scan.nextLine();
			System.out.print("Digite sua senha: ");
			senha = scan.nextLine();
		}

		System.out.println("Success!");

	}

}
