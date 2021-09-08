package Lista1;
import java.util.Scanner;

public class lista_1_e1 {
	//Funções
	static void escrevaPL(String texto) {
	
		System.out.println(texto);
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		int anos, mes, dias;
		
		escrevaPL("Informe a sua idade: ");
		anos = leia.nextInt();
		escrevaPL("Informe quantos meses: ");
		mes = leia.nextInt();
		escrevaPL("Informe quantos dias: ");
		dias = leia.nextInt();
		
		dias =(dias+(anos*365)+(mes*30));
		
		escrevaPL("A sua idade em dias é: "+dias);
		
		
		
		
		leia.close();
	}

}
