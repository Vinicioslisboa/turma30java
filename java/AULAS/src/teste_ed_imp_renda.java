import java.util.Scanner;

public class teste_ed_imp_renda {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		char genero;
		double salario;
		
		System.out.println("Digite o nome completo: ");
		nome = leia.nextLine();
		System.out.println("Como voc� se considera ? M-masculino, F-feminino ou E-neutro");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o seu sal�rio: ");
		salario = leia.nextDouble();
		
		if(salario <= 2000) {
			
			System.out.printf("Caro(a/e) %s, voc� � isento de pagamento.",nome);
		}
		
		else if(salario > 2000 && salario <= 5000) {
			
			System.out.printf("Caro(a/e) %s, voc� deve pagar 15% de imposto.",nome);
		}
		
		else if(salario > 5000) {
			
			System.out.printf("Caro(a/e) %s, voc� deve pagar 25% de imposto.",nome);
		}
		
		
		
		
		
		leia.close();
	}

}
