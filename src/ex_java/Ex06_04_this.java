package ex_java;
class Soshi{
	String name;
	int age;

	Soshi() {
		//name="�˰�";   
		//age=15;
		//this("�˰�",15);   �ٷ� �ᵵ ������ this�� �̿��ϸ� �� �����ϰ� ���� �ڵ带 ��Ȱ�� �� �� �ִ�.
		
		this("�˰�"); //�̳༮�� �Ʒ� �ִ� name�Ű����� �޴� ������ ���⼭ �ٽ� ���� �ؿ� �ִ� ������ ���� �Է� �޴´�. ���� �׷��� (�˰�, 10) ���� ����
	}
	Soshi(String name) {
		//���1	this.name=name;
		//		this.age=10;// ����� age�� �����Ƿ� this�� �ٿ��� �ǰ� �Ⱥپ ����� ����
		
		this(name, 10);// ������ ȣ��, ������ ȣ���ϴ� ���� ������ �ȿ����� ����� �ִ� �ٸ� �޼ҵ忡���� ����� �� ����. 
		//this�� ���� �Ű����� ���¸� ������ �ִ� ������(�Ʒ��ִ� ȿ��������)������ �������� �����ڸ� �����  
		
		System.out.println("123"); //������ ȣ���ϴ� �ڵ�� ������ �־�� �Ѵ�. ���࿡ ��¹� �������� ���� ������ ������ ��  
	}	
	Soshi(String name, int age) {
		this.name=name;
		this.age=age;
	}
		
	public String toString(){
		return name+","+age;
	}
}

public class Ex06_04_this {

	public static void main(String[] args) {
		
		Soshi s1 =new Soshi();
		Soshi s2 =new Soshi("Ƽ�Ĵ�");
		Soshi s3 =new Soshi("ȿ��",20);
		System.out.println(s3); //s3��ü�� �����ϸ� s3�� ���� ���°��� �ƴ϶� ��ü�� �ִ� �ּҰ��� ��Ÿ���ִ� �ּҰ��̴�.����غ��� �ּҰ��� ���� 
								//toString�� ���� ������ �ּ� ���� �����°��� �ƴ϶� ���� ����
		
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
