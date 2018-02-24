package ex_java;
interface RemoteControl{// 인터페이스는 완성되지 않은 메소드이기떄문에 자식클래스에서 완전히 만들어줘야 되는데 익명클래스를 이용하면 만들수 있다.
	void turnon();
	void turnoff();
}


public class Ex07_07_익명클래스 {

	public static void main(String[] args) {
		
		RemoteControl ac = new RemoteControl() {
			
			public void turnon() {// 미완성 메소드turnon()을 익명클래스를 만들어 완성 시킨다.
				System.out.println("티비를 켠다");
			}
			
			public void turnoff() {
				System.out.println("티비를 끈다");
				
			}
		};// 여기가 객체가 완성되는 부분 >> 그래서 객체완성 이전에 안에서 완전히 메소드를 만들어줘야함  //스윙에서 사용됨 
		
		ac.turnon();//관리자ac
		ac.turnoff();
		
	}

}
