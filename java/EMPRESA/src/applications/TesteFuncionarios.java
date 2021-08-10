package applications;

import entities.Funcionarios;
import entities.Terceiro;

public class TesteFuncionarios {
	
	public static void main(String args[]) {
	
	Funcionarios func1 = new Funcionarios("GM-17", 44, 12);
	Terceiro func2 = new Terceiro("GM-37", 44,13,50);
	
	System.out.printf("Matricula: %s, horas trabalhadas: %d, valor por hora: %f, sálario: %f",func1.getMatricula(),func1.getHorasTrabalhadas(),func1.getValorPorHora(),func1.salario());

	}
	
}
