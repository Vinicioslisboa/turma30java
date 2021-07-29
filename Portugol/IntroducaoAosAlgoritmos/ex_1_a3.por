programa
{
	funcao inicio() {

		inteiro horas, minutos, segundo, segundos
		

		escreva("Digite o tempo do evento em segundos:\n")
		leia(segundos)

		horas=(segundos/3600)
		minutos=(segundos%3600)/60
		segundo=(segundos%3600)%60

		escreva("O evento durou: " , horas," hora(s) ", minutos," minuto(s) e ", segundo, " segundo(s) ")
		
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */