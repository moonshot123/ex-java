package ex_java;
import java.util.Scanner;

public class Ex02_01_산술연산자 {
	public static void main (String [] args){
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		num2 = sc.nextInt();
		
		/**
		 * println과 printf 비교
		*/
		System.out.println("첫번째숫자:" + num1 +"두번째숫자:" + num2);
		
		System.out.println("더하기:" + (num1 + num2));
		System.out.println("곱하기:" + (num1 * num2));
		System.out.println("빼기:" + (num1 - num2));
		System.out.println("나누기:" + (num1 / num2)); //3.0
		System.out.println("나누기:" + ((double) num1 / num2)); //3.33333
		System.out.println("나누기:" + (double)( num1 / num2)); //3.0
		System.out.println("나머지:" + ( num1 % num2)); //1
		
		System.out.println();
		
			
		System.out.printf("num1:%d  이고 num2:%d 입니다.%n",num1,num2);  
		System.out.printf("num1:%5d 이고 num2:%-3d 입니다.%n",num1,num2);  //숫자를 써주면 간격이 나옴
		System.out.printf("%d / %d = %7.2f ",num1,num2,(double)num1/num2);  // 전체는 7자리, 소수점 밑에 2자리 그래서 소수점 앞은 5자리

		String name ="수지";
		System.out.printf("나의 이름은 %5s입니다.%n" , name);
		
		System.out.printf("%d / %d = %7.2f ",num1,num2,(double)num1/num2);  // 전체는 7자리, 소수점 밑에 2자리 그래서 소수점 앞은 5자리
		
		
		/*
		printf에서 쓸때
		int : %d   
		double, float : %f
		char : %c
		String : %s
		줄넘어가기 : %n
		*/
		
	}
}
