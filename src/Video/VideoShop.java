package Video;

import java.util.Vector;

public class VideoShop {
	private Vector<String> v = new Vector<String>();

	public VideoShop(){// 비디오 등록
		v.addElement(" 해빙");//0
		v.addElement(" 콩");//1
		v.addElement(" 라라랜드");//2

	}

	
	public synchronized String lendVideo() throws InterruptedException{// 중복으로 동기화 문제가 생길수 있기떄문에 synchronized 를 통해서 

		Thread t = Thread.currentThread();//지금 들어온 스레드가 뭔지를 알아보는 메소드
		
		while(v.size()==0){
			System.out.println(t.getName()+ ": 번호표받음");//t.getName() 현재 들어온 메소드의 이름

			this.wait();//전부 빌려가서 없다면 마지막스레드인 찬성은 wait()을 이용하여 기다리게 만듬 
			System.out.println(t.getName()+ ": 다음순서");
		}

		String str = (String)this.v.remove(v.size()-1); //str은 혹시나 리턴해서 값을 알아보고 싶으면 사용함
		//v.size()-1 맨마지막 을 임의로 줄인다. 간단하게 설명하기 위해서 그냥 그렇게만듬
		return str;

	}

	public synchronized void returnVideo(String video){
		this.v.addElement(video);// 다시 반납하면 길이가 늘어감
		this.notify(); // 찬성을꺠워서 가져가게 함  wait()에 걸려있던 스레스 활성화
	}

}
