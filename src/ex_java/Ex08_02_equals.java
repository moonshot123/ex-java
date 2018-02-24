package ex_java;
class Fruit{
	String name;
	int price;
	
	public Fruit(){}
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//�����Ű������� ���� ���� fruit�ε� ���鼭 ������Ʈ�� �ٲ�°�
	public boolean equals(Object obj){//Object obj = (Object) f3 ���·� �� f3�� Object������ obj�� ��ĳ������ �Ǿ� �� 
		if(obj instanceof Fruit){ // obj �� Fruit�� �ٿ�ĳ�����Ҽ� �ֳ�? //�Ű��������� ���Ë� ��ĳ������ �Ǿ��⋚���� �ٿ�ĳ������ ����
			Fruit fff = (Fruit) obj;
			return fff.price==this.price && fff.name.equals(this.name);//������ ���ݺ�, �������� �̸���
		}else{
			return false;
		}
	}
	
}


public class Ex08_02_equals {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("apple",1000); // ��ü�� �����Ҷ��� String name, int price �� �Ű������� ���� �����ڸ� �������Ѵ�.
		Fruit f2 = new Fruit("orange",2000);
		Fruit f3 = new Fruit("grape",1000);
		
		System.out.println(f1==f2);//f1==f2 ���� f1�����������ν� �������� ������ �ִ�. �׷��� f1, f2�� �ּҰ� ������ ����� �� �翬�� �ٸ���.
		System.out.println(f1.equals(f3));//f1.equals(f3)�� f1�� f3�� �ּҰ��� ������ �� �ϴ°� == �� ����.
		System.out.println(f1.price==f3.price);//�̰͵� ���� 
		
		
		
		
	}

}
