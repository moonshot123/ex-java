package ex_java;
class Animal{
	public void bark(){
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark(){
		System.out.println("¸Û¸Û");
	}
}



public class Ex06_09_´ÙÇü¼º {

	public static void main(String[] args) {
		Animal a =new Dog();
		a.bark();// °á°ú°¡ ¸Û¸Û À¸·Î ³ª¿È
		
		//Dog b =new Dog();
		//b.bark(); // Â÷ÀÌÁ¡À» ¾Ë¾Æº¸ÀÚ
	}

}
