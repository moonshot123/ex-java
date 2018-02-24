package ex_java;
class Person{
	String name;
	int age;
	int height;
	static String nation;
}		
	


public class Ex05_02_Å¬·¡½º {
		
	public static void main(String[] args) {
		
		
		Person g = new Person();
		Person b = new Person(); 
		
		g.name ="¿µÈñ";
		g.age = 10;
		g.height =160;
		Person.nation="´ëÇÑ¹Î±¹";
		
		b.name="Ã¶¼ö";
		b.age=80;
		b.height= 180;
		
		
		System.out.println(g.name);
		System.out.println(g.age);
		System.out.println(g.height);
		System.out.println(Person.nation);
		
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.height);
		System.out.println(Person.nation);
		
		Fruit f =new Fruit();
		
		
		
		System.out.println(f.name);
		
		
		
	}

}
