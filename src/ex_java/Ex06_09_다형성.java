package ex_java;
class Animal{
	public void bark(){
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark(){
		System.out.println("�۸�");
	}
}



public class Ex06_09_������ {

	public static void main(String[] args) {
		Animal a =new Dog();
		a.bark();// ����� �۸� ���� ����
		
		//Dog b =new Dog();
		//b.bark(); // �������� �˾ƺ���
	}

}
