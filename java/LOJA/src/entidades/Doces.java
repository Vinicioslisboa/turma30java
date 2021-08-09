package entidades;

public class Doces extends Produto {
	
	private String Fabricante;

	public Doces(String codigo, String nome, double valor, int estoque, String fabricante) {
		super(codigo, nome, valor, estoque);
		Fabricante = fabricante;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	
	

}
