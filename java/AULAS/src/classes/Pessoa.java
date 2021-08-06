package classes;

public class Pessoa {
	
	
	//Atributos
	private String nome;
	private int anoNascimento;
	private String cpf;
	private char pronome; //M,F,E
	private boolean ativo;
	
	//Construtores
	public Pessoa(String nome) {
		this.nome = nome;
		
	}
	
	
	
	
	
	
	//Métodos
	
	public void mostrarIdade() {
		
		System.out.println(2021 - anoNascimento);
		
	}
	
	public int calcIdade(int anoAtual) {
		
		
		return anoAtual - anoNascimento;
	}
	
	

}
