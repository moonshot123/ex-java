package ex_java;
class Car4 {
	int wheel;
	void drive() {
		System.out.println("�θ� �θ�");
	}
}

public class Ex07_04_LocalInner {
	public static void main(String[] args) {
		class Truck extends Car4 {// ����Ŭ����: �޼ҵ� �ȿ����� Ŭ���� //���θ޼ҵ�ȿ����� ����ϰ� �ͱ⶧���� ��� // ū ������Ʈ�� �ҋ� ���� ���� ���� �̳� Ŭ������ü�� ���� ����������
			void drive() {
				final int door=4;
				System.out.println("����� ����");
				System.out.println("wheel:"+wheel);
			}
		} // Truck Ŭ������ ��

		Truck porter = new Truck();
		porter.wheel = 8;
		System.out.println("wheel:"+porter.wheel);
		porter.drive(); // ����� ����
	}
	
	Ex07_04_LocalInner e = new Ex07_04_LocalInner();
}