package Lista4_POO;

public class cliente_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente exp1 = new cliente();
		exp1.nome = "Beatriz";
		exp1.numeroMatricula = "2021-M2E";
		exp1.idade = 65;
		
		
		System.out.println("Seu n� de matricula �: "+exp1.numeroMatricula);
		System.out.println("Seu nome �: "+exp1.nome);
		exp1.idade(2021, 1996);
		
		
	}

}
