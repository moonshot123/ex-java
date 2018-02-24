package ex_java;
// 어려움 다시봐야될듯
class Ex10_06_Daemon implements Runnable  {
	
	static boolean autoSave = false; //autoSave를 모든메소드에 사용하려고 멤버변수로 만들어 놓음

	public static void main(String[] args) {
		Thread t = new Thread(new Ex10_06_Daemon());
		
		t.setDaemon(true); //run 이 실행됨 이름이 달라도 쓰레드에서는 전부 run메소드가 작동하는걸 유의하자!!!!!
 		//메인 메소드가 대몬메소드를 실행하고 싶을때 사용하는방법 // 데몬쓰레드로 만들면 메인쓰레드가 끝나면 알아서 같이 끝남 이게없으면 나머지 
		t.start();

		for(int i=1; i <= 20; i++) {
			try{
				Thread.sleep(1000); 
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5)
				autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() { 
		// 데몬 스레드로 설정되어서 main이 종료되면 데몬스레드도 자동종료된다.
		
		while(true) {
			try { 
				Thread.sleep(3 * 1000); 
			} catch(InterruptedException e) {}	

			if(autoSave) { //변수
				autoSave();//메소드
			}
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다."); 
	} 
}

