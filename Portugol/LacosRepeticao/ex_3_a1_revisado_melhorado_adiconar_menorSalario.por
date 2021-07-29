programa
{	//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	//a) média do salário da população; 
	//b) média do número de filhos; 
	//c) maior salário; 
	//d) percentual de pessoas com salário até R$100,0
		inclua biblioteca Matematica --> mat
		inclua biblioteca Util
	funcao inicio()
	{
		const inteiro HABITANTES=3

		inteiro numeroFilhos
		real salario, salarioTotal=0.00, mediaSalarial=0.00, mediaFilhos=0.00, maiorSalario=0.00, percentualSalario100reais=0.00
		real totalFilhos=0.00, contadorPercentual100reais=0.00, menorSalario=100.000

		para(inteiro x=1 ; x<= HABITANTES ; x++)
		{
			escreva("Digite o salário: ")
			leia(salario)

			escreva("Digite o número de filhos: ")
			leia(numeroFilhos)

			salarioTotal += salario
			totalFilhos += numeroFilhos

			se( maiorSalario < salario) 
			{
				maiorSalario = salario
			}
			se( menorSalario > salario e salario > 0)
			{
				menorSalario = salario
			}
			se(salario <= 100)
			{
				contadorPercentual100reais++
			}
		}
		mediaSalarial = salarioTotal/HABITANTES
		mediaFilhos = totalFilhos/HABITANTES
		percentualSalario100reais = contadorPercentual100reais/HABITANTES
	limpa()
		escreva("A amostra desse estudo foram de: ",HABITANTES, " moradores da cidade X")
		Util.aguarde(4000) limpa()
		escreva("O salário total dos habitantes é: ",salarioTotal, " R$ ")
		escreva("\nA média salarial dos habitantes é: ",mat.arredondar(mediaSalarial, 2), " R$ ")
		Util.aguarde(8000) limpa()
		escreva("O número total de filhos dos habitantes é: ",mat.arredondar(totalFilhos, 2))
		escreva("\nA média de filhos dos habitantes é: ",mat.arredondar(mediaFilhos, 2))
		Util.aguarde(8000)limpa()
		escreva("O maior salário entre os habitantes é: ",maiorSalario, " R$ ")
		escreva("\nO menor salário entre os habitantes é: ",menorSalario, " R$ ")
		escreva("\nO percentual de pessoas com salário até 100.00 R$ é: " ,mat.arredondar(percentualSalario100reais, 2))
		}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1021; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */