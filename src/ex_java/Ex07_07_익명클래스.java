package ex_java;
interface RemoteControl{// �������̽��� �ϼ����� ���� �޼ҵ��̱⋚���� �ڽ�Ŭ�������� ������ �������� �Ǵµ� �͸�Ŭ������ �̿��ϸ� ����� �ִ�.
	void turnon();
	void turnoff();
}


public class Ex07_07_�͸�Ŭ���� {

	public static void main(String[] args) {
		
		RemoteControl ac = new RemoteControl() {
			
			public void turnon() {// �̿ϼ� �޼ҵ�turnon()�� �͸�Ŭ������ ����� �ϼ� ��Ų��.
				System.out.println("Ƽ�� �Ҵ�");
			}
			
			public void turnoff() {
				System.out.println("Ƽ�� ����");
				
			}
		};// ���Ⱑ ��ü�� �ϼ��Ǵ� �κ� >> �׷��� ��ü�ϼ� ������ �ȿ��� ������ �޼ҵ带 ����������  //�������� ���� 
		
		ac.turnon();//������ac
		ac.turnoff();
		
	}

}
