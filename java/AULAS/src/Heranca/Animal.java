package Heranca;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private String emiteSom;
	private String locomocao;
	
	public Animal(String nome, int idade, String emiteSom, String locomocao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		this.locomocao = locomocao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}
	
	public void getlocomocao(String locomocao) {
		
		this.locomocao = locomocao;
	}
	
	public void setlocomocao(String locomocao) {
		
		this.locomocao = locomocao;
	}
	
	

}
