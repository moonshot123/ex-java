package ex_java;
class Car2{
	String color = "white";
	int door =4;
	void drive(){
		System.out.println("drive");
	}
	
	void stop(){
		System.out.println("stop!!!");
	}
}


class FireEngine extends Car2{
	
	int door =6;
	int wheel =10;
	
	void water(){
		System.out.println("water!!!");
	}
	
	void drive(){
		
		System.out.println("FEdrive");
	}
	
	
}
//1.water  2.6  3.white  4.


public class Ex06_10_다형성 {

	public static void main(String[] args) {
		Car2 car= null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		
		fe.water();
		car =fe;
		//Car2 car = (Car2) fe 로 자동 형변환됨 
		// 업캐스팅 되었다.>>>>> 자식을 부모타입으로 바꾸는 작업,자동으로 이루어진다.  
		System.out.println(car.door); 
		//System.out.println(car.wheel);은 부모가 가지고 있지 않기 떄문에 오류가 생김
		System.out.println(car.color); 

		System.out.println(fe.door);//6
		System.out.println(fe.wheel);//10
		System.out.println(fe.color);//white
		//변수는 있으면 일단 다씀
		//메소드와 변수는 약간 차이가 있음 이해필요
		
		car.drive();
		
		if(car instanceof FireEngine){ // 참조변수 instanceof 클래스이름   *** 형변환 가능 여부 확인할때 사용
			//instanceof 
			//car를 FireEngine 타입으로 할수 있냐? == 부모를 자식타입으로 내릴수 있냐?      
			//업개스팅을 했다면 다운캐스팅이 가능  하지만 업캐스팅을 하지 않았다면 다운 캐스팅을 할 수 없음
			//여기 코드에서는  car =fe; 에서 업캐스팅을 했으므로 다운캐스팅 가능 
			System.out.println("다운캐스팅 가능");
		}else{
			System.out.println("다운캐스팅 불가능");
		}
		
		fe2 = (FireEngine) car; 
		// 다운 캐스팅 한다. 부모를 자식 타입으로 바꿔주는것  
		//*** 꼭 업캐스팅을 해야 다운 캐스팅이 가능 하고 자동으로 되지 않기떄문에 꼭   (FireEngine) 입력해줘야한다.
		fe2.water();
	}

}

