import java.util.Scanner;

public class vetor_e_matriz_times {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String codTime[] = new String[4];
		String nomesTimes[] = {FLAMENGO, PALMEIRAS, SPFC, ATLETICOMG};
		int pontosTimes[] = {0,0,0,0};
		char op;
		
	
		for (int x=0 ; x < codTime.length ; x++) {
			
			codTime[x] = "CPF-0"+(x+1);
			
		}
		
		System.out.println("Inicio da tabela");
		System.out.println("COD\tTime\t\tPONTOS");
		
		for(int x=0 ; x<codTime.length ; x++) {
			
			System.out.printf("%s\t%s\t%d\n",codTime[x], nomesTimes[x], pontosTimes[x]);
			
		}
		
		System.out.println();
		
		for (int x=1 ; x<3 ; x++) {// Roda o numero de rodadas
			
			System.out.println("Rodada "+x;); 
			
			for(int y=0 ; y<codTime.length ; y++) {// roda todos os times
				
				System.out.print(nomesTimes[y]+" G-ganhou, P-perdeu, E-empatou: ");
				op = leia.next().toUpperCase().charAt(0);
				
				if(op == 'G') {
					
					pontosTimes[y] = pontosTimes[y]+3;
				}
				else if(op == 'E') {
					
					pontosTimes[y] += 1; 
				}
				
			}
		}
		
		
	}

}
