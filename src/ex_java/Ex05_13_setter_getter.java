package ex_java;
class Person2{
	private String name; //���̿�                   // ���� �ִ°�: ����
	private int age; // 76
	private double height; //190.1
	
	//Person2(){} �̰� �ڵ����� �������
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age<0){
			this.age=0;
			return;
		}else{
			this.age = age;	
		}
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	
	
	
/*	void setName(String name){// �̷��ɾ��� ������ ������ ���� �ް� �ͱ⶧���̶�� ��? 
		this.name=name;  // this.name�� ��������� ���ϴ°�
	}
	
	String getName(){// set�� ���ϱ� ��¿�� ���� ���� ����� �ϴµ�
		return name;
	}
	
	void setAge(int age){
		this.age=age; //this.age �������
	}
	
	int getAge(){
		return age;//age�������
	}
	
	void setHeight(double height){
		this.height=height;//this.height�������
	}
	double getHeight(){
		return height;//height�������
	}*/
}


public class Ex05_13_setter_getter {

	public static void main(String[] args) {

		Person2 per = new Person2();
		
		per.setName("������"); // ���� �Է��Ҷ� ���
		System.out.println(per.getName()); // ���� ����Ҷ� ���
		
		per.setAge(28);// ���� �Է��Ҷ� ���
		System.out.println(per.getAge());// ���� ����Ҷ� ���
		
		per.setHeight(190.23);// ���� �Է��Ҷ� ���
		System.out.println(per.getHeight());// ���� ����Ҷ� ���
		
	}
}
