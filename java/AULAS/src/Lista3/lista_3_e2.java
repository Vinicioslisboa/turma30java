package Lista3;

import java.util.Scanner;

public class lista_3_e2 {
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero=0,x, contadorPar=0, contadorImpar=0;
	//----------------------------------entradas------------------------------------	
		
		for(x = 0 ; x <= 2 ; x++) {
			
			System.out.println("Digite o valor:");
			numero = leia.nextInt();
			
			if(numero%2==0) {
				
				contadorPar++;
			}
			
			if(numero%2==1) {
				
				contadorImpar++;
			}
			
			}
		
		System.out.printf("A quantidade de n�meros pares foi: %d\n",contadorPar);
		System.out.printf("A quantidade de n�meros �mpares foi: %d",contadorImpar);
			
		

		
		
		
	}

}
