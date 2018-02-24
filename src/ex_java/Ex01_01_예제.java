package ex_java;
import java.util.Scanner;

public class Ex01_01_예제 {
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		int ex_01;
		double ex_02;
		
		System.out.println("정수입력:"); 
		ex_01 = input.nextInt();
		
		System.out.println("소수점입력:"); 
		ex_02 = input.nextDouble();
		
		
		System.out.println("입력받은 정수"+ex_01);
		System.out.println("입력받은 소수"+ex_02);
		
		System.out.println("두수를 더하면:"+ (ex_02 + ex_01));
		
	}
		
}
