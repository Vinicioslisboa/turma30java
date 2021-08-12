package loja;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;


public class TesteList {

	public static void main(String[] args) {
		
		List<Produto> loja = new ArrayList<Produto>();
		Produto produto1 = new Produto("G2-10","MEIA",29.99,5);
		Produto produto2 = new Produto("G2-9","CALÇA",39.99,6);
		Produto produto3 = new Produto("G2-8","TENIS",129.99,2);
		loja.add(produto1);
		loja.add(produto2);
		loja.add(produto3);
		
		int x=0;
		for (Produto numProduto: loja) {
			
			System.out.printf("%s\t%s\t%.2f\t%d\n",loja.get(x).getCodigo(),loja.get(x).getNome(),
			loja.get(x).getValor(),loja.get(x).getEstoque());
			
			x++;
		}

	}

}