package classes;

public class Cachorro extends Pet {
	
	private boolean latidoAlto;
//---------------------------------------Construtores--------------------------------------------
	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto = latidoAlto;
	}
	
	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}

//---------------------------------------Encapsulamento------------------------------------------

	public boolean isLatidoAlto() {
		return latidoAlto;
	}


	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}

//----------------------------------------Metodos-------------------------------------------------

	@Override
	public void emiteSom() {
		System.out.println("AU AU AU AU AU");
	}

}
