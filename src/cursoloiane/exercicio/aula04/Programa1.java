package cursoloiane.exercicio.aula04;

public class Programa1 {

	public static void main(String[] args) {
		int i = 1;
		int max = 10;

		while (i < max) {
			System.out.println("o valor de \"i\" vale: " + i);
			i++;
		}

		System.out.println(i);
		do {
			i++;
			System.out.println("o valor de \"i\" vale: " + i);
		} while (i < 15);

		System.out.println(i);

	}

}
