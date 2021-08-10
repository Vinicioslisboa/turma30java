package classes;

public class Porco implements Sons {
	
	private boolean pesado;

	public Porco(boolean pesado) {
		super();
		this.pesado = pesado;
	}

	@Override
	public void somAlto() {
		System.out.println("Ronc Ronc");
	}

	@Override
	public void somBaixo() {
		System.out.println("rinc rinc");		
	}
	
	
	
	

}
