programa
{
	//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e 
	//a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	
	funcao inicio()
	{	const inteiro linha=3
		const inteiro coluna=3
		inteiro matriz[linha][coluna],x, y ,somaMatriz=0, diagonalPrincipal=0

		para ( x=0 ; x<linha ;x++)
		{
			para( y=0 ; y<coluna ;y++)
			{
				escreva("Entre com o valor: ")
				leia(matriz[x][y])
			}
		
		}

		para ( x=0 ; x<linha ;x++)
		{
			para( y=0 ; y<coluna ;y++)
			{
				somaMatriz += matriz[x][y]
			}
		
		}
		escreva("\nA soma dos valores da matriz é: ",somaMatriz)

		para ( x=0 ; x<linha ;x++)
		{
			para( y=0 ; y<coluna ;y++)
			{
				
				se( x == y)
				{
					diagonalPrincipal += matriz[x][y]
				}
				
			}
		
		}
		escreva("\nA soma da diagonal principal é: ",diagonalPrincipal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */