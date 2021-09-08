import java.util.Scanner;

public class IMC {

//------------------------------------function--------------------------------

	static void escrevaln(String texto) {

		System.out.println(texto);
	}

	static void linha() {

		System.out.println("---------------------------------------------------------------------------");
	}

//--------------------------------------API-------------------------------------	

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double peso, altura, imc;
		
		escrevaln("Digite seu peso: ");
		peso = leia.nextDouble();
		linha();
			
if(peso <= 0) {
	
	escrevaln("Digite um valor número positivo maior que zero:");
	peso = leia.nextDouble();
	linha();
	
} 
	
	escrevaln("Digite sua altura: ");
	altura = leia.nextDouble();
	linha();


		
		imc = peso / (Math.pow(altura, 2));

		System.out.printf("O seu IMC atual é: %.2f m²\n", imc);
		linha();

		leia.close();

	}

}
