package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int produto, quantidade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("**************  MENU  **************");
		System.out.println("[1] CACHORRO QUENTE: R$10,00");
		System.out.println("[2] X-SALADA: R$15,00");
		System.out.println("[3] X-BACON: R$18,00");
		System.out.println("[4] BAURU: R$12,00");
		System.out.println("[5] REFRIGERANTE: R$8,00");
		System.out.println("[6] SUCO DE LARANJA: R$13,00");
		System.out.println(" ");
		
		System.out.println("Digite o codigo do produto: ");
		produto = leia.nextInt();

		System.out.println("Digite a quantidade");
		quantidade = leia.nextInt();

		switch (produto) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total da compra: " + (quantidade * 10.00));
			break;
		case 2:
			System.out.println("Produto: X-salada");
			System.out.println("Valor total da compra: " + (quantidade * 15.00));
			break;
		case 3:
			System.out.println("Produto: X-bacon");
			System.out.println("Valor total da compra: " + (quantidade * 18.00));
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total da compra: " + (quantidade * 12.00));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total da compra: " + (quantidade * 8.00));
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total da compra: " + (quantidade * 13.00));
			break;
		default:
			System.out.println("Opção invalida");

		}

	}

}
