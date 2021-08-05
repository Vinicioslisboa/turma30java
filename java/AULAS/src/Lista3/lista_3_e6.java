package Lista3;

import java.util.Scanner;
//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
public class lista_3_e6 {
	
	public static void main(String[] args) {
//---------------------------------------------var----------------------------------------------------
		
		Scanner leia = new Scanner(System.in);
		int numero, mediaMultiplos3, multiplos3=0, contadorMultiplo3=0;
		
//----------------------------------------------Entradas----------------------------------------------
		do {
			
		System.out.println("Digite o valor: ");
		numero = leia.nextInt();
		
		
		if(numero%3==0) {
			
			multiplos3 += numero;
			contadorMultiplo3++;
		}

		mediaMultiplos3 = multiplos3/contadorMultiplo3;
		
		}while(numero > 0);
		
		System.out.printf("A media dos valores multiplos de 3 é: %d",contadorMultiplo3++);
	}

}
