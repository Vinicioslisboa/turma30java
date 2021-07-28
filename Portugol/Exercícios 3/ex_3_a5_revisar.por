programa
{
	//Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 
	//quando não estiver.
	
	funcao inicio()
	{
		inteiro contador =233

		escreva(contador, "\n")

		faca
		{	
			se(contador >=300 e contador <=400)
			{
				contador +=3
				escreva("Somando 3 - ",contador, "\n")
			}
			senao
			{
				contador +=5
				escreva("Somando 5 - ",contador,"\n")
			}
			
			
		} enquanto (contador < 456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */