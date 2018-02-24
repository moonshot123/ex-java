package ex_java;
class Tv3{
	String color;
	boolean power;
	private int ch;
	
	// 어차피 생성자에서 값을 입력하기 떄문에 setter에서 필요는 없음
	/*void setCh(int ch){
		this.ch=ch;
	}*/
	int getCh(){
		return ch;
	}
	
	
	Tv3(){//t1객체가 생성될때 시작됨
		// 생성자:클래스와 이름이 같은 메소드
		// 리턴타입이 없다.(void도 사용하지 않음)
		// 객체를 만들면 자동으로 호출됨
		System.out.println("Tv3 생성자 입니다.");
		color ="yellow";
		power = true;
		ch=9;
		//일반적으로 객체가 생성되면서 메모리가 생성될떄 필요한 작업을 함  ex)값을 초기화 
		//멤버변수가 private 되어 있더라도 같은 클래스 내에 있으므로 바꿀수 있기떄문에 편리함 
	}
	// 생성자도 오버로딩을 만들수 있다.
	// 아래 생성자를 만들면(오버로딩) 기본생성자가 자동으로 만들어 지지 않기때문에 필요하지않더라도 직접 만들어야한다.  
	Tv3(String color, boolean power, int ch) {//t2객체가 생성될때 시작됨
		this.color=color;
		this.power =power;
		this.ch=ch;
	}
	
}


public class Ex05_14_생성자 {

	public static void main(String[] args) {

		Tv3 t1 = new Tv3();// 객체가 생성(메모리 공간이 확보) 되면 생성자가 자동으로 호출됨  
		System.out.println(t1.color);
		System.out.println(t1.power);
		//System.out.println(t1.ch);
		System.out.println(t1.getCh());
			
		Tv3 t2 = new Tv3("red",false,20);// 객체가 생성(메모리 공간이 확보) 되면 생성자가 자동으로 호출됨  
		System.out.println(t2.color);
		System.out.println(t2.power);
		//System.out.println(t2.ch);
		System.out.println(t2.getCh());
		// 객체가 생성될떄마다 
		
		
	}

}
