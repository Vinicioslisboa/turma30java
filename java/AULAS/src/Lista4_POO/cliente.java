package Lista4_POO;

import java.util.Scanner;

public class cliente {
	
	//Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	//em seguida crie um objeto cliente, defina as instancias deste objeto e 
	//apresente as informações deste objeto no console.
	
	Scanner leia = new Scanner(System.in);
	public String nome;
	public String numeroMatricula;
	public int idade;
	public int dataRegistro;
	public boolean confirmar;
	
	public void matricula(String numeroMatricula) {
		
		
	}
	
	public void idade (int anoAtual, int anoNascimento) {
		
		idade = anoAtual - anoNascimento;
		System.out.println(idade+" anos");
	}
	
	public void dataRegistro(int dia, int mes, int ano) {
		
		System.out.println("Digite o dia do registro: ");
		dia = leia.nextInt();
		
		System.out.println("Digite o mês do registro: ");
		mes = leia.nextInt();
		
		System.out.println("Digite o ano do registro: ");
		ano = leia.nextInt();
		
		System.out.println("O dia do registro foi: "+dia+"/"+mes+"/"+ano);
		
		if(confirmar==(true)) {
			confirmar = leia.hasNext();
			
			
		}
		System.out.println("Confirmar ? S/N ");
		confirmar = leia.hasNext();
	}
	
	
}
