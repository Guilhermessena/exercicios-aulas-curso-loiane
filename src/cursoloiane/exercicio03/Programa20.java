package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas pessoas irão dizer sua idade? ");
		int nPessoas = scan.nextInt();
		int idade = 0;
		int soma = 0;
		double media = 0;

		for (int i = 0; i < nPessoas; i++) {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			soma += idade;
		}
		media = (double) soma / nPessoas;

		System.out.println("media: " + media);

		if (media > 0 && media <= 25) {
			System.out.println("jovem");
		} else if (media > 25 && media <= 60) {
			System.out.println("adulto");
		} else if (media > 60) {
			System.out.println("idoso");
		}

	}

}
