package Lista1;
import java.util.Scanner;

public class lista_1_e5{

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double primeiraNota=0, segundaNota=0, terceiraNota=0, media;
		
		System.out.println("Digite a primeira nota: ");
		primeiraNota = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		segundaNota = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		terceiraNota = leia.nextDouble();
		
		media = ((primeiraNota*2)+(segundaNota*3)+(terceiraNota*5))/10;
		
		System.out.println("Sua média é: "+media);
		
		
		
	
		
	leia.close();
	}
}
