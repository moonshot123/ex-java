package ex_java;
class Fruit{//����ڰ� ����� �ڷ��� 
	/*Ŭ�����ȿ� �ִº����� �������
	 * static �� �ִ� ���� : static����
	 * ��ü�� ��������� ���������� �ʴ� ���� :�ν��Ͻ����� 
	*/
	String name;//�ν��Ͻ�����
	int price;//�ν��Ͻ�����
	
} 

class Tv{
	String tv_name;//�ν��Ͻ�����
	int tv_price;//�ν��Ͻ�����
	int channel;//�ν��Ͻ�����
	String color;//�ν��Ͻ�����
	static String company; //static����(Ŭ��������): static �������� ���, ��ü�� ������ �ʾƵ� ����� �����Ѻ���
}

/*
Ŭ���� �̸� �ۼ���Ģ
���θ��� �ڷ����� ù���ڴ� �빮�ڷ�, 
Ư������ �ȵ� _�� ����, 
�߰��� ���ڰ� ���� ������ ó������ ���ڰ� ���� �ȵ�

���� �̸� ��Ģ 
Ư������ �ȵ� _�� ����, 
�߰��� ���ڰ� ���� ������ ó������ ���ڰ� ���� �ȵ�

*/

public class Ex05_01_Ŭ���� {

	public static void main(String[] args) {
	
		int a;
		double b;
		char c;
		
		a=3;
		Fruit f = new Fruit(); // new�� �̿��Ͽ� Fruit��� Ŭ������ �̿��ؼ� ��ü����(�޸� ������ �����.) //��ü ��� �ν��Ͻ�,,,,,
		// fruit r;    ���� Ŭ������ ���ٰ� ���� ��������
		f.name="���";
		String name="������";
		f.price=1000;
		
		System.out.println(f.name);
		System.out.println(f.price);
		System.out.println(name);
		
		Tv t =new Tv();//��ü ���� 
		
		Tv t1;
		t1 =new Tv();
		
		t.tv_name ="���Ƽ��";
		t.channel=7;
		t.color="��";
		t.tv_price=100;
		t.company="LG";
		Tv.company="LG"; //��ó�� ���� ������, �Ϲ������� �̷��� �� //����ƽ������ TvŬ������ ���ɶ� �ٷ� �޸𸮿� �Ҵ��

		t1.tv_name = "�����";
		t1.channel=49;
		t1.color="���";
		t1.tv_price=850;
		
		System.out.println(t.tv_name);
		System.out.println(t1.tv_name);
		System.out.println(t1.company);
		System.out.println(Tv.company);
		
		
		
		
		
		
	}

}
