programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o índice de poluíção: ")
		leia(indicePoluicao)

		se(indicePoluicao ==0.3)
		{
			escreva("Indústrias do 1º grupo devem suspender suas operações, o índice atual de poluíção é: " ,indicePoluicao)
		}
		senao se(indicePoluicao ==0.4)
		{
			escreva("Indústrias dos 1º e 2º grupos devem suspender suas operações, o índice atual de poluíção é: " ,indicePoluicao)
		}
		senao se(indicePoluicao >=0.5)
		{
			escreva("Todos os grupos devem suspender suas operações, o índice atual de poluíção é: " ,indicePoluicao)
		}
		senao
		{
			escreva("Operações liberadas, o índice atual de poluíção é: " ,indicePoluicao)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */