package ex_java;
abstract class Shape { // �߻�Ŭ���� // �߻�Ŭ�����δ� ��ü�� ����� ����.
	public Shape() {
		System.out.println("���");
	}
	public void make(){
		System.out.println("���� �׸���");
	}
	public abstract void draw(); //�߻�޼��� 
	public abstract void delete(); //�߻�޼���
}
// �߻�޼���� ��ӹ��� Ŭ�������� �������Ͽ� �ϼ����Ѿ��Ѵ�.
// �߻�޼ҵ峪 Ŭ������ ����°��� �ڽĿ��� ������ �������̵��� �ϰ��� �������� �߻�޼ҵ带 �����. �׷��߸� �Ǽ��� ���� ���� �� �ֱ⋚���� �׷��� ����.
// �߻�޼ҵ�� �������� �κ��� �ڽ�Ŭ�������� ����� �ְ� ���� ���� �ؼ� ���� �ֵ��� ���Ǹ� �صδ°��̴�.
// ��ü���� ���ϼ��� �ֱ� ���ؼ� ���Ǵ°� 


class Circle extends Shape {
	//������
	//Ŭ������ �̸��� ������ 
	//��ü�� ����� �ڵ����� ȣ��ȴ�.
	//�����ڿ��� ��ó���� �Ű������� ���� super()�� ȣ��ȴ�. >> super: �θ��� �����ڸ� ȣ���ض�.
	public Circle() {
		System.out.println("��");
	}
	public void draw() {// �θ��� �̿ϼ� �޼ҵ带 �ڽ�Ŭ�������� �ϼ��Ѵ�.
		System.out.println("���� �׸��ϴ�");
	}
	public void delete() {// �θ��� �̿ϼ� �޼ҵ带 �ڽ�Ŭ�������� �ϼ��Ѵ�.
		System.out.println("���� ����ϴ�");
	}
	
}



class Triangle extends Shape {
	public Triangle(){
		
	}
	public void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
	public void delete() {
		System.out.println("�ﰢ���� ����ϴ�");
	}
}



public class Ex06_12_�߻�޼ҵ� {

	public static void main(String[] args) {
		
		//Shape s =new Shape(); �̿ϼ��޼ҵ尡 �ִ� ��ü�̹Ƿ� ��ü�� �������. 
		Circle c =new Circle();
		Triangle t =new Triangle();
		
		c.make(); c.draw(); c.delete();
		t.make(); t.draw(); t.delete();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Shape[] s= {
					new Circle(), // ��ĳ����(�ڵ�����ȯ)
					new Triangle()
					};
		
		for(int i=0; i<s.length;i++){
			s[i].make();
			s[i].draw();
			s[i].delete();
		}
	}
}
