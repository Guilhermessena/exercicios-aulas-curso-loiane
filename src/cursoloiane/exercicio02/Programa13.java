package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("digite um número correspondente ao dia da semana: ");
		int diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("sexta-feira");
			break;
		case 7:
			System.out.println("sabado");
			break;

		default:
			System.out.println("valor invalido");
			break;
		}
	}

}
