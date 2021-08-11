package programa;

import java.util.Scanner;

import entidades.Calcados;
import entidades.Vestuario;

public class NewProgram {
	
	public static void main(String args[]) {
		
		Calcados calc1 = new Calcados("G2-01","Chuteira Feminina",130.00,10);
		Vestuario vest1 = new Vestuario("G2-07","Kimono",350.00,10);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o tamanho:");
		String resposta = entrada.nextLine().toUpperCase();
		calc1.escolherTamanho(resposta);
		
		/*System.out.println("Digite o tamanho:");
		String resposta = entrada.nextLine().toUpperCase();
		vest1.escolherTamanho(resposta);*/
		
		
				
	}
		
		
		
	}


