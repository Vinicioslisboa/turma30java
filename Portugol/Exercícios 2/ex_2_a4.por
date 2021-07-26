programa
{
	
	funcao inicio()
	{
		inteiro n
		

		escreva("Digite o número: ")
		leia(n)

		se(n == 0)
		{
			escreva("O número ",n, " é NEUTRO")
		}
		senao se(n <0)
		{
			escreva("O número ",n, " é NEGATIVO")
		}
		senao se(n % 2 == 0)
		{
			
			escreva("O número ",n, " é PAR e POSITIVO")
		}
		senao se(n % 2 == 1)
		{
			escreva("O número ",n, " é ÍMPAR e POSITIVO")
		}
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */