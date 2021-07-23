programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, D, p1 ,p2

		escreva("Informe o valor de x1: ")
		leia(x1)

		escreva("Informe o valor de x2: ")
		leia(x2)

		escreva("Informe o valor de y1: ")
		leia(y1)

		escreva("Informe o valor de y2: ")
		leia(y2)

		p1 = Mat.potencia((x2-x1),2)
		p2 = Mat.potencia((y2-y1),2)
		D = Mat.raiz((p1+p2), 2)
		
		escreva("A distância é: " ,D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */