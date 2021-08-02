package Lista1;
import java.util.Scanner;

public class lista_1_e2 {
	
	public static void main(String[] args)	{
		Scanner leia = new Scanner(System.in);
		int dia, dias, mes, anos;
		
		System.out.println("Informa sua idade em dias: ");
		dias = leia.nextInt();
				
		anos=(dias/365);
		mes=(dias%365)/30;
		dia=(dias%365)%30;
		
		System.out.println("Você hoje tem "+anos+" ano(s) "+mes+" mes(es) "+dia+" dia(s) ");
		
		
		leia.close();
	}

}
