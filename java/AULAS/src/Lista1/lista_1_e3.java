package Lista1;
import java.util.Scanner;

public class lista_1_e3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int segundos, minutos, horas, seg=0;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		seg = leia.nextInt();
				
		horas = (seg/3600);
		minutos = (seg%3600)/60;
		segundos = (seg%3600)%60;
		
		System.out.println("O tempo do evento é "+horas+" hora(s) "+minutos+" minuto(s) e "+segundos+" segundo(s)");
		
				
		
		leia.close();
	}
	
		
	
	

}
