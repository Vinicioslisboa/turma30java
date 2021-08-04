import java.util.Scanner;

public class TesteEnquanto {
	
	public static void main(String[] args) {
		
		//---------------------------------Variaveis------------------------------------
		Scanner leia = new Scanner(System.in);   //Estanciar teclado (criar)
		String nome, nomeMaiorSalario="";        //String uma classe = estanciar
		double salario=1.00, maiorSalario=0.00;  //double, int = tipo = Criar
		
		//---------------------------------Entradas--------------------------------------
		
		while(salario > 0) {
			
			System.out.print("Digite o nome: ");
			nome = leia.nextLine();
			System.out.print("Digite o salário: ");
			salario = leia.nextDouble();
			leia.nextLine();  //limpar o buffer
			
			if (salario > maiorSalario) {
				
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			
		}
		System.out.println();
		System.out.printf("O maior salário é %.2f da pessoa %s",maiorSalario,nomeMaiorSalario);
		
		leia.close();
	}

}
