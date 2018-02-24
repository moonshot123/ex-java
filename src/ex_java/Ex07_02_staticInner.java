package ex_java;
class Car1 {
	Car1name name;
	String color;

	static class Car1name { // Car1 ������ ���Ǵ� Car1nameŬ���� //
		static String model; //static �����̱⶧���� Ŭ������ static�� �ٿ��ش�.7_3������ �������� static�� ���µ� �׷����� static�� �ٿ��� �ǰ� ��� �ȴ�.  
		int year;
		Car1name(String model, int year) {
			this.model = model; // Car1name.model = model; ���� 
			this.year = year; 
		}
		
	} // static inner�� ��

	Car1(String model, int year, String color) {
		this.name = new Car1name(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("�� = %s, ��� = %d, ���� = %s\n",
				name.model, name.year, color);
	}
}

public class Ex07_02_staticInner {
	public static void main(String[] args) {
		Car1 pride = new Car1("�����̵�", 2005, "�Ķ�");
		pride.OutInfo(); // �� = �����̵�, ��� = 2005, ���� = �Ķ�

		Car1.Car1name sonata = new Car1.Car1name("�ҳ�Ÿ", 2009); //�̳�Ŭ������ ���� ��ü�� ����� ��� >> �ƿ���Ŭ�������� �������� �ҷ��ߵ�
		System.out.printf("�� = %s, ��� = %d\n", sonata.model,sonata.year);

	}
}

