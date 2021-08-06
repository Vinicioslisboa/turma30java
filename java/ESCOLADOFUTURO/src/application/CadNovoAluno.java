package application;

public class CadNovoAluno {

	public static void main(String[] args) {

		Aluno exemplo1  = new Aluno();
		Aluno exemplo2 = new Aluno();

		exemplo1.nome ="EPAMINONDAS"; //objeto do tipo aluno
		exemplo1.matricula ="MAT-1";
		exemplo1.nota = 5;
		exemplo1.anoNascimento =1984;
		
		exemplo2.nome = "Maria";
		exemplo2.matricula = "MAT-4";
		exemplo2.nota = 10;
		exemplo2.anoNascimento =2002;
		
		if(exemplo1.nota > exemplo2.nota) {
			
			System.out.println("A nota maior é do aluno "+exemplo1.nome);
			
		}
		else {
			
			System.out.println("A nota maior é do aluno "+exemplo2.nome);
		}
		
		exemplo1.mostraIdade(2050);
		exemplo2.mostraIdade(2021);
		
		
		
	}

}
