package loja;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import entidades.Calcados;
import entidades.Produto;
import entidades.Vestuario;

public class PortoGol {
	static List<Produto> carrinho = new ArrayList<>();
	static List<Produto> loja = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Produto resposta = new Produto();
		Produto respostaVoltarPagina = new Produto();
		Produto produtoSelecionado = new Produto();
		
		boolean validaResposta = false;
		char respostaCompras;
		char respostaContinuarCompras = 'N';
		String qtddDesejada = "0";
		int qtddDesejadaInt = 0;
		double valorTotalCompra = 0.00;
		final int ESTOQUE_INICIAL = 10;
		char opcaoPagamento;
		
		LocalDate anoCalendario = LocalDate.now();
		int horaCalendario = Calendar.HOUR;
		int minutoCalendario = Calendar.MINUTE;
		
		
		
		
		loja.add(new Vestuario("G2-01", "Calça legging         ", 69.99, ESTOQUE_INICIAL));
		loja.add(new Vestuario("G2-02", "Regata para musculação", 29.99, ESTOQUE_INICIAL));
		loja.add(new Vestuario("G2-03", "Kimono                ", 249.99, ESTOQUE_INICIAL));
		loja.add(new Vestuario("G2-04", "Shorts de kickboxing  ", 79.99, ESTOQUE_INICIAL));
		loja.add(new Vestuario("G2-05", "Top de natação        ", 89.99, ESTOQUE_INICIAL));
		loja.add(new Calcados("G2-06", "Meia cano longo       ", 49.99, ESTOQUE_INICIAL));
		loja.add(new Calcados("G2-07", "Chuteira feminina     ", 449.99,ESTOQUE_INICIAL));
		loja.add(new Calcados("G2-08", "Chuteira masculina    ", 469.99, ESTOQUE_INICIAL));
		loja.add(new Calcados("G2-09", "Tênis de corrida      ", 289.99, ESTOQUE_INICIAL));
		loja.add(new Calcados("G2-10","Patins                ", 589.99, ESTOQUE_INICIAL));

			
		cabecalho(3);
		
		System.out.println("Deseja fazer compras? [S/N]: ");
		respostaCompras = leia.nextLine().toUpperCase().charAt(0);
		respostaCompras = resposta.validarSimOuNao(respostaCompras);
		
