package Lista3;

//Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de 
//uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino 
// 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, 
//se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 
//150 pessoas, calcule e mostre: (WHILE)
//o número de pessoas calmas; 
//o número de mulheres nervosas; 
//o número de homens agressivos; 
//o número de outros calmos;
//o número de pessoas nervosas com mais de 40 anos; 
//o número de pessoas calmas com menos de 18 anos.


import java.util.Scanner;

public class lista_3_e4 {
	
	public static void main(String[] args) {
	//-----------------------------------------VAR-------------------------------------------------------
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, contadorPessoas=0;
		char sexo=' ', opcoes=' ', OP='S';
		final int LIMITE_DE_PESSOAS = 150;
		
		int numeroPessoasCalmas=0, numeroMulheresNervosas=0, numeroHomensAgressivos=0, numeroOutrosCalmos=0;
		int numeroPessoasNervosasMais40Anos=0, numeroPessoasCalmasMenos18Anos=0;
		
//--------------------------------------------Entradas------------------------------------------------
	
		while(contadorPessoas < LIMITE_DE_PESSOAS && OP == 'S') {
			
			contadorPessoas++;
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite o número referente ao sexo: \n1-Feminino\n2-Masculino\n3-Outros ");
			sexo = leia.next().charAt(0);
			System.out.println("Escolha o numero referente a opção:\n1 - Pessoa calma\n2 - Pessoa nervosa\n3 - Pessoa agressiva ");
			opcoes = leia.next().charAt(0);
			System.out.println("Deseja continuar S/N: ");
			OP = leia.next().toUpperCase().charAt(0);
			
		
//--------------------------------------------Processos-----------------------------------------------	
	
		if(opcoes=='1') {
			
			numeroPessoasCalmas++;
			
		}
		if(sexo=='1' && opcoes=='2') {
			
			numeroMulheresNervosas++;
			
		}
		if(sexo=='2' && opcoes=='3') {
			
			numeroHomensAgressivos++;
			
		}
		if(sexo=='3' && opcoes=='1') {
			
			numeroOutrosCalmos++;

		}
		if(opcoes=='2' && idade > 40){
			
			numeroPessoasNervosasMais40Anos++;
		
		}
		if(opcoes=='1' && idade < 18) {
			
			numeroPessoasCalmasMenos18Anos++;
			
		}
		}
		
		System.out.println("Pessoas calmas "+numeroPessoasCalmas); 
		System.out.println("Mulheres nervosas "+numeroMulheresNervosas); 
		System.out.println("Homens agressivos "+numeroHomensAgressivos); 
		System.out.println("Outros calmos "+numeroOutrosCalmos);
		System.out.println("Pessoas nervosas acima 40 anos "+numeroPessoasNervosasMais40Anos); 
		System.out.println("Pessoas acalmas abaixo 18 anos "+numeroPessoasCalmasMenos18Anos);
			
		//o número de homens agressivos; 
		//o número de outros calmos;
		//o número de pessoas nervosas com mais de 40 anos; 
		//o número de pessoas calmas com menos de 18 anos.

		
		
	}

}
