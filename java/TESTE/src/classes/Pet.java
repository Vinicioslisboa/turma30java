package classes;

public class Pet {
	
	private String raca;
	private char porte;
	private int anoNascimento;
	
	
	public Pet(String raca) {
		super();
		this.raca = raca;
	}
	
	public Pet(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	//-----------------------------------------Metodos----------------------------------------------

	public void emiteSom() {
		System.out.println("Emitindo o som do bicho....");
	}
	
	public int idade() {
		return (2021 - anoNascimento);
	}

	
	
	
}
