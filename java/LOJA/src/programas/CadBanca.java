package programas;

import entidades.Doces;
import entidades.Revista;

public class CadBanca {

	public static void main(String[] args) {

		
		Revista rev1 = new Revista("004","Revista Craudia", 35.50, 30, "April");
		Doces doce1 = new Doces("006","Bala de banana",0.12, 1000, "Tagarela");
		
		
		System.out.println(doce1.getEstoque());
		doce1.incluiEstoque(1250);
		System.out.println(doce1.getEstoque());
	}

}
