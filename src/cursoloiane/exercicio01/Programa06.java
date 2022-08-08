package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio de um circulo");
		double r = scan.nextDouble();
		double areaCirculo = Math.PI * Math.pow(r, 2);
		System.out.println(areaCirculo);
	}

}
