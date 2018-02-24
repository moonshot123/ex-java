package ex_java;
public class Ex06_11_������ {

	public static void action(Robot r){ //Robot r�� 
		//r.dance()�� ���� ���� ������ �θ�Ŭ������ dance�� ���⵵ �ϰ� �ڽ��� ������ �ִ� �ڱ��ڽ�Ÿ���� ���� ��������� ��� ������ �� 
		
	if(r instanceof DanceRobot){//r�� DanceRobot ���� �ٲܼ� �ֳ�??? ����ǹ� arr[0](�����ּҰ�:100)������ DanceRobot�� ��ĳ������ �ϱ⶧���� �̰� �����
		DanceRobot dr =(DanceRobot)r;
		dr.dance();
	}else if(r instanceof SingRobot){// r�� SingRobot ���� �ٲܼ� �ֳ�??? ����ǹ� arr[0](�����ּҰ�:200)������ SingRobot�� ��ĳ������ �ϱ⶧���� �̰� �����
		SingRobot sr =(SingRobot)r;  // r�� ����ϱ� ���ؼ� �ٽ� SingRobot���� �ٿ�ĳ���� ���ְ� ???????�׷��� �� ������ �ּҰ��� �� �ִµ� �ٷ� ���ϰ� �ٿ�ĳ������ �ϰ� ȣ���� �ұ�???
		sr.sing();					 // �ٽ�sing�޼ҵ带 ������    �ٷ����� �ڵ带 �Ⱦ��� r.sing();�� �Ⱦ��� �̷��� ����?
	}else if(r instanceof DrawRobot){
		DrawRobot dr =(DrawRobot)r;
		dr.draw();
	}
	
	//(�θ� instanceof �ڽ�)  ���谡 �´��� Ȯ���ϴ°� ��Ӱ��踦 Ȯ���ϴ� ������ ��������.
	
}	
	
	public static void main(String[] args) {
		
		Robot[] arr ={//RobotŸ������ ���� �־ �ٸ� 3���� ��ü�� ���� �ټ� �ִ�.
						(Robot)new DanceRobot(),
						new SingRobot(),//Robot ����
						new DrawRobot()};//Robot ����
		
		for(int i =0; i<arr.length;i++){
			action(arr[i]);//arr[i]�� ������ �ּҰ��� ��Ÿ��  >>>  ��ü�� �ּҰ��� action()�� �Ѿ�°���
			//������ ��ü�� action�� ���ֱ� ���ؼ��� �������� ���� �������� ������ �������� �̿��ϸ� action()�Ѱ����� �̿��ؼ� ����� �ֱ� ������ �������� �����ϰ� �ڵ��� �� �� �ִ°� ����. 
		}
		
	}

}


class Robot{}//�ƹ��� ���뵵 ���� Ŭ������ �ָ������?
//�Ʒ� Ŭ�������� ������� �����ִ°� ������ ������ֱ� ������ �θ� �ڽİ���
class DanceRobot extends Robot{
	void dance(){
		System.out.println("���� ��ϴ�.");
	}
}




class SingRobot extends Robot{
	void sing(){
		System.out.println("�뷡�� �մϴ�.");
	}
}




class DrawRobot extends Robot{
	void draw(){
		System.out.println("�׸��� �׸��ϴ�.");
	}
}
