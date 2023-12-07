package aula02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome;
		int opcao;
		float salario, novoSalario, valorAumentado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		
		System.out.println(nome+", digite o código correspondente ao seu cargo: ");
		System.out.println("[1] GERENTE");
		System.out.println("[2] VENDEDOR");
		System.out.println("[3] SUPERVISOR");
		System.out.println("[4] MOTORISTA");
		System.out.println("[5] ESTOQUISTA");
		System.out.println("[6] TÉCNICO DE TI");
		
		opcao = leia.nextInt();
		
		switch(opcao){
	    case 1:
	    	valorAumentado = (salario*10)/100;
	    	novoSalario = valorAumentado + salario;
	    	System.out.println(nome);
	    	System.out.println("GERENTE");
	    	System.out.println("R$"+novoSalario);
	        break;
	    case 2:
	    	valorAumentado = (salario*7)/100;
	    	novoSalario = valorAumentado + salario;
    		System.out.println(nome);
    		System.out.println("VENDEDOR");
    		System.out.println("R$"+novoSalario);
	        break;
	    case 3:
	    	valorAumentado = (salario*9)/100;
	    	novoSalario = valorAumentado + salario;
    		System.out.println(nome);
    		System.out.println("SUPERVISOR");
    		System.out.println("R$"+novoSalario);
	        break;
	    case 4:
	    	valorAumentado = (salario*6)/100;
	    	novoSalario = valorAumentado + salario;
    		System.out.println(nome);
    		System.out.println("MOTORISTA");
    		System.out.println("R$"+novoSalario);
	    	break;
	    case 5:
	    	valorAumentado = (salario*5)/100;
	    	novoSalario = valorAumentado + salario;
    		System.out.println(nome);
    		System.out.println("ESTOQUISTA");
    		System.out.println("R$"+novoSalario);
	    	break;
	    case 6:
	    	valorAumentado = (salario*8)/100;
	    	novoSalario = valorAumentado + salario;
    		System.out.println(nome);
    		System.out.println("TÉCNICO DE TI");
    		System.out.println("R$"+novoSalario);
	    	break;
	    default:
	    	System.out.println("Opção inválida");
	}
		
		
		
		
		
		
		
		
		

	}

}
