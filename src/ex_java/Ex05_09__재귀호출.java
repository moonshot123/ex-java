package ex_java;
import java.util.Scanner;

public class Ex05_09__���ȣ�� {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int n = sc.nextInt();
		
		int result= recursive(n);
		System.out.println("2�� "+n+"���� "+result+"�Դϴ�.");
		
		
		System.out.print("����1:");
		int a =sc.nextInt();
		System.out.print("����2:");
		int b =sc.nextInt();
		int result2 = recur(a,b);
		System.out.println(a+"�� "+b+"���� "+result2+"�Դϴ�");
	}

	
	
	static int recur(int a, int b) {//���� �ִ� int a =sc.nextInt(); a�� �Ű������� ����a�� �ƴϴ�.
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
