programa
{
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	//Encontre após a maior pontuação e a apresente. 
	
	funcao inicio()
	{
		inteiro pontuacaoAtiv[5],c,maiorNota=0

		para(c=0 ; c<5 ; c++)
		{
			escreva("Nota da atividade: ")
			leia(pontuacaoAtiv[c])
			
			se( maiorNota < pontuacaoAtiv[c])
		{
			maiorNota = pontuacaoAtiv[c]
		}
		
		}
		
		limpa()
		
		para(c=0 ; c<5 ; c++)
		{
			escreva("Nota ",c+1," - Pontuação: ",pontuacaoAtiv[c],"\n")
		}
		escreva("\nA sua maior nota foi: ",maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */