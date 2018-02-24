package ex_java;
class Sub{
	int x=2;
	void show(){
		System.out.println(x*x);
	}
}


class Sub2 extends Sub{//일반적으로 show()를 오버라이딩해서 새로운 show()를 만드는방법을 사용하는데 이렇게 따로 클래스를 만들지 않고도 할수 있음
	void show(){
		System.out.println(x*x*x);
	}
}

public class Ex07_05_익명클래스 {

	public static void main(String[] args) {
		
		Sub s1 =new Sub();
		s1.show();
		
		Sub2 s2 =new Sub2();
		s2.show();
	
		
		new Sub(){//show()를 오버라이딩을 하지않고 객체를 만드는 것처럼 만들지만 그사이에 내가 원하는 메소드를 재정의
			void show(){
				System.out.println(x*x*x*x);
			}
		}.show();

		
		new Sub(){//이런것을 익명클래스라고함
			void show(){
				System.out.println(x*x*x*x*x);
			}
		}.show();
		
		
	}

}
