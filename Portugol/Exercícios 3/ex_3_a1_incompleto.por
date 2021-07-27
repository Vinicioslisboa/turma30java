programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util
	funcao inicio()
	{	//VARIÁVEIS
		const inteiro HABITANTES=3
		
		inteiro numeroFilhos=0
		real salario=0.00, mediaSalarios=0.00, totalSalarios=0.00, mediaFilhos=0.00, totalFilhos=0.00, percentualSalario100=0.00
		real maiorSalario=0.00, contadorSalario100reais=0.00
		//ENTRADAS
		para (inteiro x=1 ; x <= HABITANTES ; x++)
		{
		escreva("Digite o salário: ")
		leia(salario)

		escreva("Digite o número de filhos: ")
		leia(numeroFilhos)
		//PROCESSOS
		totalSalarios += salario
		totalFilhos += numeroFilhos

		se (salario > maiorSalario)
		{
			maiorSalario = salario  
		}
		se (salario <= 100.00)
		{
			contadorSalario100reais++
		}
		
		} 
		mediaSalarios = (totalSalarios/HABITANTES)
		mediaFilhos = (totalFilhos/HABITANTES)
		percentualSalario100 = (contadorSalario100reais/HABITANTES) * 100
		//SAÍDAS
		limpa()
		escreva("Total salarial: ",totalSalarios, " R$")
		escreva("\nMedia salarial: ",mediaSalarios, " R$")
		escreva("\nTotal de filhos: ",totalFilhos)
		escreva("\nMedia de filhos: ",mediaFilhos)
		escreva("\nMaior salário entre os habitantes: ",maiorSalario, " R$")
		escreva("\nPercentual até 100.00 de salário: ",percentualSalario100)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 715; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */