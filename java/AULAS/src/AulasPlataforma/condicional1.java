package AulasPlataforma;

import java.util.Scanner;

public class condicional1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade: ");
		idade=leia.nextInt();
		leia.nextLine(); // Limpar buffer
		System.out.printf("Entre com o seu nome: ");
		nome=leia.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade," anos");
		
		if(idade>=18) {
		
			System.out.println("\nVocê é maior de idade !!!");
		}
		else if(idade>=1 && idade<18) {
			
			System.out.println("\nVocê é menor de idade !!!");
		}
		else {
			
			System.out.println("\nIdade digitada inválida");
		}
		
		
		
		leia.close();
	}

}
