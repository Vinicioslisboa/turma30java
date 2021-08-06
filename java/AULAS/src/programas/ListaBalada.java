package programas;

import classes.Pessoa;

public class ListaBalada {
	
	public static void main(String args[]) {
		
		Pessoa fulano1 = new Pessoa("Lisboa");
		Pessoa sicrano1 = new Pessoa("Soler");
		
		
		fulano1.anoNascimento = 2000;
		
		System.out.println("Quem é fulano ?, Fulano é "+fulano1.nome);
		System.out.println("Idade "+ (2021-fulano1.anoNascimento));
		fulano1.mostrarIdade();
		System.out.println(fulano1.nome+" sua idade é"+fulano1.calcIdade(2021));
		
		
		
	}
	
	

}
