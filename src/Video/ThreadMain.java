package Video;

public class ThreadMain {
	public static VideoShop vShop = new VideoShop();
	
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		Person p1 = new Person("����");//�����̶�� �̸��� �����带 �����.
		Person p2 = new Person("�ÿ�");//�ÿ��̶�� �̸��� �����带 �����.
		Person p3 = new Person("�쿵");//�쿵�̶�� �̸��� �����带 �����.
		Person p4 = new Person("����");//�����̶�� �̸��� ����带 �����.
		
		p1.start();//Person�� run ���ν���
		p2.start();
		p3.start();
		p4.start();
		System.out.println("���α׷� ����");
		
	}

}
