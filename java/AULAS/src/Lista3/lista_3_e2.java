package Lista3;

import java.util.Scanner;

public class lista_3_e2 {
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero=0,x;
	//----------------------------------entradas------------------------------------	
		for(x = 0 ; x <= 2 ; x++) {
			
			System.out.println("Digite o valor:");
			numero = leia.nextInt();
			
			}
		
		if(numero%2 == 0) {
			
			System.out.printf("%d",numero);
			
		}
		
		else {
			
			System.err.printf("%d",numero);
			
		}
		
		
		
		
	}

}
