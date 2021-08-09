package Lista4_POO;

public class Aviao {
	
	public boolean ligarMotor;  //true liga / false desliga
	public boolean tremPouso; //true mostra  / false guarda
	public boolean aceleraFreia; //true acelera / false freia
	public boolean subirDescer; //true subir / false descer
	public boolean portas; //true abre portas / false trava portas

	public void processo(boolean ligarMotor) {
	
		this.ligarMotor = true;
		System.out.println("Motor da aeronave ligado !");
	
	
	if(portas == true) {
		
		System.out.println("Portas fechadas e travadas !");
		
	}
	else {
		
		System.out.println("Portas liberadas !");
	}
	
	
	if(aceleraFreia == true) {
		
		System.out.println("Acelerando aeronave ==> !");

	}
	else {
		
		System.out.println("Freiando aeronave <== !");
	}
	
	if(subirDescer==true) {
		
		System.out.println("Erguendo manche da aeronave até altura estabelecida. Aeronave subindo ! ");
	}
	else {
		
		System.out.println("Aeronave descendo !");
	}
	
	if(tremPouso==true) {
		
		System.out.println("Descendo trem de pouso, preparando para pousar !");
	}
	else {
		System.out.println("Recolhendo trem de pouso !");
	}
	
}}
