package entidades;

public class Produto {
	
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	
	
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}


	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque < 0) {
			this.estoque = 0;
		}
		else {
			
			this.estoque = estoque;
		}
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getEstoque() {
		return estoque;
	}


	/*public void setEstoque(int estoque) {
		this.estoque = estoque;
	}*/
	
	public void incluiEstoque (int quantidade) {
		if(quantidade < 0) {
			System.out.println("Digite uma quantia válida.");
		}
		else {
			this.estoque += quantidade;
		}
		
	}
	
	public void retiraEstoque (int quantidade) {
		if(quantidade > estoque) {
			
			System.out.println("Quantidade indisponível.");
		}
		else {
			
			this.estoque -= quantidade;
		}
	}
	
	
	
	
	}
	


