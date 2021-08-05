package Lista3;

import java.util.Scanner;

public class lista_3_e2 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
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
		
		System.out.printf("A quantidade de números pares foi: %d\n",contadorPar);
		System.out.printf("A quantidade de números ímpares foi: %d",contadorImpar);
			
		

		
		
		
	}

}
