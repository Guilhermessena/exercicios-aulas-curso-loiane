package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double mediaAlunos = 0;
		int somaAlunos = 0;

		System.out.println("Digite o número de turmas");
		int turmas = scan.nextInt();

		for (int i = 0; i < turmas; i++) {
			System.out.println("Quantos alunos há nessa turma: ");
			int numAlunos = scan.nextInt();

			somaAlunos += numAlunos;
		}

		mediaAlunos = somaAlunos / turmas;

		System.out.println(mediaAlunos);

	}

}
