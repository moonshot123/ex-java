package ex_java;
public class Ex10_05_우선순위 {

	public static void main(String[] args) {
		
		Horizontal h = new Horizontal();// Thread를 상속받기 때문에 바로 클래스로 객체만들수 있음
		//h.start();
		h.setName("철수");
		System.out.println(h.getName());//Thread이름 보는방법
		
		Vertical v =new Vertical();
		//v.start();
		v.setName("영희");
		System.out.println(v.getName());
		
		
		System.out.println(h.getPriority());// 기본우선순위는 5이다. 숫자가 높으면 우선순위가 높다.
		h.setPriority(9);
		
		h.start();
		v.start();
	}
}



class Horizontal extends Thread{
	public void run(){// run 이라고 되어있지만 run 메소드라고 하지는 않음
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

