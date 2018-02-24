package ex_java;
import java.io.FileReader;
import java.util.Scanner;

public class Ex07_09_예외처리 {

	public static void main(String[] args) {
		System.out.print("두개의 정수입력:");
		Scanner input = new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		
		boolean div = divider(num1, num2);
		
		if(div){
			System.out.println("연산성공");
			
		}else{
			System.out.println("연산실패");
			
		}
	}	
		public static boolean divider(int num1, int num2){
			
			try{
				//FileReader fr = new FileReader("a.text"); RuntimeException이외의 클래스는 무조건 예외처리를 해줘야 한다. 
				int result = num1/num2;//예외가 생기면 new ArithmeticException
				System.out.println("나눗셈 결과는 "+ result);
				return true; 
				
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());// 예외상황이 발생한 이유
				System.out.println(e.toString()); //e.toString() 은 이유와 클래스 이름까지 나온다. 
				return false;
				
			}finally{
				System.out.println("finally 영역실행");
			}
			
		}
}
