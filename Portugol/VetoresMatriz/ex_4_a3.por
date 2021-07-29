programa
{
	//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	
	funcao inicio()
	{
		inteiro n1[2][3], n2[2][3], lin, col, m1=0, m2=0
//n1
		para(lin = 0 ; lin < 2 ; lin++)
		{
			para(col = 0 ; col < 3 ; col++)
			{
			escreva("Valor N1: ")
			leia(n1[lin][col])
			}
			
			}
			
		
//n2			
			escreva("\n")
		para(lin = 0 ; lin < 2 ; lin++)
		{
			para(col = 0 ; col < 3 ; col++)
			{
			
			escreva("Valor N2: ")
			leia(n2[lin][col])
			}
			
			}

		
//m1		
		escreva("\n")
		para(lin = 0 ; lin < 2 ; lin++)
		{
			para(col = 0 ; col < 3 ; col++)
			{
			 m1 = n1[lin][col]+n2[lin][col]

			 escreva("A soma de cada posição de n1 e n2 é: ",m1, "\n")
			}
		}
		
//m2
		escreva("\n")
		para(lin = 0 ; lin < 2 ; lin++)
		{
			para(col = 0 ; col < 3 ; col++)
			{
			 m2 = n1[lin][col] - n2[lin][col]

			 se(m2 < 0 )
			 {
			 	m2 = n2[lin][col] - n1[lin][col]
			 }

			 escreva("A diferença de cada posição de n1 e n2 é: ",m2, "\n")
			}
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 907; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */