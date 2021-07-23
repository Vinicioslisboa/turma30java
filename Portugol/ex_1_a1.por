programa
{
	funcao inicio() {

		inteiro anos, mes, dias
		

		escreva("Informe a sua idade:\n")
		leia(anos)
		escreva("Informe quantos meses:\n")
		leia(mes)
		escreva("Informe quantos dias:\n")
		leia(dias)

		dias=(dias+(anos*365)+(mes*30))
		
		escreva("Sua idade em dias é = ",dias)
				
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */