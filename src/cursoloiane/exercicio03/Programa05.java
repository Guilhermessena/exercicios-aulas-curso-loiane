package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a popula�ao do pais A: ");
		double paisA = scan.nextDouble();
		while (paisA < 0) {
			System.out.println("ERROR: digite um n�mero maior que 0");
			System.out.print("Digite novamente a popula�ao do pais A: ");
			paisA = scan.nextDouble();
		}
		System.out.print("Digite a taxa anual de crescimento do pais A: ");
		double porcentagemA = scan.nextDouble();
		while (porcentagemA < 0) {
			System.out.println("ERROR: digite um n�mero maior que 0");
			System.out.print("Digite novamente a taxa anual de crescimento do pais A: ");
			porcentagemA = scan.nextDouble();
		}
		double crescAnualA = 1 + (porcentagemA / 100);

		System.out.print("Digite a popula�ao do pais B: ");
		double paisB = scan.nextDouble();
		while (paisB < 0) {
			System.out.println("ERROR: digite um n�mero maior que 0");
			System.out.print("Digite novamente a popula�ao do pais B: ");
			paisB = scan.nextDouble();
		}
		System.out.print("Digite a taxa anual de crescimento do pais B: ");
		double porcentagemB = scan.nextDouble();
		while (porcentagemB < 0) {
			System.out.println("ERROR: digite um n�mero maior que 0");
			System.out.print("Digite novamente a popula�ao do pais B: ");
			porcentagemB = scan.nextDouble();
		}
		double crescAnualB = 1 + (porcentagemB / 100);
		int anos = 0;

		while (paisA < paisB) {
			paisA = paisA * crescAnualA;
			paisB = paisB * crescAnualB;
			anos++;
		}
		System.out.println("anos necess�rios para a popula��o A ultrapassar a popula��o B: " + anos);
	}

}
