package entidades;

public class ContaPoupanca extends Conta{
	
	private int diaAniversarioPoupanca;
	private double somaCorrecao;
	
	public ContaPoupanca(int numero, String nomeCliente,int diaAniversarioPoupanca) {
		super(numero, nomeCliente);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}



	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public void somaCorrecao(int diaAtual)
	{
		if(diaAtual == this.diaAniversarioPoupanca)
		{
			credito(super.getSaldo()*0.005);
		}
	}

	public double getSomaCorrecao() {
		return somaCorrecao;
	}



	public void setSomaCorrecao(double somaCorrecao) {
		this.somaCorrecao = somaCorrecao;
	}
	
	
	
	

}