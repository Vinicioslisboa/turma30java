programa
{
	
	funcao inicio()
	{	
		const inteiro TAMANHO_TURMA_E_NOTAS=4
		cadeia alunes[TAMANHO_TURMA_E_NOTAS]
		inteiro nota[TAMANHO_TURMA_E_NOTAS]

		para (inteiro i=0 ; i <TAMANHO_TURMA_E_NOTAS ; i++)
		{
			escreva("Digite o nome: ")
			leia(alunes[i])
			
			escreva("Digite a nota: ")
			leia(nota[i])
		}	
		limpa()
		para (inteiro i=0 ; i <TAMANHO_TURMA_E_NOTAS; i++)
		{

			se( nota[i] <=5)
			{
				escreva("Nome: " , alunes[i], " - nota: " ,nota[i], " - Ainda não, continue estudando !\n")
			}
			senao
			{
				escreva("Nome: " , alunes[i], " - nota: " ,nota[i], " - Muito bem, continue assim !\n")
			}
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */