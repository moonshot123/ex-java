package ex_java;
class Person2{
	String name;
	int age;
}
class Student2{
	
	Person2 p=new Person2();
	int kor, eng;
	
	Student2(){
		
	}
	
	public Student2(String name, int age, int kor, int eng) {
		p.name=name;
		p.age=age;
		this.kor=kor;
		this.eng=eng;
	}

	void dispaly(){
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(kor);
		System.out.println(eng);
	}	
}



public class Ex06_08_Æ÷ÇÔ {

	public static void main(String[] args) {
		
		Student2 s =new Student2("Çý¸®",23,99,89);
		s.dispaly();
		System.out.println(s.kor);
		System.out.println(s.p.name);
	}

}
