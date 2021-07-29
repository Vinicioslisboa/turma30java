programa
{
	inclua biblioteca Matematica -->Mat
	funcao inicio() {

		inteiro A, B, C, R, S, D

		escreva("Qual o valor de A? ")
		leia(A)

		escreva("Qual o valor de B? ")
		leia(B)

		escreva("Qual o valor de C? ")
		leia(C)

		R = Mat.potencia((A+B),2)
		escreva("O valor de R é " ,R, "\n")

		S=(B+C)*(B+C)
		escreva("O valor de S é " ,S, "\n")
		escreva(R, " + " ,S, " / 2 é = D ") 

		D=(R+S)/2
		escreva("\nPortanto D é = " ,D)
		
		
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */