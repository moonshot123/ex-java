package ex_java;
//�������̽��� �̿ϼ��� �޼ҵ常 �ִ� Ŭ����
interface Cpoymachine{//public abstract �����Ȱ�
	void copy();// �̿ϼ��޼ҵ��ε� abstract�� ������ interface�� ���� ������ �߰�ȣ�� �ϸ� ���ް� ����
	int a=3;//�������̽� �ȿ� ���� ������ finaló�� ���ó�� ���� ��ȭ ��ų�� ����.
	//a=4; �׷��� �̷��� ���� �ٲٷ��� �ϸ� ������ �����.
}

interface Printmachine{
	void Print();
}

interface Faxmachine{
	void fax();
}
// �߻�޼ҵ�� ��������� ���� �̿ϼ��� �޼ҵ�� ����� ���;ߵ�

class sub{
	// �Ϲ� Ŭ������ ����Ϸ��� extends sub�� �Ȱ��� ����� ������ ������ extends XXX implements ����
}

class Compound extends sub implements Cpoymachine,Printmachine,Faxmachine{//�������̽��� ��ӹ������� implements����Ѵ�. ��ӹ����� ������ �Ʒ� �����ϰ� �־�� �Ѵ�.
	// ����� �Ѱ� �ۿ� ���� �������� ����ó�� (Cpoymachine,Printmachine,Faxmachine)�̷��� �������� ��ӹ����� �ִ�. : ���� ���
	public void copy(){
	System.out.println("�����Ѵ�");	
	}
	public void Print(){
	System.out.println("����Ʈ�Ѵ�");	
	}
	public void fax(){
	System.out.println("�ѽ�������");	
	}
}

public class Ex06_14_�������̽� {

	public static void main(String[] args) {
		
		Compound c = new Compound();
		c.copy();
		Faxmachine f = new Compound(); // Faxmachine f = new Faxmachine();�� ����
		f.fax();//f.print();�� ����

	}

}
