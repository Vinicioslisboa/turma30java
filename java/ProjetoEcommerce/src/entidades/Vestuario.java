package entidades;

import java.util.Scanner;

public final class Vestuario extends Produto {
	
	Scanner entrada = new Scanner(System.in);
	private String tamanho; //PP,P,M,G,GG
	private char cor; //RGBW
	
	
//CONSTRUTORES	
	public Vestuario(String codigo, String nome, double valor, int estoque) {
		super(codigo, nome, valor, estoque);
	}
//ENCAPSULAMENTO
	
	@Override
	public String getTamanho() {
		return tamanho;
	}

	
	@Override
	public char getCor() {
		return cor;
	}

	
	
//METODOS
	
		@Override
		public void escolherTamanho(String tamanho ) {
			
		if(tamanho.equals("PP")  || tamanho.equals("P") || tamanho.equals("M")  || tamanho.equals("G")  || tamanho.equals("GG") ) {
				
				this.tamanho = tamanho;
			}
			else{
				System.out.println("Digite um tamanho válido.");
				System.out.println("Digite o tamanho:");
				tamanho = entrada.nextLine().toUpperCase();
				escolherTamanho(tamanho);
				
			}
			
		}
	
		@Override
		public void escolherCor(char cor) {
			
		if(cor == 'R' || cor == 'G' || cor == 'B' || cor == 'W') {
			
			this.cor = cor;
		}
		else{
			
			System.out.printf("Digite uma cor válida \nR-Vermelho, G-Verde, B-Azul, W-Branco:\n");
			cor = entrada.nextLine().toUpperCase().charAt(0);
			escolherCor(cor);
		}
		
		
	}
	
	

}