package ex_java;
class Parent{
	/*private*/ int x=10;
	void sub(){
		//int x=11;
		System.out.println("parent sub x="+x);
	}
}


class Child extends Parent{
	int x=20;  //�켱����2 �ν��Ͻ����� 
	
	void method(){
		int x=30;  //�켱����1 ��������   
		System.out.println("x="+x); //���������� �켱������ ������� //���������� ����ٸ� �ν��Ͻ� ������ ����� 
		System.out.println("this.x="+this.x); 
		System.out.println("super.x="+super.x);// �θ��� ������ ã�� �ڽ��� ������ �־ ���� �ʴ´�. //�θ��� ������ private�� �ϸ� ������ް� super�� ������ ������ ����� �ȵ� 
		//�̷��� ������ �ذ��ϱ� ���ؼ��� ���� ���͸� ����ؾ� �ɰ� ����.
		//super�� �θ��� ������ ã�°��� �ƴ϶� �޼ҵ嵵 ������
		sub();
		super.sub();
		
	}
	
	void sub(){
		//int x=11;
		System.out.println("child sub x="+x);
	}
	
}



public class Ex06_06_super {

	public static void main(String[] args) {
		Child c= new Child();
		c.method();
		c.sub();
	}

}
