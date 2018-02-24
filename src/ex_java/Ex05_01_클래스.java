package ex_java;
class Fruit{//사용자가 만드는 자료형 
	/*클래스안에 있는변수를 멤버변수
	 * static 이 있는 변수 : static변수
	 * 객체가 만들어지기 전에사용되지 않는 변수 :인스턴스변수 
	*/
	String name;//인스턴스변수
	int price;//인스턴스변수
	
} 

class Tv{
	String tv_name;//인스턴스변수
	int tv_price;//인스턴스변수
	int channel;//인스턴스변수
	String color;//인스턴스변수
	static String company; //static변수(클래스변수): static 공통으로 사용, 객체를 만들지 않아도 사용이 가능한변수
}

/*
클래스 이름 작성규칙
새로만든 자료형은 첫글자는 대문자로, 
특수문자 안됨 _만 가능, 
중간에 숫자가 들어가도 되지만 처음에는 숫자가 들어가면 안됨

변수 이름 규칙 
특수문자 안됨 _만 가능, 
중간에 숫자가 들어가도 되지만 처음에는 숫자가 들어가면 안됨

*/

public class Ex05_01_클래스 {

	public static void main(String[] args) {
	
		int a;
		double b;
		char c;
		
		a=3;
		Fruit f = new Fruit(); // new를 이용하여 Fruit라는 클래스를 이용해서 객체생성(메모리 공간을 만든다.) //객체 비슷 인스턴스,,,,,
		// fruit r;    없는 클래스라서 없다고 나옴 오류원인
		f.name="사과";
		String name="오렌지";
		f.price=1000;
		
		System.out.println(f.name);
		System.out.println(f.price);
		System.out.println(name);
		
		Tv t =new Tv();//객체 생성 
		
		Tv t1;
		t1 =new Tv();
		
		t.tv_name ="평면티비";
		t.channel=7;
		t.color="블랙";
		t.tv_price=100;
		t.company="LG";
		Tv.company="LG"; //위처럼 가능 하지만, 일반적으로 이렇게 함 //스태틱변수는 Tv클래스가 사용될때 바로 메모리에 할당됨

		t1.tv_name = "모니터";
		t1.channel=49;
		t1.color="노랑";
		t1.tv_price=850;
		
		System.out.println(t.tv_name);
		System.out.println(t1.tv_name);
		System.out.println(t1.company);
		System.out.println(Tv.company);
		
		
		
		
		
		
	}

}
