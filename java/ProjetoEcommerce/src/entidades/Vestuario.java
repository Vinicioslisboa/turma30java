package entidades;

public final class Vestuario extends Produto {
	
	private String tamanho;
	private char cor;
	
	public Vestuario(String codigo, String nome, double valor, int estoque, String tamanho, char cor) {
		super(codigo, nome, valor, estoque);
		this.tamanho = tamanho;
		this.cor = cor;
		
	}
	

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public char getCor() {
		return cor;
	}

	public void setCor(char cor) {
		this.cor = cor;
	}
	
	
	
	 
		
		
		
	}
	
	

}
