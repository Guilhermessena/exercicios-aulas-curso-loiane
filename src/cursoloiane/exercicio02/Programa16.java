package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("digite o valor de \"a\" : ");
		int a = scan.nextInt();
		int b = 0;
		int c = 0;
		double delta;

		if (a != 0) {
			System.out.print("digite o valor de \"b\" : ");
			b = scan.nextInt();
			System.out.print("digite o valor de \"c\" : ");
			c = scan.nextInt();
			System.out.println(a + "x� + " + b + "x + " + c);
			delta = ((Math.pow(b, 2)) - (4 * a * c));

			if (delta < 0) {
				System.out.println("A equa��o n�o possui  raizes reais");
			} else if (delta == 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.println("delta = " + delta);

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				System.out.println("A equa��o possui apenas uma raiz real");
			} else if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.println("delta = " + delta);

				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				System.out.println("A equa��o possui duas raizes reais");
			}
		} else {
			System.out.println("Se A = 0 n�o existe equa��o do segundo grau");
		}

	}

}
