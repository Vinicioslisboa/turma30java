package entidades;

import java.util.Scanner;

public class Calcados extends Produto {
	
	Scanner entrada = new Scanner(System.in);
	private String tamanhoCalcado; //35 - 45
	private char corCalcado; //K,P,Y,W
//CONSTRUTORES
	public Calcados() {
		
	}
	public Calcados(String codigo, String nome, double valor, int estoque) {
		super(codigo, nome, valor, estoque);
	}

//ENCAPSULAMENTO
	@Override
	public String getTamanho() {
		return tamanhoCalcado;
	}
	
	@Override
	public char getCor() {
		return corCalcado;
	}
	
	
//METODOS
	
	@Override
	public void escolherTamanho(String tamanhoCalcado ) {
		// 35 - 45
		if(tamanhoCalcado.matches("-?\\d+")){
			if(Integer.parseInt(tamanhoCalcado) >= 35 && Integer.parseInt(tamanhoCalcado) <=45) {
				
				this.tamanhoCalcado = tamanhoCalcado;
			}
			else{
				System.out.println("Digite um tamanho válido (entre 35 e 45):");
				tamanhoCalcado = entrada.nextLine().toUpperCase();
				escolherTamanho(tamanhoCalcado);
			}
			
			}
		else {
			System.out.println("Resposta Inválida!");
			System.out.println("Digite um número entre 35 e 45:");
			tamanhoCalcado = entrada.nextLine().toUpperCase();
			escolherTamanho(tamanhoCalcado);
		
			
		
		}
		
	}

	@Override
	public void escolherCor(char corCalcado) {
		
	if(corCalcado == 'K' || corCalcado == 'P' || corCalcado == 'Y' || corCalcado == 'W') {
		
		this.corCalcado = corCalcado;
	}
	else{
		
		System.out.printf("Digite uma cor válida \nK-Preto, P-Rosa, Y-Amarelo, W-Branco:\n");
		corCalcado = entrada.nextLine().toUpperCase().charAt(0);
		escolherCor(corCalcado);
		
	}
	
	
}
	
	
	

}