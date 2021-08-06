package Lista4_POO;

public class cliente_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cliente exp1 = new cliente();
		exp1.nome = "Beatriz";
		exp1.numeroMatricula = "2021-M2E";
		exp1.idade = 65;
		exp1.dataRegistro = "11/08/2021";
		
		System.out.println("Seu nº de matricula é: "+exp1.numeroMatricula);
		System.out.println("Seu nome é: "+exp1.nome);
		exp1.idade(2021, 1996);
		
		
	}

}
