package programas;

import entidades.Produto;

public class CadLoja {

	public static void main(String[] args) {
		
		
		Produto prod1 = new Produto("001", "CAMISA");
		Produto prod2 = new Produto("002" ,"CALÇA",100.50,10);
		
		
		prod2.setValor(120);
		System.out.println(prod2.getValor());
		

	}

}
