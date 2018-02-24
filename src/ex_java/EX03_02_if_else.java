package ex_java;
import java.util.Scanner;

public class EX03_02_if_else {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력:");
		num = sc.nextInt();
		
		System.out.println("num:" + num);
		
		if(num<=10 && num>=1){
			System.out.println("1~10사이의 수");
		
		}else if(num>=11 && num<=20){
			System.out.println("11~20사이의 수");
			
		}else{
			System.out.println("20이상 수");
			
		}
		
		
		if(num%10 == 0){
			System.out.println("10배수입니다.");
			
		}else if(num%5 ==0){ //else가 연결고리로 앞의 조건에서 걸리면 뒤에는 안나옴 5의 배수인지는 안나옴 
			System.out.println("5배수입니다.");			
		}
		
		
		if(num%10 == 0){
			System.out.println("10배수입니다.");
			
		}if(num%5 ==0){ //if한개씩 전부 확인 함 (모든 조건 확인) 
			System.out.println("5배수입니다.");			
		}
		
		
			System.out.println("자바 공부하는 중");
			
	}

}
