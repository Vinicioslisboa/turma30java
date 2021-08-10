package entidades;

public abstract class Conta {
	
	private int numero;
	private String nomeCliente;
	private double saldo;
//----------------------------------------------CONSTRUTORES-------------------------------------------
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		
		
	}
//--------------------------------------------ENCAPSULAMENTO-----------------------------------------
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//-------------------------------------------MÉTODOS---------------------------------------------
	
	public void debito(double valor) {
		if(valor < 0) {
		if(valor > saldo) {
			
			System.out.println("Você não possui saldo suficiente.");
		}
		else {
		
		this.saldo -= valor;
		
		}}
	}
		
	public void credito(double valor) {
		if(valor < 0) {
			System.out.println("Você não pode efetuar esse tipo de operação.");
		}
		else {
			
		this.saldo += valor;
	}
		
		
	}


	
	

}
