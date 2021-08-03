package Lista2;
import java.util.Scanner;

public class lista_2_e2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double n1=0.00,n2=0.00,n3=0.00;
		
		System.out.println("Digite o primeiro valor: ");
		n2 = leia.nextDouble();
		System.out.println("Digite o segundo valor: ");
		n2 = leia.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		n3 = leia.nextDouble();

	
		if(n1 > n2 && n1 > n3 && n2 > n3) {
			
			System.out.printf("n1 %f",n1,"> n2 %f",n2," >n3 %f",n3);
		}
		else if(n2 > n1 && n2 > n3 && n1 > n3) {
			
			System.out.printf("n2 %.2f",n2,"> n1 %.2f",n1," >n3 %.2f",n3);

		}
		
		
		
		leia.close();
	}

}
