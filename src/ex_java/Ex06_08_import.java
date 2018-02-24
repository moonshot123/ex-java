package ex_java;
import java.util.Date;

import com.javastudy.Car;// 다른 패키지의 메소드를 쓸때 필요함




public class Ex06_08_import {

	public static void main(String[] args) {

		Car c =new Car("모닝",2010);
		c.prn();
		String str ="하하하";
		System.out.println(str);
		
		Date d=new Date(); // 컨트롤 + 쉬프트 + O // 오늘 날짜를 가져오는 것
		System.out.println(d);
		//String도 java.lang에 있는 클래스중 하나
		System.out.println(Math.PI);
	}

	
	//final 클래스
	//자식클래스를 만들수 없다. 상속을 해주지 않는다. 
	
	//final 메소드
	//자식이 부모의 메소드를 오버라이딩할수 없다
	
	
	//final 변수 (비교적 자주 사용됨)
	//값을 바꿀수 없다. 
	
	
}
