package Lista4_POO;

import java.util.Scanner;

public class cliente {
	
	//Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, 
	//em seguida crie um objeto cliente, defina as instancias deste objeto e 
	//apresente as informa��es deste objeto no console.
	
	Scanner entrada = new Scanner(System.in);
	public String nome;
	public int numeroMatricula;
	public int idade;
	public String dataDeFiliacao;
	
	
	public void calculoIdade(int anoAtual, int anoNascimento) {
		
		System.out.println(anoAtual - anoNascimento);
		
	}
	
	public void numeroMatricula() {
		
		System.out.println("Digite o n�mero da matricula: ");
		numeroMatricula = entrada.nextInt();
		
	}

}
