package cursoloiane.exercicio04;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] a = new int[5];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			a[i] = scan.nextInt();

			b[i] = a[i];
		}

		for (int vetorB : b) {
			System.out.println(vetorB);
		}

//		for (int i = 0; i < a.length; i++) {
//			b [i] = a[i];
//		}

	}

}
