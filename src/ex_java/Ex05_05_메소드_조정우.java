package ex_java;
import java.util.Scanner;

class Calculator{
	/*
	합을 반환 sum

	큰값을 반환 max

	작은 값을 반환 min*/
	
	int sum(int a, int b){
		//des[2]=100; des는 지역배열이므로 sub에서만 사용가능 함
		return a+b;
		
	}
	
	
	int max(int a, int b){ //같을때는 논리적오류가 있음.= 넣어줘야됨
		if(a<=b){
			return b;
		}
		return a;
	}
	
	
	int min(int a, int b){
		if(a<b){
			return a;
		}
		return b;
	}
	
	void sub(int des[]){
		int i;
		for(i=0; i<des.length;i++){
			System.out.println(des[i]+" ");
			
		}
		des[1]=100;
	}
	
	

}


public class Ex05_05_메소드_조정우 {

	public static void main(String[] args) {
		//자바가상머신에서 main메소드 만큼은 자동으로 호출해줌, 
		//메인 메소드에 static이 있기 때문에 자바가상머신에서 객체를 만들지 않아도 바로 실행할 수 있다.     


		
		Scanner sc=new Scanner(System.in);
		int x,y;

		Calculator cal =new Calculator();

		System.out.print("첫번째수를 입력하세요:");
		x=sc.nextInt();
		System.out.print("두번째수를 입력하세요:");
		y=sc.nextInt();

		System.out.println("두수의 합:"+cal.sum(x,y));
		System.out.println("큰값:"+cal.max(x,y));
		System.out.println("작은값:"+cal.min(x,y));

		/*		
		두수의 합을 리턴  30
		큰값을 리턴 20
		작은 값을 리턴
		 */	
		
		int arr [] ={10,20,30};
		cal.sub(arr); //배열을 넘긴다는건 배열의 주소값 (참조값)을 넘기는 거...
		System.out.println(arr[1]);
		//des[2]=100; 지역배열이기때문에 메인 메소드에서는 사용이 안됨 위에 sub에서만 사용 가능
		
	}
}
