package Lista1;
import java.util.Scanner;

public class lista_1_e1 {
	
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int anos, mes, dias;
		
		System.out.println("Informe a sua idade: ");
		anos = leia.nextInt();
		System.out.println("Informe quantos meses: ");
		mes = leia.nextInt();
		System.out.println("Informe quantos dias: ");
		dias = leia.nextInt();
		
		dias =(dias+(anos*365)+(mes*30));
		
		System.out.println("A sua idade em dias é: "+dias);
		
		
		
		
		leia.close();
	}

}