		if(respostaCompras == 'S') {
			do {
				if(respostaContinuarCompras == 'S') {
					limpa();
					cabecalho(3);
					
					System.out.println("Deseja fazer compras? [S/N]: ");
					respostaCompras = leia.next().toUpperCase().charAt(0);
					respostaCompras = resposta.validarSimOuNao(respostaCompras);
					respostaContinuarCompras = 'N';
				}
				if (respostaCompras == 'S') {
					paginaDeCompras(loja, produtoSelecionado, qtddDesejadaInt);
				
					do {
						
						do {
							
							System.out.println("Digite o código do produto desejado: ");
							String codProduto = leia.nextLine().toUpperCase();
							
							for (Produto vitrine : loja) {
								if(vitrine.getCodigo().equals(codProduto)) {
									for (Produto prodsDoCarrinho : carrinho) {
						
										if((prodsDoCarrinho.getCodigo() != null) && prodsDoCarrinho.getCodigo().equals(codProduto)) {
											System.out.println("Produto já selecionado!");
											System.out.println("Altere as especificações do produto.");	
											produtoSelecionado = vitrine;
											validaResposta = true;
											break;
										}
								
									}
									produtoSelecionado = vitrine;
									validaResposta = true;
									break;
								}
							}
							
							if(!validaResposta) {
								System.out.println("Resposta inválida.");
							}
						} while(!validaResposta);
						
						linha(4);
						
						System.out.printf("║ %s │ %s \t│ %.2f \t  │ %d \t\t\t║\n" ,produtoSelecionado.getCodigo(), produtoSelecionado.getNome(), produtoSelecionado.getValor(), produtoSelecionado.getEstoque());
						
						linha(5);
						
						do {
							validaResposta = true;
							System.out.println("Digite a quantidade desejada: ");
							System.out.println("Ou digite [0] para cancelar a adição ao carrinho.");
							qtddDesejada = leia.nextLine().toUpperCase();
							if(qtddDesejada.matches("-?\\d+")){
								if(Integer.parseInt(qtddDesejada) > produtoSelecionado.getEstoque() || Integer.parseInt(qtddDesejada) < 0) {
									System.out.println("Quantidade indisponível.");
									validaResposta = false;
								}
								else {
									qtddDesejadaInt = Integer.parseInt(qtddDesejada);
									
								}
							}
							else {
								System.out.println("Quantidade inválida (Digite um número).");
								validaResposta = false;
							}
							
						} while(!validaResposta);
						
						if(qtddDesejadaInt != 0) {
							System.out.println("Digite o tamanho desejado: ");
							if(produtoSelecionado instanceof Calcados) {
								System.out.println("Um número entre 35 e 45.");
							}
							else {
								System.out.println("PP, P, M, G, GG.");
							}
							String tamanhoEscolhido = leia.nextLine().toUpperCase();
							produtoSelecionado.escolherTamanho(tamanhoEscolhido);
							
							
							System.out.println("\nDigite a cor desejada: ");
							if(produtoSelecionado instanceof Calcados) {
								System.out.println(" K - Preto;\n P - Rosa;\n Y - Amarelo;\n W - Branco.");
							}
							else {
								System.out.println(" R - Vermelho;\n G - Verde;\n B - Azul;\n W - Branco.");
							}
							char corEscolhida = leia.nextLine().toUpperCase().charAt(0);
							produtoSelecionado.escolherCor(corEscolhida);
						}
						System.out.println("Continuar compras? [S/N]: ");
						respostaCompras = leia.nextLine().toUpperCase().charAt(0);
						respostaCompras = resposta.validarSimOuNao(respostaCompras);
						
						paginaDeCompras(loja, produtoSelecionado, qtddDesejadaInt);
					} while(respostaCompras == 'S');
					
					for(Produto selecionados : carrinho) {
						if (selecionados.getEstoque() != 0) {
						valorTotalCompra = (selecionados.getValor() * selecionados.getEstoque());
						}
					}
					
					if(valorTotalCompra == 0.00) {
						System.out.println("Voltar para a página inicial? [S/N]: ");
						respostaContinuarCompras = leia.next().toUpperCase().charAt(0);
						respostaContinuarCompras = respostaVoltarPagina.validarSimOuNao(respostaContinuarCompras);	
						if(respostaCompras == 'N') {
							
						}
						
					}
					else {
						linha(8);
						System.out.printf("║ ► Valor total da compra: R$ %.2f\t\t\t\t\t\t║\n", valorTotalCompra );
						
						System.out.printf("║   Imposto de 9%% embutido no valor total: R$ %.2f\t\t\t\t║\n", ((valorTotalCompra / 100.0) * 9.0));
						linha(9);
						
						System.out.printf("║ ► Opções de pagamento:\t\t\t\t\t\t\t║\n");
						double valorOpcao1 = ((valorTotalCompra / 100) * 90);
						System.out.printf("║     1 - Pagamento à vista com 10%% de desconto: R$ %.2f\t\t\t║\n", valorOpcao1);
						double valorOpcao2 = ((valorTotalCompra / 100) * 110);
						System.out.printf("║     2 - No cartão com acréscimo de 10%%: R$ %.2f\t\t\t\t║\n",valorOpcao2);
						double valorOpcao3 = ((valorTotalCompra / 200) * 115);
						System.out.printf("║     3 - 2x com 15%% de acréscimo, valor de cada parcela: R$ %.2f\t\t║\n",valorOpcao3);
						linha(7);
						
						System.out.printf("Escolha a sua opção de pagamento: ");
						opcaoPagamento = leia.next().charAt(0);
						opcaoPagamento = resposta.escolherFormaDePagamento(opcaoPagamento);
						
						
					
						
						System.out.printf("\n ► NOTA FISCAL ---------------------------------------------------------------\n");
						System.out.printf("┌───────────────────────────────────────────────────────────────────────────────┐\n");
						System.out.printf("│ ┌──────────────────┬────────────────────┬───────────────────────────────────┐ │\n");
						System.out.printf("│ │                  │ DANFE              │ Código de Barras                  │ │\n");
						System.out.printf("│ │ Porto-Gol.com.br │ 0 - entrada        │ ||| ||| | ||||| || || ||||| ||    │ │\n");
						System.out.printf("│ │                  │ 1 - saída          │                                   │ │\n");
						System.out.printf("│ └──────────────────┴────────────────────┴───────────────────────────────────┘ │\n");
						System.out.printf("│ ┌─────────────────────────────┬─────────────────────────────────────────────┐ │\n");
						System.out.printf("│ │ Natureza da operação        │ Número de Protocolo                         │ │\n");
						System.out.printf("│ │ Venda de mercadorias        │ xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx     │ │\n");
						System.out.printf("│ └─────────────────────────────┴─────────────────────────────────────────────┘ │\n");
						System.out.printf("│  Destinatário/ remetente                                                      │\n");
						System.out.printf("│ ┌───────────────────────┬─────────────────────────┐┌────────────────────────┐ │\n");
						System.out.printf("│ │ Nome/ Razão Social    │ CPF                     ││ Data de emissão        │ │\n");
						System.out.printf("│ │ XXXXXXXXXXXXXX        │ XXX.XXX.XXX-XX          ││ \t%s\t      │ │\n",anoCalendario);
						System.out.printf("│ ├───────────────────┬───┴─────────────┬───────────┤├────────────────────────┤ │\n");
						System.out.printf("│ │ Endereço          │ Bairro/ Distrito│ CEP       ││ Data de Saída/ Entrada │ │\n");
						System.out.printf("│ │ xxx xxxxxxxxxxx   │ xxxx xxxx       │ xxxxx-xxx ││ \t%s\t      │ │\n",anoCalendario);
						System.out.printf("│ ├────────────┬────┬─┴──────────┬──────┴───────────┤├────────────────────────┤ │\n");
						System.out.printf("│ │ Município  │ UF │ CEP        │ Fone             ││ Hora da Saída          │ │\n");
						System.out.printf("│ │ xxxxxxx    │ XX │ xxxxx-xxx  │ xxxxx-xxxx       ││   %s:%s\t\t      │ │\n",horaCalendario,minutoCalendario);
						System.out.printf("│ └────────────┴────┴────────────┴──────────────────┘└────────────────────────┘ │\n");
						System.out.printf("│  Valor das Faturas                                                            │\n");
						System.out.printf("│ ┌───────────┬──────────────────────────────────┬────────────────────┬───────┐ │\n");
						System.out.printf("│ │ Número    │ Vencimento                       │ Valor              │ QTD   │ │\n");
						if(opcaoPagamento == '1') {
							System.out.printf("│ │ XXXXXX    │ xx/xx/xxxx                       │ %.2f\t      │\t%d     │ │\n",valorOpcao1,1);
						}
						else if(opcaoPagamento == '2') {
							System.out.printf("│ │ XXXXXX    │ xx/xx/xxxx                       │ %.2f\t      │\t%d     │ │\n",valorOpcao2,1);
						}
						else if(opcaoPagamento == '3') {
							System.out.printf("│ │ XXXXXX    │ xx/xx/xxxx                       │ %.2f\t      │\t%d     │ │\n",valorOpcao3,2);
						}
						System.out.printf("│ └───────────┴──────────────────────────────────┴────────────────────┴───────┘ │\n");
						System.out.printf("│  Itens da Nota Fiscal                                                         │\n");
						System.out.printf("│ ┌───────┬─────────────────────────┬──────┬──────────┬───────────┬───────────┐ │\n");
						System.out.printf("│ │ Cód.  │ Produto                 │ QTDE.│ Valor Un.│ Valor Tot.│ Imposto   │ │\n");
						
						for(Produto comprados : carrinho) {
							if(comprados.getEstoque() != 0) {
								System.out.printf("│ │ %s │ %s  │  %d   │  %.2f   │ %.2f    │ %.2f     │ │\n",comprados.getCodigo(),comprados.getNome(),comprados.getEstoque(),comprados.getValor(),(comprados.getValor()*comprados.getEstoque()),(((comprados.getValor()*comprados.getEstoque())/ 100)*9));
						
							}
						}
						System.out.printf("│ └───────┴─────────────────────────┴──────┴──────────┴───────────┴───────────┘ │\n");
						System.out.printf("└───────────────────────────────────────────────────────────────────────────────┘\n");				
						
						System.out.println("Voltar para a página inicial? [S/N]: ");
						respostaContinuarCompras = leia.next().toUpperCase().charAt(0);
						respostaContinuarCompras = respostaVoltarPagina.validarSimOuNao(respostaContinuarCompras);	
						
						carrinho.clear();
						
						
					}
				}
			} while(respostaContinuarCompras == 'S');
			System.out.println("ATÉ BREVE!!");
		
		}
		else {
			System.out.println("ATÉ BREVE!");
		}
		leia.close();
	}
	
	// FUNÇÃO PÁGINA DE COMPRAS --------------------------------------------------------------------------------------------------------------------------------------------------------------------- //
			// Chama a "loja" com seus produtos e o carrinho.
			public static void paginaDeCompras (List<Produto> loja, Produto produtoSelecionado, int qtddDesejada) {
				
				
				limpa();
				cabecalho(4);
				System.out.println("║ Cód\t│ Produto\t\t\t│ Valor\t\t  │ Estoque\t\t║");
				linha(6);
							
				/* (laço para) que cria as informações presentes abaixo do menu: 
				códigos, produtos, valores e estoque.*/
				for (Produto vitrine : loja) { 
								
					System.out.printf("║ %s │ %s \t│ %.2f \t  │ %d \t\t\t║\n" ,vitrine.getCodigo(), vitrine.getNome(), vitrine.getValor(), vitrine.getEstoque());	
						
				}
							
				// carrinho de compras.
				int x = 0;
				boolean produtoPreSelecionado = false;
				for(Produto prodEscolhidos : carrinho) {
					if(prodEscolhidos.getCodigo() == produtoSelecionado.getCodigo()){
						
						carrinho.set(x, new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getNome(), produtoSelecionado.getValor(), qtddDesejada, produtoSelecionado.getCor(), produtoSelecionado.getTamanho()));
						
						produtoPreSelecionado = true;
					}
					x++;
				}
				if (produtoPreSelecionado == false) {
				carrinho.add(new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getNome(), produtoSelecionado.getValor(), qtddDesejada, produtoSelecionado.getCor(), produtoSelecionado.getTamanho()));
				}
				
				linha(1);
				System.out.printf("║ Carrinho de compras\t\t\t\t\t\t\t\t║\n");
				System.out.printf("║         ┌┐\t\t\t\t\t\t\t\t\t║\n");
				System.out.printf("║  ┌┬┬┬┬┬┐⌡ \t\t\t\t\t\t\t\t\t║\n");
				
				int carrinhoQuantidade = 0;
				
				for(Produto prodEscolhidos : carrinho) {
					if ( prodEscolhidos.getEstoque() != 0) {
							carrinhoQuantidade++;
					}
				}
				if (carrinhoQuantidade == 0) {
					System.out.printf("║  └____/ \t\t\t\t► Seu carrinho está vazio ◄\t\t║\n");
				}
				else  {
					System.out.printf("║  └____/ \t\t\t\t► Adicione mais produtos! ◄\t\t║\n");
				}
				System.out.print("║    σ  σ ["+carrinhoQuantidade+"]\t\t\t\t\t\t\t\t\t║\n");
				System.out.printf("║\t\t\t\t\t\t\t\t\t\t║\n");
				for(Produto prodEscolhidos : carrinho) {
					if (prodEscolhidos.getEstoque() != 0) {
					if (prodEscolhidos.getValor() < 100) {
						System.out.printf("║ %s│ %s\t\t│ %.2f\t\t  │[%d] QTDE - %d\t║\n",prodEscolhidos.getCodigo(),prodEscolhidos.getNome(),prodEscolhidos.getValor(),produtoSelecionado.getEstoque(),prodEscolhidos.getEstoque());
					}
					else {
						System.out.printf("║ %s│ %s\t\t│ %.2f\t  │[%d] QTDE - %d\t║\n",prodEscolhidos.getCodigo(),prodEscolhidos.getNome(),prodEscolhidos.getValor(),produtoSelecionado.getEstoque(),prodEscolhidos.getEstoque());
						
					}
					System.out.printf("║ Tamanho escolhido: %s │ Cor escolhida: %s\t\t\t\t\t║\n",prodEscolhidos.getTamanho(),prodEscolhidos.getCor());
					System.out.println("║\t\t\t\t\t\t\t\t\t\t║");
					}
				} 
				linha(7);
			}
				 {
					
					
				}
	
		//cabecalho (inteiro linhaPrincipal)
	public static void cabecalho(int linhaPrincipal)  {
		System.out.println("\t\t      ► PORTO GOL ACESSÓRIOS ESPORTIVOS ◄");
		System.out.println("\t Desconto real, qualidade constante, satisfação por inteiro !");
		linha(linhaPrincipal);	
	}
	
	
	
		// FIM DA FUNÇÃO PÁGINA DE COMPRAS --------------------------------------------------------------------------------------------------------------------- //	
	
			 public static void linha(int tipoLinha) {
		
		if(tipoLinha == 0) {
			
			System.out.println("║-------------------------------------------------------------------------------║");
		}
		else if(tipoLinha == 1) {
			
			System.out.println("╟───────┴───────────────────────────────┴─────────────────┴─────────────────────╢");
			
		}
		
		else if(tipoLinha == 6) { 
			System.out.println("╟───────┼───────────────────────────────┼─────────────────┼─────────────────────╢");
			
		}
		
		else if(tipoLinha == 3) {
			
			System.out.println("\n═══════════════════════════════════════════════════════════════════════════════");
			
		}
		
		else if(tipoLinha == 4) {
			
			System.out.println("\n╔═══════╤═══════════════════════════════╤═════════════════╤═════════════════════╗");
			
		}
		
		else if(tipoLinha == 5) {
			
			System.out.println("╚═══════╧═══════════════════════════════╧═════════════════╧═════════════════════╝");

		}

		else if(tipoLinha == 7) {
			
			System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");
		
		}
		
		else if(tipoLinha == 8) {
			
			System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
			
		}
		
		else if(tipoLinha == 9) {
		
			System.out.println("╟───────────────────────────────────────────────────────────────────────────────╢");
		}
		
		else if(tipoLinha == 10) {
			
			System.out.println("─────────────────────────────────────────────────────────────────────────────────");
			
		}
		
	}
	// FUNÇÃO LIMPA ---------------------------------------------------------------------------------------------- //

	public static void limpa() {
	
		for(int x = 0; x < 50; x++ ) {
			System.out.println("");
		}
	
	}
//FUNÇÃO LIMPA ---------------------------------------------------------------------------------------------- //
	

	
}