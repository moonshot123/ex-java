package ex_java;
class Car1 {
	Car1name name;
	String color;

	static class Car1name { // Car1 에서만 사용되는 Car1name클래스 //
		static String model; //static 변수이기때문에 클래스도 static을 붙여준다.7_3에서는 변수에는 static이 없는데 그럴때는 static을 붙여도 되고 없어도 된다.  
		int year;
		Car1name(String model, int year) {
			this.model = model; // Car1name.model = model; 가능 
			this.year = year; 
		}
		
	} // static inner의 끝

	Car1(String model, int year, String color) {
		this.name = new Car1name(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}

public class Ex07_02_staticInner {
	public static void main(String[] args) {
		Car1 pride = new Car1("프라이드", 2005, "파랑");
		pride.OutInfo(); // 모델 = 프라이드, 년식 = 2005, 색상 = 파랑

		Car1.Car1name sonata = new Car1.Car1name("소나타", 2009); //이너클래스를 통해 객체를 만드는 방법 >> 아우터클래스에서 안쪽으로 불러야됨
		System.out.printf("모델 = %s, 년식 = %d\n", sonata.model,sonata.year);

	}
}

