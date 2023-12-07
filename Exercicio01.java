package aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int A, B, C, soma; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		A = leia.nextInt();
		
		System.out.println("Digite um valor: ");
		B = leia.nextInt();
		
		System.out.println("Digite um valor: ");
		C = leia.nextInt();
		
		soma = (A + B);
		
		if (soma > C) {
			System.out.println("A soma de A + B é maior do que C");
		}
	}
}
