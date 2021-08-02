import java.util.Locale;
import java.util.Scanner;

public class celsius_fahe {
	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double tc;
		double tf;
		
		System.out.println("Digite a temperatura em celsius: ");
		tc = leia.nextDouble();
				tf = (tc*1.8) + 32;
						
		System.out.println("A temperatura em fahrenheit é: "+tf+"°");
		leia.close();
	}

}
