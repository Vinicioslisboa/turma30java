programa
{
	
	funcao inicio()
	{
	     inteiro numero
	     
		escreva("Digite um número inteiro e positivo: ")
		leia(numero)

		se(numero == 0) {
			escreva("O número " ,numero, " é NEUTRO !")
			}
			
		senao se (numero  <0){
			escreva("O número " ,numero, " é INVÁLIDO !")
		}
		
		senao se (numero % 2 == 0){
			escreva("O número " ,numero, " é PAR !")
			}
			
		senao se (numero % 2 == 1){
			escreva("O número " ,numero, " é ÍMPAR !")
			}	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */