programa
{
	
	funcao inicio()
	{
		cadeia C
		inteiro N=0, E=0
		real salarioT=0.00, salarioE=0.00

		escreva("Digite o código do funcionário(a): ")
		leia(C)

		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(N)

	se(N<=50)
	{
		salarioT=N*10.00
	}
	senao
	{
		E = N-50
		salarioE = E*20.00
		salarioT = salarioE + (50*10.00)
	}

		escreva("\nSalário total : R$",salarioT)
		escreva("\nSalário excedente : R$",salarioE)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */