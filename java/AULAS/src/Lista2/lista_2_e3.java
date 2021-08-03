package Lista2;

import java.util.Scanner;

public class lista_2_e3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade < 15) {
			
			System.out.println("Você se encaixa na categoria: INFANTIL");
		}
		else if(idade >=15 && idade < 18) {
			
			System.out.println("Você se encaixa na categoria: JUVENIL");
		}
		else if(idade >=18 && idade <26) {
			
			System.out.println("Você se encaixa na categoria: ADULTO");
		}
		else {
			
			System.out.println("Você não se encaixa em nenhuma das categorias.");
		}
	
		
		
		leia.close();
	}
}
