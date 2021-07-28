programa
{
	//Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto
	//dos números de 1 até 500.
	
	funcao inicio()
	{
		inteiro total=0
		para (inteiro x=1 ; x<=500 ; x++)
		{
			se ( (x%2)==1 e (x%3)==0 )
			{	
				escreva("x ", x, " + o total ",total, " = ")
				total += x //totalizador
				escreva(total,"\n")	
				
			}
			
		}
		escreva("O  total dos valores é : ",total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */