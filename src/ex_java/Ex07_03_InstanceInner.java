package ex_java;
class Car2 {
	Car2name name;
	String color;

	class Car2name {
		String model; 
		int year;
		Car2name(String model, int year) {
			this.model = model;
			this.year = year;
		}

		Car2name(String model, int year, String col) {
			this.model = model;
			this.year = year;
			color = col; 
		}

		void Outcolor() {
			System.out.println("model:"+model+" 연식:"+year+" 색상:" + color + "입니다.");
		}
	}

	Car2(String model, int year, String color) {
		name = new Car2name(model,year);
		this.color = color;
	}

	void OutInfo() {
		System.out.printf("모델 = %s, 년식 = %d, 색상 = %s\n",
				name.model, name.year, color);
	}
}

public class Ex07_03_InstanceInner {
	public static void main(String[] args) {
		Car2 pride = new Car2("프라이드", 2005, "파랑");
		pride.OutInfo(); // 모델 = 프라이드, 년식 = 2005, 색상 = 파랑
		System.out.println();
		
		pride.name.Outcolor(); // model:프라이드 연식:2005 색상:파랑입니다.
		System.out.println();
		
		//Outer.Inner 변수명 = 외부객체.new Inner(생성자 인수)
		Car2.Car2name pride2 = pride.new Car2name("아반테", 2009);// 먼저 프라이드 객체를 만들어서 이후에 다시 그걸로 다시 객체를 만드는방법
		pride2.Outcolor(); // model:아반테 연식:2009 색상:파랑입니다.
		System.out.println();
		
	}
}