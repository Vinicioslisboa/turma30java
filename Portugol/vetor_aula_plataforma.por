programa
{
	
	funcao inicio()
	{
		inteiro numero[4], x
		para(x=0 ; x<4 ; x++)
		{
			escreva("Entre com o valor: ")
			leia(numero[x])
			
		}
		limpa()
		para(x=0 ; x<4 ; x++)
		{
			escreva("Valor posição",x+1,":",numero[x], "\n")
			
		}

		para(x=3 ; x>=0 ; x--)
		{
			escreva(" \nValor posição",x+1,":",numero[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */