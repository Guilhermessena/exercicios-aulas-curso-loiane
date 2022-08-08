package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa19 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] alunos = new int[10];
		double[] nota1 = new double[alunos.length];
		double[] nota2 = new double[alunos.length];
		double[] result = new double[alunos.length];
		double somaNotas = 0;
		String[] situacao = new String[alunos.length];

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite as notas do aluno: ");
			nota1[i] = scan.nextInt();
			nota2[i] = scan.nextInt();
			somaNotas = nota1[i] + nota2[i];
			result[i] = somaNotas / 2;
			if (result[i] >= 7.0) {
				situacao[i] = "Aprovado";
			} else {
				situacao[i] = "Reprovado";
			}
		}

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno " + (i + 1) + " Nota1: " + nota1[i] + " Nota2: " + nota2[i] + " Media: "
					+ result[i] + " Situacao: " + situacao[i]);
		}
	}
}
