// �������� �����尡 �ڵ����� �� �Ҽ� ���� ���� �ֿ����� ������ ����
package Video;

public class Person extends Thread {

	public Person(String name){
		super(name);//Thread ������������ �ѱ�ٴ� ���� �޴� �̸��� ������ �̸��� ����ٴ¶� 
		//�������̸�:"����" "�ÿ�" "�쿵""����";
	}
	
	public void run(){// ����� 4��� ���� �ִ� ���� ������ synchronized �� VideoShop �� lendVideo() �� �Ѱ����ۿ� ���� ���� ���ϱ⶧���� ���⼭ ��ٸ��� ���� �Ѹ��� ������ �ٷε� 
		String v;
		try {
			v = ThreadMain.vShop.lendVideo();
			System.out.println(this.getName()+":"+ v+"������");
			System.out.println(this.getName()+":"+ v+"������\n");

			this.sleep(3000);
			System.out.println(this.getName()+":"+ v+"�ݳ�\n");
			ThreadMain.vShop.returnVideo(v);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}