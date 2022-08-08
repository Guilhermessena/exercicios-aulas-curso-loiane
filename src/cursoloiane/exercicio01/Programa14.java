package cursoloiane.exercicio01;

import java.util.Scanner;

public class Programa14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Tammanho do arquivo para download: ");
		double download = scan.nextDouble();
		System.out.print("Velocidade de um link de internet: ");
		double velocidade = scan.nextDouble();
		velocidade = velocidade / 8;

		double tempoSegundos = download / velocidade;
		double tempoMinutos = (Math.abs(tempoSegundos / 60));
		System.out.println(tempoMinutos);

	}

}
