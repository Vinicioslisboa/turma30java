package application;

public class Aluno {
	
	//atributos -> parece variável 
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	

	
	
	
	//sobrecarga
	//contrutores 
	//encapsulamento - segurança - getters and setters
	//metodos
	public void mostraIdade(){
		
		System.out.println("A idade é "+(2021-anoNascimento));
	}
	
	
	//sobrecarga de metodos
	public void mostraIdade(int anoAtual){
	
		System.out.println("A idade é "+(anoAtual-anoNascimento));
	}
	
	public void mostraIdade(int anoAtual, int anoNascimentoPessoa) {
		
		System.out.println("A idade é "+(anoAtual-anoNascimentoPessoa));

	}

	//polimorfismo
	//herança
	//delegação
	//abstração
	//override - annotation
}
	