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
		super(name);// �θ��� �����ڸ� ȣ��(�θ��� �Ű������� ���� �����ڸ� ȣ��, ��ȣ�� ��ĭ�̶�), ������ �ȿ����� ����� �� �ִ�. // super�� �Ƚᵵ �θ��� �����ڷ� �� �Ƚᵵ ��
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
		
		Parent2 p = new Parent2("����");
		Child2 c = new Child2("ö��",30);
		
		System.out.println(p);
		System.out.println(c);
	}

}
