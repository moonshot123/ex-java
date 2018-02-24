package ex_java;
//인터페이스란 미완성된 메소드만 있는 클래스
interface Cpoymachine{//public abstract 생략된것
	void copy();// 미완성메소드인데 abstract가 없지만 interface가 있음 오히려 중괄호를 하면 오휴가 생김
	int a=3;//인터페이스 안에 값을 넣으면 final처럼 상수처럼 값을 변화 시킬수 없다.
	//a=4; 그래서 이렇게 값을 바꾸려고 하면 오류가 생긴다.
}

interface Printmachine{
	void Print();
}

interface Faxmachine{
	void fax();
}
// 추상메소드와 비슷하지만 전부 미완성된 메소드와 상수만 들어와야됨

class sub{
	// 일반 클래스를 상속하려면 extends sub로 똑같이 쓰면됨 하지만 순서는 extends XXX implements 순서
}

class Compound extends sub implements Cpoymachine,Printmachine,Faxmachine{//인터페이스를 상속받을떄는 implements라고한다. 상속받은건 무조건 아래 포함하고 있어야 한다.
	// 상속은 한개 밖에 받지 못하지만 여기처럼 (Cpoymachine,Printmachine,Faxmachine)이렇게 여러개를 상속받을수 있다. : 다중 상속
	public void copy(){
	System.out.println("복사한다");	
	}
	public void Print(){
	System.out.println("프린트한다");	
	}
	public void fax(){
	System.out.println("팩스보낸다");	
	}
}

public class Ex06_14_인터페이스 {

	public static void main(String[] args) {
		
		Compound c = new Compound();
		c.copy();
		Faxmachine f = new Compound(); // Faxmachine f = new Faxmachine();은 에러
		f.fax();//f.print();은 에러

	}

}
