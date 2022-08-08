package cursoloiane.exercicio03;

import java.util.Scanner;

public class Programa17 {

	public static void main(String[] args) {
		System.out.print("Informa um valor fatorial: ");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int fatorial = 1;

	for (int i = 1; i <= num; i++) {
		fatorial *= i;
	}

	System.out.println(+num + "! = " + fatorial);


	}

}
