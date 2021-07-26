programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite a sua idade: ")
		leia(idade)

		se(idade >=5 e idade < 8 )
		{
			escreva("Sua categoria é INFANTIL A")
		}

		senao se(idade >=8 e idade < 12)
		{
			escreva("Sua categoria é INFANTIL B")
		}

		senao se(idade >=12 e idade < 14)
		{
			escreva("Sua categoria é JUVENIL A")
		}
		
		senao se(idade >=14 e idade <= 17)
		{
			escreva("Sua categoria é JUVENIL B")
		}
		
		senao se(idade >= 18)
		{
			escreva("Sua categoria é ADULTO")
		}
		
		senao
		{
			escreva("Você não se encaixa em nenhuma das categorias.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */