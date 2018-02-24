package ex_java;
// ����� �ٽú��ߵɵ�
class Ex10_06_Daemon implements Runnable  {
	
	static boolean autoSave = false; //autoSave�� ���޼ҵ忡 ����Ϸ��� ��������� ����� ����

	public static void main(String[] args) {
		Thread t = new Thread(new Ex10_06_Daemon());
		
		t.setDaemon(true); //run �� ����� �̸��� �޶� �����忡���� ���� run�޼ҵ尡 �۵��ϴ°� ��������!!!!!
 		//���� �޼ҵ尡 ���޼ҵ带 �����ϰ� ������ ����ϴ¹�� // ���󾲷���� ����� ���ξ����尡 ������ �˾Ƽ� ���� ���� �̰Ծ����� ������ 
		t.start();

		for(int i=1; i <= 20; i++) {
			try{
				Thread.sleep(1000); 
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() { 
		// ���� ������� �����Ǿ main�� ����Ǹ� ���󽺷��嵵 �ڵ�����ȴ�.
		
		while(true) {
			try { 
				Thread.sleep(3 * 1000); 
			} catch(InterruptedException e) {}	

			if(autoSave) { //����
				autoSave();//�޼ҵ�
			}
		}
	}
	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�."); 
	} 
}

