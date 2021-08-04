import java.util.Scanner;

public class teste_ed_imp_renda {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		char genero;
		double salario;
		final double imp15 = 0.15;
		final double imp25 = 0.25;
		
		
		System.out.println("Digite o nome completo: ");
		nome = leia.nextLine();
		System.out.println("Como voc� se considera ? M-masculino, F-feminino ou E-neutro");
		genero = leia.next().toUpperCase().charAt(0);
		
		// --------------------------- G�nero---------------------------------------------
		if(genero == 'M') {
			
			System.out.println("Selecionado Masculino\n");
		}
		else if(genero == 'F') {
			
			System.out.println("Selecionado Feminino\n");
		}
		else if(genero == 'E') {
			
			System.out.println("Selecionado G�nero Neutro\n");
		}
		else {
			
			System.out.println("Entrada inv�lida, digite novamente.\n");
			System.out.println("Como voc� se considera ? M-masculino, F-feminino ou E-neutro");
			genero = leia.next().toUpperCase().charAt(0);
		}
		
		//-----------------------------Faixa salarial-----------------------------------------
		System.out.println("Digite o seu sal�rio: ");
		salario = leia.nextDouble();
		
		if(salario < 0) {
			
			System.out.println("Digite um sal�rio v�lido.\n");
			System.out.println("Digite o seu sal�rio: ");
			salario = leia.nextDouble();
		}
		
		else if(salario <= 2000) {
			
			System.out.printf("Caro(a/e) %s, voc� � isento de pagamento.",nome);
		}
		
		else if(salario > 2000 && salario <= 5000) {
			
			System.out.println("Caro(a/e) " +nome+ ", voc� deve pagar 15% de imposto.");
			System.out.printf("O valor a ser pago �: %.2f R$",salario*imp15);
			System.out.printf("\nSal�rio ap�s o imposto aplicado %.2f",salario-salario*imp15);
			
		}
		
		else if(salario > 5000) {
			
			System.out.println("Caro(a/e) "+nome+ ", voc� deve pagar 25% de imposto.");
			System.out.printf("O valor a ser pago �: %.2f R$",salario*imp25);
			System.out.printf("\nSal�rio ap�s o imposto aplicado %.2f",salario-salario*imp25);

		}
		
		
		
		
		
		leia.close();
	}

}
