// 웹에서는 스레드가 자동으로 도 할수 있음 비교적 주요하지 않을수 있음
package Video;

public class Person extends Thread {

	public Person(String name){
		super(name);//Thread 생성자쪽으로 넘긴다는 말은 받는 이름을 스레드 이름을 만든다는뜻 
		//스레드이름:"닉쿤" "택연" "우영""찬성";
	}
	
	public void run(){// 여기는 4명다 들어와 있는 상태 이지만 synchronized 된 VideoShop 의 lendVideo() 가 한개씩밖에 접속 하지 못하기때문에 여기서 기다리고 있음 한명이 끝나면 바로들어감 
		String v;
		try {
			v = ThreadMain.vShop.lendVideo();
			System.out.println(this.getName()+":"+ v+"빌린다");
			System.out.println(this.getName()+":"+ v+"보는중\n");

			this.sleep(3000);
			System.out.println(this.getName()+":"+ v+"반납\n");
			ThreadMain.vShop.returnVideo(v);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}