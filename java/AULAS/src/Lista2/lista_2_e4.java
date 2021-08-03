package Lista2;

import java.util.Scanner;

public class lista_2_e4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero, pot;
		double rq;
		
		System.out.println("Digite um valor inteiro e positivo: ");
		numero = leia.nextInt();
		leia.nextLine();
		
				if(numero == 0) {
			
					System.out.println("O numero digitado é neutro !!!");
				}
		
				else if((numero%2) == 0) {
					
					System.out.printf("O número digitado é par: %d",numero);
					rq = Math.sqrt(numero);
					System.out.printf("\nE a raiz quadrada é: %.2f",rq);
					//Outra maneira de expressar a raiz quadrada
					//System.out.printf("a raiz quadrada de %f e %f !!!",numero,Math.sqrt(numero));
					
				}
				else if ((numero%2) == 1) {
					System.out.printf("O número digitado é ímpar: %d",numero);
					pot = (int) Math.pow(numero, 2);
					System.out.printf("\n E a potência desse valor é: %d",pot);
				}
				else if(numero < 0) {
					
					System.out.printf("O número digitado é negativo !!!");
				}
				
		
		
		leia.close();
	}

}
