import java.util.Scanner;

public class IMC {

//------------------------------------function--------------------------------

	static void escrevaln(String texto) {

		System.out.println(texto);
	}

	static void linha() {

		System.out.println("------------------------------------------------");
	}

//--------------------------------------API-------------------------------------	

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double peso, altura, imc;
		String nome;
		
		escrevaln("Digite seu nome: ");
		nome = leia.next();
		linha();
		
		escrevaln("Digite seu peso: ");
		peso = leia.nextDouble();
		linha();
			
while(peso <= 0) {
	
	escrevaln("Digite um valor positivo maior que zero:");
	peso = leia.nextDouble();
	linha();
	
} 

escrevaln("Digite sua altura: ");
altura = leia.nextDouble();
linha();

while(altura <= 0) {
	
	escrevaln("Digite um valor positivo maior que zero:");
	altura = leia.nextDouble();
	linha();
}

		
		imc = peso / (Math.pow(altura, 2));

		System.out.printf("Olá %s, o seu IMC atual é: %.2f m²\n",nome, imc);
		linha();

		leia.close();

	}

}
