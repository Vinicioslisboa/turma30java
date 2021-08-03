package Lista2;

import java.util.Scanner;

public class lista_2_e1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3 ;
		
		System.out.println("Digite o primeiro valor: ");
		n1 =leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 =leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		n3 =leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			
			System.out.printf("O maior valor é n1: %d",n1);
		}
		else if(n2 > n1 && n2 > n3) {
			
			System.out.printf("O maior valor é n2: %d",n2);

		}
		else {
			System.out.printf("O maior valor é n3: %d",n3);

		}
		
		leia.close();
	}

}
