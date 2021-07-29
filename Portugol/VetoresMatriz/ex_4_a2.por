programa
{
	inclua biblioteca Util
	//Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
	//escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
	//apresente também quantas foram as ocorrências da maior pontuação.
	
	funcao inicio()
	{
		const inteiro LANCAMENTOS=10
		inteiro dados[10], d, maiorPontuacao=0, repeticaoPont=0
		real mediaLancamentos=0, totalLancamentos=0
		
		//Lançamentos
		para(d=0 ; d<LANCAMENTOS ; d++)
		{
			dados[d]= Util.sorteia(1,6)
			totalLancamentos +=dados[d]
			
			se( maiorPontuacao < dados[d])
			{
				maiorPontuacao = dados[d]
			}

			se(dados[d] == maiorPontuacao)
			{
				
			}
			
		}
		mediaLancamentos = totalLancamentos/LANCAMENTOS
		
		
		escreva("Dados lançados: \n")
		
		
		para(d=0 ; d<LANCAMENTOS ; d++)
		{
			escreva("Lançamento ",d+1," - ",dados[d], "\n")
		}

		
		//Média
		escreva("\nTotal dos lançamentos:",totalLancamentos)
		escreva("\nMedia dos lançamentos:",mediaLancamentos, "\n")
		//ocorrências de maior pontuação
		escreva("\nA maior pontuação foi: ",maiorPontuacao)
		escreva("\nE ela se repetiu: ",repeticaoPont, " vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 727; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */