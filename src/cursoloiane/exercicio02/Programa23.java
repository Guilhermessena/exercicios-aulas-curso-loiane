package cursoloiane.exercicio02;

import java.util.Scanner;

public class Programa23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Qual carne deseja escolher: ");
		System.out.println("File Duplo - Alcatra - Picanha");
		String tipo = scan.next();
		System.out.println("Quantos Kg da carne escolhida: ");
		double kgCarne = scan.nextDouble();
		double precoKg = 0;
		double valorTotal = 0;

		if (tipo.equalsIgnoreCase("file duplo")) {
			if (kgCarne < 5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
		}

		if (tipo.equalsIgnoreCase("alcatra")) {
			if (kgCarne < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
		}

		if (tipo.equalsIgnoreCase("picanha")) {
			if (kgCarne < 5) {
				precoKg = 6.9;
			} else {
				precoKg = 7.8;
			}
		}

		valorTotal = precoKg * kgCarne;
		double desconto = 0;
		double valorFinal = valorTotal;

		System.out.println("Como sera a forma de pagamento?");
		String pagamento = scan.next();
		if (pagamento.equalsIgnoreCase("cartao")) {
			desconto = valorTotal * 0.05;
			valorFinal = valorTotal - desconto;
		}

		System.out.println("cupom fiscal");
		System.out.println("Tipo: " + tipo);
		System.out.println("Quantidade: " + kgCarne);
		System.out.println("Valor total: " + valorTotal);
		System.out.println("Tipo pagamento: " + pagamento);
		System.out.println("Valor desconto: " + desconto);
		System.out.println("Valor a pagar: " + valorFinal);

	}

}
