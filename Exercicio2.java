package aula02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		num = leia.nextInt();
		
		if (num % 2 == 0 && num > 0){
			System.out.println("O número "+num+" é par e positivo!");	 
		}
		if (num % 2 == 0 && num < 0){
			System.out.println("O número "+num+" é par e negativo!");	 
		}
		if (num % 2 == 1){
			System.out.println("O número "+num+" é ímpar e positivo!");	 
		}
		if (num % 2 == -1){
			System.out.println("O número "+num+" é ímpar e negativo!");	  
		}

	}

}
