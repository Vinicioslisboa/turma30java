programa
{
	
	funcao inicio()
	{
		real peso, kgExcedente, taxa
		const real  multa = 4.0, pesoBase =50.0 
		
			escreva("Insira o peso do produto: ")
			leia(peso)

		kgExcedente = (peso - pesoBase)
		taxa = (kgExcedente * multa)

		se(peso <= pesoBase)
		{
			
			escreva("Seu produto pesou: ",peso, "\nLiberado sem taxação")
	
		}
		
		senao se(peso > pesoBase)
		{

			escreva("Seu produto pesou: ",peso,"kg \nExcedente de: ",kgExcedente, "kg \nSua taxa é de: ",taxa, " R$")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */