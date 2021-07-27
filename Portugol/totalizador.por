programa
{
	
	funcao inicio()
	{
		inteiro totalMultiplo4=0, totalMultiplo7Impar=0, total

		

		para (inteiro x=1 ; x<=1000; x++)
		{
			se( x>=100 e x<=200 e (x%4)==0)
			{
				totalMultiplo4 += x //totalizador é a mesma coisa de = totalMultiplo4 = totalMultiplo4 + (variável)
			}
			se( x>=400 e (x%7)==0 e (x%2)==1)
			{
				totalMultiplo7Impar += x
			}
			
		}
			escreva("Total multiplo de 4 entre 100 e 200 = ",totalMultiplo4)
			escreva("\nTotal multiplo de 7 impar, entre 400 e 1000 = ",totalMultiplo7Impar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */