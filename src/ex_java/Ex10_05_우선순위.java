package ex_java;
public class Ex10_05_�켱���� {

	public static void main(String[] args) {
		
		Horizontal h = new Horizontal();// Thread�� ��ӹޱ� ������ �ٷ� Ŭ������ ��ü����� ����
		//h.start();
		h.setName("ö��");
		System.out.println(h.getName());//Thread�̸� ���¹��
		
		Vertical v =new Vertical();
		//v.start();
		v.setName("����");
		System.out.println(v.getName());
		
		
		System.out.println(h.getPriority());// �⺻�켱������ 5�̴�. ���ڰ� ������ �켱������ ����.
		h.setPriority(9);
		
		h.start();
		v.start();
	}
}



class Horizontal extends Thread{
	public void run(){// run �̶�� �Ǿ������� run �޼ҵ��� ������ ����
		for(int i=0; i<300; i++){
			System.out.print("-");
			if(i%50 ==0){
				System.out.println();
			}
		}
	}
}

class Vertical extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("|");
			if(i%50 ==0){
				System.out.println();
			}
		}
	}
}

