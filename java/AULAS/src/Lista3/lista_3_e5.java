package Lista3;
import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
//No final, mostre a soma dos números digitados.
public class lista_3_e5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, somaNumero=0;
		
		do {
			System.out.println("Digite um numero positivo: ");
			numero = leia.nextInt();
			somaNumero += numero;
			
		}while (numero > 0);
		
		System.out.printf("A soma dos numero digitados é: %d",somaNumero);
	
	}
	
}
