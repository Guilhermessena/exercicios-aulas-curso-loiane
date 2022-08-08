package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Telefonou para a vitima?");
		String resposta1 = scan.next();
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		System.out.println("Mora perto da vitima?");
		String resposta3 = scan.next();
		System.out.println("Devia para a vitima?");
		String resposta4 = scan.next();
		System.out.println("Ja trabalhou com a vitima?");
		String resposta5 = scan.next();

		int cont = 0;

		if (resposta1.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta2.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta3.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta4.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resposta5.equalsIgnoreCase("sim")) {
			cont++;
		}

		switch (cont) {
		case 2:
			System.out.println("suspeita");
			break;
		case 3:
		case 4:
			System.out.println("cumplice");
			break;
		case 5:
			System.out.println("assassino");
			break;
		default:
			System.out.println("inocente");
			break;
		}
	}

}
