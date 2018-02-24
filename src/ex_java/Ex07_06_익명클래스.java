package ex_java;
class Car5{
	void drive(){
		System.out.println("부릉부릉");
	}
	void gogogo(){
		
	}
}


public class Ex07_06_익명클래스 {

	public static void main(String[] args) {
		
		//System.out.println("우당탕 쿵탕");
		
		
		new Car5(){
			void drive(){
				System.out.println("우당탕 쿵탕");
			}
		}.drive();//호출한다는 의미( 딱한번 사용됨 )
		// 익명클래스가 생각보다 쓰면 편할듯
		
		
		Car5 c =new Car5();
		c.drive();// 일반적인 호출
		
		
		
		
		new Car5().drive();//메소드를 한번 쓸꺼면 이렇게 써도 되지만 쓰지는 말자
		
		new Car5().gogogo();
		//이렇게 쓰면  new Car5().drive();, new Car5().gogogo(); 할떄 마다 새로운 객체가 만들어지므로 망함
		
		
		
		
	}

}
