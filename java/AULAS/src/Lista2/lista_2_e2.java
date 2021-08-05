package Lista2;
import java.util.Scanner;

public class lista_2_e2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double x=0.00,y=0.00,z=0.00;
		
		System.out.println("Digite o primeiro valor: ");
		x = leia.nextDouble();
		System.out.println("Digite o segundo valor: ");
		y = leia.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		z = leia.nextDouble();

		if( ( x > y && x > z ) && ( y > z ) ) { //  x > y > z
		    System.out.println(x);
		    System.out.println(y);
		    System.out.println(z);
		}
		else if( ( x > y && x > z ) && ( z > y ) ) { // x > z > y
		    System.out.println(x);
		    System.out.println(z);
		    System.out.println(y);
		}
		else if( ( y > x && y > z ) && ( x > z ) ) { // y > x > z
		    System.out.println(y);
		    System.out.println(x);
		    System.out.println(z);
		}
		else if( ( y > x && y > z ) && ( z > x ) ) { // y > z > x
		    System.out.println(y);
		    System.out.println(z);
		    System.out.println(x);
		}
		else if( ( z > x && z > y ) && ( x > y ) ) { // z > x > y
		    System.out.println(z);
		    System.out.println(x);
		    System.out.println(y);
		}
		else if( ( z > x && z > y ) && ( y > x ) ) { // z > y > x
		    System.out.println(z);
		    System.out.println(y);
		    System.out.println(x);
		}
		
		
		
		leia.close();
	}

}
