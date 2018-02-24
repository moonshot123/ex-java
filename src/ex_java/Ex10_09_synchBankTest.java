package ex_java;
class Bank{
	private int money =10000;// 예금잔액

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int save){//메소드를synchronized 처리

		int m = this.getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m+save);
	}


	public void minusMoney (int minus){
		synchronized (this) {//this 현재클래스에서 공유자원 money 가 있기 떄문에  // () 안에는 접근할 공유자원클래스이름 
			//블럭을 synchronized 로 만듬 // 특정부분만 synchronized 로 만들고 싶을떄
			int m =this.money;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.setMoney(m-minus);
		}
	}

}

class Park extends Thread{
	public void run(){
		Ex10_09_synchBankTest.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000):" + Ex10_09_synchBankTest.myBank.getMoney());

		Ex10_09_synchBankTest.myBank.saveMoney(500);
		System.out.println("saveMoney(500):" + Ex10_09_synchBankTest.myBank.getMoney());
	}
} 
class Kim extends Thread{
	public void run(){
		Ex10_09_synchBankTest.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000):" + Ex10_09_synchBankTest.myBank.getMoney());
	}
} 

public class Ex10_09_synchBankTest {
	public static Bank myBank = new Bank();

	public static void main(String[] args) {

		System.out.println("원금:"+myBank.getMoney());

		Park p = new Park();
		Kim k = new Kim();

		p.start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		k.start();
	}

}
