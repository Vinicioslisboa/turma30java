import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e Sets";
		
		
		ArrayList<String> aulas = new ArrayList<>();
		
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0); //remove uma parte da lista
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			
			System.out.println("Aula: "+ aula);
			
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: "+primeiraAula);
		
		for (int i = 0 ; i < aulas.size() ; i++) {
			
			System.out.println("Aula: "+ aulas.get(i));
		}
		
		System.out.println(aulas.size()); //diz quantas posi��es tem na lista
		
		/*aulas.forEach(aula -> {System.out.println("Percorrendo: ");
				System.out.println("Aula: "+aula);
				});*/
		
		aulas.add("Aumentando o nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas); //ordena em ordem alfab�tica
		System.out.println(aulas);
		
	}

}
