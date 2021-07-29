programa
{
	
	funcao inicio()
	{
		real b, h, a

		escreva("Digite a base (cm): ")
		leia(b)

		escreva("Digite a altura (cm): ")
		leia(h)
	se(b > 0 e h > 0)
	{
		escreva("Os número são maiores que 0\n")
		escreva("Cálculo de área liberado...")
	}
	
	senao se(b <= 0 e h <= 0)
	{
		escreva("Existem números menores ou iguais a 0\n")
		escreva("Cálculo de área indisponível")
	}

	a=(b*h)/2

		escreva("\nA área do seu triângulo é: ",a," cm²")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */