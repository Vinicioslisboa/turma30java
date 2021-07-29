programa
{
	
	funcao inicio()
	{
		cadeia codigo
		inteiro horasTrabalhadas=0, horasExecedente=0
		real salarioTotal=0.00, salarioExcedente=0.00
		const real SALARIO_BASE=500.00, VALOR_EXCEDENTE = 20.0, VALOR_HORAS_BASE =10.0
		const inteiro Horas_BASE = 50

		escreva("Digite o código do funcionário(a): ")
		leia(codigo)

		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(horasTrabalhadas)

	se(horasTrabalhadas<=Horas_BASE)
	{
		salarioTotal=horasTrabalhadas*VALOR_HORAS_BASE
	}
	senao
	{
		horasExecedente = horasTrabalhadas-Horas_BASE
		salarioExcedente = horasExecedente*VALOR_EXCEDENTE
		salarioTotal = salarioExcedente + SALARIO_BASE
	}

		escreva("\nSalário total : R$",salarioTotal)
		escreva("\nSalário excedente : R$",salarioExcedente)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */