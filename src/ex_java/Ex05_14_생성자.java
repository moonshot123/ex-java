package ex_java;
class Tv3{
	String color;
	boolean power;
	private int ch;
	
	// ������ �����ڿ��� ���� �Է��ϱ� ������ setter���� �ʿ�� ����
	/*void setCh(int ch){
		this.ch=ch;
	}*/
	int getCh(){
		return ch;
	}
	
	
	Tv3(){//t1��ü�� �����ɶ� ���۵�
		// ������:Ŭ������ �̸��� ���� �޼ҵ�
		// ����Ÿ���� ����.(void�� ������� ����)
		// ��ü�� ����� �ڵ����� ȣ���
		System.out.println("Tv3 ������ �Դϴ�.");
		color ="yellow";
		power = true;
		ch=9;
		//�Ϲ������� ��ü�� �����Ǹ鼭 �޸𸮰� �����ɋ� �ʿ��� �۾��� ��  ex)���� �ʱ�ȭ 
		//��������� private �Ǿ� �ִ��� ���� Ŭ���� ���� �����Ƿ� �ٲܼ� �ֱ⋚���� ���� 
	}
	// �����ڵ� �����ε��� ����� �ִ�.
	// �Ʒ� �����ڸ� �����(�����ε�) �⺻�����ڰ� �ڵ����� ����� ���� �ʱ⶧���� �ʿ������ʴ��� ���� �������Ѵ�.  
	Tv3(String color, boolean power, int ch) {//t2��ü�� �����ɶ� ���۵�
		this.color=color;
		this.power =power;
		this.ch=ch;
	}
	
}


public class Ex05_14_������ {

	public static void main(String[] args) {

		Tv3 t1 = new Tv3();// ��ü�� ����(�޸� ������ Ȯ��) �Ǹ� �����ڰ� �ڵ����� ȣ���  
		System.out.println(t1.color);
		System.out.println(t1.power);
		//System.out.println(t1.ch);
		System.out.println(t1.getCh());
			
		Tv3 t2 = new Tv3("red",false,20);// ��ü�� ����(�޸� ������ Ȯ��) �Ǹ� �����ڰ� �ڵ����� ȣ���  
		System.out.println(t2.color);
		System.out.println(t2.power);
		//System.out.println(t2.ch);
		System.out.println(t2.getCh());
		// ��ü�� �����ɋ����� 
		
		
	}

}
