package application;

public class Aluno {
	
	//atributos -> parece vari�vel 
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	

	
	
	
	//sobrecarga
	//contrutores 
	//encapsulamento - seguran�a - getters and setters
	//metodos
	public void mostraIdade(){
		
		System.out.println("A idade � "+(2021-anoNascimento));
	}
	
	
	//sobrecarga de metodos
	public void mostraIdade(int anoAtual){
	
		System.out.println("A idade � "+(anoAtual-anoNascimento));
	}
	
	public void mostraIdade(int anoAtual, int anoNascimentoPessoa) {
		
		System.out.println("A idade � "+(anoAtual-anoNascimentoPessoa));

	}

	//polimorfismo
	//heran�a
	//delega��o
	//abstra��o
	//override - annotation
}
	