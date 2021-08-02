package Lista1;
import java.util.Scanner;

public class lista_1_e8 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double cc, cf,porcentagemDistribuidor;
		
		//cf+porcentagemDistribuidor+imp
		System.out.println("Informe o custo de fábrica: ");
		cf = leia.nextDouble();
		
		cc = ((cf*28/100) + (cf*45/100)+cf);
		
		System.out.println("O valor final ao consumidor é: "+cc);
		
		
		leia.close();
	}

}
