package Lista3;

import java.util.Scanner;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

public class lista_3_e3 {
	
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade=1, totalMenor21Anos=0, totalMaior50Anos, contador21=0, contador50=0;
		
		while(idade != -99) {
			
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
			
			
		if(idade <= 0 && idade != -99) {
			
			System.out.println("\nDigite uma idade válida !\n");
			
		}
		
		if(idade < 21 && idade>0) {
			
			contador21++;
		}
		
		if(idade > 50) {
			
			contador50++;
		}
		
		
		
	
		}
		System.out.printf("\nO numero de pessoas menores de 21 anos foram: %d\n",contador21);
		System.out.printf("O numero de pessoas maiores de 50 anos foram: %d",contador50);
		
	}
	
	

}
