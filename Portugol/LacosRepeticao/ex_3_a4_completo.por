programa
{
	// Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) até que ele seja maior 
	// do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
	
	funcao inicio()
	{	
		const inteiro MULTIPLICADOR=3
		inteiro digito=0

		escreva("Digite o valor a ser aplicado: ")
		leia(digito)

		enquanto( digito <= 100)
		{	
			digito *=MULTIPLICADOR
			
			escreva("\nO valor digitado multiplicado por 3 é: ",digito)
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */