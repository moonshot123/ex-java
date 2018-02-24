package Video;

public class ThreadMain {
	public static VideoShop vShop = new VideoShop();
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Person p1 = new Person("닉쿤");//닉쿤이라는 이름의 스레드를 만든다.
		Person p2 = new Person("택연");//택연이라는 이름의 스레드를 만든다.
		Person p3 = new Person("우영");//우영이라는 이름의 스레드를 만든다.
		Person p4 = new Person("찬성");//찬성이라는 이름의 스헤드를 만든다.
		
		p1.start();//Person은 run 으로시작
		p2.start();
		p3.start();
		p4.start();
		System.out.println("프로그램 종료");
		
	}

}
