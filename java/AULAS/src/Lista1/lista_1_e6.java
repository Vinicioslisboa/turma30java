package Lista1;

import java.util.Scanner;

public class lista_1_e6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, d, p1, p2;
		
		System.out.println("Digite o valor de x1: ");
		x1 =leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 =leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 =leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 =leia.nextDouble();
		d = Math.sqrt((Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2)));
		
		System.out.printf("\nA distância é: %.2f",d);
		
		
		leia.close();
	}
	
	
	
}
