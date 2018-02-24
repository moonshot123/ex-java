package ex_java;
import java.util.Scanner;

public class Ex04_03_1차원입력 {

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc =new Scanner(System.in);
		/*
		System.out.print("숫자를 입력하세요:");
		x =sc.nextInt();
		
		System.out.print("한번더 숫자를 입력하세요:");
		y =sc.nextInt();
		
		
		System.out.println("1번:"+x +", 2번:"+y);
		*/
		
		int num []= new int[5];
		
		for(int e:num){
			System.out.print("숫자를 입력하세요:");
			e=sc.nextInt();
		}
		
		for(int e:num){
			System.out.print("숫자:"+ e + " ");
		}
		System.out.println();
		
		
		
		/*
		for(int i=0; i<num.length; i++){
			System.out.println();
			System.out.println("숫자"+(i+1)+":");
			num[i] =sc.nextInt();
		}
		System.out.println();
		
		
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		
		String s = "아이유";
		String str[] ={"수지","하니","오징어"};
		
		for(int i =0; i<str.length;i++){
			System.out.println(str[i]);
		}
		*/
		
		
		
	}

}
