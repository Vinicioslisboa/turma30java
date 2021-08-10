package entidades;
public final class ContaEstudantil extends Conta{
	
	private double limiteEstudantil;
//----------------------------------------------CONSTRUTORES-------------------------------------
	public ContaEstudantil(int numero, String nomeCliente, double limiteEstudantil) {
		super(numero, nomeCliente);
		this.limiteEstudantil = limiteEstudantil;
	}
//----------------------------------------------ENVELOPAMENTO------------------------------------
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
	public void usarEstudantil (double valor) {
		double auxvalor = 0.0;
		
		if(valor >= limiteEstudantil) {
			
			System.out.println("Você não possui limite suficiente.");
				
		}
		else if (valor>super.getSaldo()) {
			
			auxvalor = valor - super.getSaldo();
			super.credito(auxvalor);
			limiteEstudantil -= auxvalor;
			System.out.println("Novo limte estudantil: "+limiteEstudantil);
		}
		
		
		
	}
	
	

}
