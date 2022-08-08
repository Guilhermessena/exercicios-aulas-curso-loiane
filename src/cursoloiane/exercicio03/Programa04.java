package cursoloiane.exercicio03;

public class Programa04 {

	public static void main(String[] args) {

		double paisA = 80000;
		double crescAnualA = 1.03;
		double paisB = 200000;
		double crescAnualB = 1.015;
		int anos = 0;

		while (paisA < paisB) {
			paisA = paisA * crescAnualA;
			paisB = paisB * crescAnualB;
			anos++;
		}
		System.out.println("anos necessários para a população A ultrapassar a população B: " + anos);
	}

}
