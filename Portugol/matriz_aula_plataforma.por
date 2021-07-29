programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO=3
		inteiro matriz[TAMANHO][2],linha,coluna

		para(linha=0 ; linha < TAMANHO ; linha++)
		{
			para(coluna=0 ; coluna < 2 ; coluna++)
			{
				escreva("Valor: ")
				leia(matriz[linha][coluna])
			}
			
		}
		limpa()
		para(linha=0 ; linha < TAMANHO ; linha++)
		{
			para(coluna=0 ; coluna < 2 ; coluna++)
			{
				escreva("[",matriz[linha][coluna], "]")
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */