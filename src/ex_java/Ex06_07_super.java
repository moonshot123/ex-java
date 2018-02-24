package ex_java;
class Parent2{
	
	String name;
	
	Parent2(){}

	public Parent2(String name) {
		System.out.println("Parent2()");
		this.name=name;
	}
	public String toString(){
		return name;
	}
	

}


class Child2 extends Parent2{
	//String name;
	int age;

	public Child2(String name, int age) {
		super(name);// 부모의 생성자를 호출(부모의 매개변수가 없는 생성자를 호출, 괄호가 빈칸이라서), 생성자 안에서만 사용할 수 있다. // super를 안써도 부모의 생성자로 감 안써도 됨
		System.out.println("child2(String name, int age)");
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return super.toString()+","+age;
	}
	
}




public class Ex06_07_super {

	public static void main(String[] args) {
		
		Parent2 p = new Parent2("영희");
		Child2 c = new Child2("철수",30);
		
		System.out.println(p);
		System.out.println(c);
	}

}
