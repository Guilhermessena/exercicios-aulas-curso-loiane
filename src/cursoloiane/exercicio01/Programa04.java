package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a nota do primeiro bimestre: ");
		int bim1 = scan.nextInt();
		System.out.print("Digite a nota do segundo bimestre: ");
		int bim2 = scan.nextInt();
		System.out.print("Digite a nota do terceiro bimestre: ");
		int bim3 = scan.nextInt();
		System.out.print("Digite a nota do quarto bimestre: ");
		int bim4 = scan.nextInt();

		double media = (double) (bim1 + bim2 + bim3 + bim4) / 4;
		System.out.println(media);
	}

}
