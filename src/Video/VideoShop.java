package Video;

import java.util.Vector;

public class VideoShop {
	private Vector<String> v = new Vector<String>();

	public VideoShop(){// ���� ���
		v.addElement(" �غ�");//0
		v.addElement(" ��");//1
		v.addElement(" ��󷣵�");//2

	}

	
	public synchronized String lendVideo() throws InterruptedException{// �ߺ����� ����ȭ ������ ����� �ֱ⋚���� synchronized �� ���ؼ� 

		Thread t = Thread.currentThread();//���� ���� �����尡 ������ �˾ƺ��� �޼ҵ�
		
		while(v.size()==0){
			System.out.println(t.getName()+ ": ��ȣǥ����");//t.getName() ���� ���� �޼ҵ��� �̸�

			this.wait();//���� �������� ���ٸ� �������������� ������ wait()�� �̿��Ͽ� ��ٸ��� ���� 
			System.out.println(t.getName()+ ": ��������");
		}

		String str = (String)this.v.remove(v.size()-1); //str�� Ȥ�ó� �����ؼ� ���� �˾ƺ��� ������ �����
		//v.size()-1 �Ǹ����� �� ���Ƿ� ���δ�. �����ϰ� �����ϱ� ���ؼ� �׳� �׷��Ը���
		return str;

	}

	public synchronized void returnVideo(String video){
		this.v.addElement(video);// �ٽ� �ݳ��ϸ� ���̰� �þ
		this.notify(); // �������ƿ��� �������� ��  wait()�� �ɷ��ִ� ������ Ȱ��ȭ
	}

}
