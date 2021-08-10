package entidades;

public class ContaCorrente extends Conta{
private int  contatorTalao;
	
	public ContaCorrente(int numero, String nomeCliente, int contatorTalao) {
		super(numero, nomeCliente);
		this.contatorTalao = contatorTalao;
	}

	public int getContatorTalao() {
		return contatorTalao;
	}

	public void setContatorTalao(int contatorTalao) {
		this.contatorTalao = contatorTalao;
	}

	public void  pedirTalao() {
		
		this.contatorTalao++;
		
		if (contatorTalao==3 ){
			
			System.out.print("limite de cheque atingidos" );
		}
		else {
			super.debito(30.00);
		}
		
	}
	
}