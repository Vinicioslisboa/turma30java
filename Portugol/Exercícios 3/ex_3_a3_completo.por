programa
{
	//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
	//a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
	//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	
	funcao inicio()
	{
		inteiro digito=0
		real mediaDigito=0.00, totalDigitos=0.00, contadorDigitos =0.00, totalSomatorioDigito=0.00

		enquanto( digito >= 0)
		{
			escreva("Digite o valor positivo: ")
			leia(digito)

			totalSomatorioDigito+=digito
			contadorDigitos++
		}
		mediaDigito = totalSomatorioDigito/contadorDigitos
		
		limpa()
		escreva("O valor do somatório total dos digitos é: ",totalSomatorioDigito)
		escreva("\nO total de digitos escritos foram: ",contadorDigitos)
		escreva("\nA média dos valores digitados foi: ",mediaDigito)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 696; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */