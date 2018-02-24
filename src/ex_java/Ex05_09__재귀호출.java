package ex_java;
import java.util.Scanner;

public class Ex05_09__재귀호출 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int n = sc.nextInt();
		
		int result= recursive(n);
		System.out.println("2의 "+n+"승은 "+result+"입니다.");
		
		
		System.out.print("정수1:");
		int a =sc.nextInt();
		System.out.print("정수2:");
		int b =sc.nextInt();
		int result2 = recur(a,b);
		System.out.println(a+"의 "+b+"승은 "+result2+"입니다");
	}

	
	
	static int recur(int a, int b) {//위에 있는 int a =sc.nextInt(); a와 매개변수는 같은a가 아니다.
		if(b==0){
			return 1;
		}else{
			return a*recur(a,b-1);
		}
	}
	
	
	static int recursive(int n) {
		if(n==0){
			return 1;
		}else{
			return 2*recursive(n-1);
		}
	}
	
}
