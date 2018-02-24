package ex_java;
class Tv2{
	private String color; // 멤버변수를 private으로 만들면color변수를 외부 클래스에서 사용이 불가능해짐 
	private boolean power;
	private int ch;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getPower() {// 자동완성기능으로 하면 boolean형은 get이 is로 바뀌기 떄문에 
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	

	void power(){
		power=!power; // 같은 클래스 안에서는 가능 하지만 아래있는 클래스는 안됨
	}
	
	
	/*
	void setColor(String c){//setter 메소드
		color=c;
	}
	String getColor(){//getter 메소드
		return color;
	}	
	
	void setCh(int i){//setter 메소드
		//setter나 getter에 조건을 넣어주어서 필요한대로 바꿀수도 있음
		ch=i;
	}
	
	int getCh(){//getter 메소드
		return ch;
	}
	
	void setPower(boolean t){//트루인지 폴스인지 보낼거
		power = t;
	}
	
	boolean getPower(){//
		return power;
	}*/
}



public class Ex05_12_setter_getter {

	public static void main(String[] args) {
		
		Tv2 t= new Tv2();
		//t.color="red"; 
		t.setColor("red");
		System.out.println(t.getColor());
		
		//System.out.println(t.color);
		//System.out.println(t.power);//아직 값을 넣지는 않았지만 기본값인 나옴
		//t.power();
		t.setPower(true);//set파워를 통해 true를 넣겠다. 라는 뜻
		//System.out.println(t.power);//power메소드를 통해 값을 바꿈
		System.out.println(t.getPower());
		//t.ch=11;
		t.setCh(11);
		//System.out.println(t.ch);
		System.out.println(t.getCh());
	}

}
