package Lista1;
import java.util.Scanner;

public class lista_1_e4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A,B,C,D,R,S;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
				
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = (int)Math.pow((A+B),2);
		S = (int)Math.pow((B+C),2);
		D = (R+S)/2;
		
		System.out.println("O valor de R é: "+R);
		System.out.println("O valor de S é: "+S);
		System.out.println("O valor de D é: "+D);
		
		
		
		
		
		leia.close();		
	}

}
