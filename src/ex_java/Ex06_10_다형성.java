package ex_java;
class Car2{
	String color = "white";
	int door =4;
	void drive(){
		System.out.println("drive");
	}
	
	void stop(){
		System.out.println("stop!!!");
	}
}


class FireEngine extends Car2{
	
	int door =6;
	int wheel =10;
	
	void water(){
		System.out.println("water!!!");
	}
	
	void drive(){
		
		System.out.println("FEdrive");
	}
	
	
}
//1.water  2.6  3.white  4.


public class Ex06_10_������ {

	public static void main(String[] args) {
		Car2 car= null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		
		fe.water();
		car =fe;
		//Car2 car = (Car2) fe �� �ڵ� ����ȯ�� 
		// ��ĳ���� �Ǿ���.>>>>> �ڽ��� �θ�Ÿ������ �ٲٴ� �۾�,�ڵ����� �̷������.  
		System.out.println(car.door); 
		//System.out.println(car.wheel);�� �θ� ������ ���� �ʱ� ������ ������ ����
		System.out.println(car.color); 

		System.out.println(fe.door);//6
		System.out.println(fe.wheel);//10
		System.out.println(fe.color);//white
		//������ ������ �ϴ� �پ�
		//�޼ҵ�� ������ �ణ ���̰� ���� �����ʿ�
		
		car.drive();
		
		if(car instanceof FireEngine){ // �������� instanceof Ŭ�����̸�   *** ����ȯ ���� ���� Ȯ���Ҷ� ���
			//instanceof 
			//car�� FireEngine Ÿ������ �Ҽ� �ֳ�? == �θ� �ڽ�Ÿ������ ������ �ֳ�?      
			//���������� �ߴٸ� �ٿ�ĳ������ ����  ������ ��ĳ������ ���� �ʾҴٸ� �ٿ� ĳ������ �� �� ����
			//���� �ڵ忡����  car =fe; ���� ��ĳ������ �����Ƿ� �ٿ�ĳ���� ���� 
			System.out.println("�ٿ�ĳ���� ����");
		}else{
			System.out.println("�ٿ�ĳ���� �Ұ���");
		}
		
		fe2 = (FireEngine) car; 
		// �ٿ� ĳ���� �Ѵ�. �θ� �ڽ� Ÿ������ �ٲ��ִ°�  
		//*** �� ��ĳ������ �ؾ� �ٿ� ĳ������ ���� �ϰ� �ڵ����� ���� �ʱ⋚���� ��   (FireEngine) �Է�������Ѵ�.
		fe2.water();
	}

}

