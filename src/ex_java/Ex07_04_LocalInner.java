package ex_java;
class Car4 {
	int wheel;
	void drive() {
		System.out.println("부릉 부릉");
	}
}

public class Ex07_04_LocalInner {
	public static void main(String[] args) {
		class Truck extends Car4 {// 지역클래스: 메소드 안에들어가는 클래스 //메인메소드안에서만 사용하고 싶기때문에 사용 // 큰 프로젝트를 할떄 아주 가끔 사용됨 이너 클래스자체가 많이 사용되지않음
			void drive() {
				final int door=4;
				System.out.println("우당탕 쿵탕");
				System.out.println("wheel:"+wheel);
			}
		} // Truck 클래스의 끝

		Truck porter = new Truck();
		porter.wheel = 8;
		System.out.println("wheel:"+porter.wheel);
		porter.drive(); // 우당탕 쿵탕
	}
	
	Ex07_04_LocalInner e = new Ex07_04_LocalInner();
}