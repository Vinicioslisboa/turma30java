package entidades;

public class ContaEmpresa extends Conta{

	
	private double emprestimoEmpresa;
	
	public ContaEmpresa(int numero, String nomeCliente, double emprestimoEmpresa) {
		super(numero, nomeCliente);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void pedirEmprestimo(double emprestimoPedido) {
		if(emprestimoPedido > emprestimoEmpresa || emprestimoPedido <= 0) {
			System.out.println("Não temos o valor pedido para o empréstimo.");
		}
		else {
			this.emprestimoEmpresa -= emprestimoPedido;
			super.credito(emprestimoPedido);
		}
	}
	
}