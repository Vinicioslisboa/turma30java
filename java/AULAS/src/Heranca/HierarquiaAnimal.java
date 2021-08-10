package Heranca;

public class HierarquiaAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro ("Thor", 3,"au au au", "correndo");
		Cavalo horse = new Cavalo ("Alazão", 7,"hin hin hin","correndo");
		Preguica preg = new Preguica ("Lerdin", 1,"zzzzzzzzzz","subindo a arvore");
		
		System.out.println(dog.getEmiteSom());
		System.out.println(horse.getEmiteSom());
		System.out.println(preg.getEmiteSom());

	}

}
