package ex_java;

public class Ex07_08_NullErrorTest {

	public static void main(String[] args) {
		/*
		String str ="ABC";
		System.out.println(str.length()); //3출력  : String 변수의 값의 길이를 구하라
		System.out.println("프로그램 종료");
		*/
		
		try{
			
			String str ="abc";
			System.out.println(str.length());// 아무것도 없는데 어떻게 길이를 구하냐? 오류발생
			// 예외가 발생하면 예외객체가 자동으로 만들어진다.
			//NullPointerException np = new NullPointerException();
			//NullPointerException : 실행할 값이 없다는 뜻
			//여기서 오류가 생기므로catch로 감 이후에 다시 여기로 오는것이 아니라  catch 아래로 계속 진행됨
			
			
			
			int [] arr = new int[3];
			arr[0]=3;
			arr[2]=6;//오류발생
			// ArrayIndexOutOfBoundsException ai =new ArrayIndexOutOfBoundsException();
			// 예외가 발생하면 예외객체가 자동으로 만들어진다.
			// ArrayIndexOutOfBoundsException : 방이 없는곳에서 입력할떄 오류 생김
			// 이런것들도 클래스이다. 자바 api에서 제공함
			
			int a=3/0;// 0으로 나누려고 할떄
			//ArithmeticException ae= new ArithmeticException();
			
			
		}catch(NullPointerException e ){//Exception e = new NullPointerException e()가능함  
										//왜냐면 Exception 이 부모이기떄문에 (NullPointerException e)을 (Exception e)게 써도 상관없음
			System.out.println(e /*.toString*/ + " 에러가 발생했습니다.");
			System.out.println("에러처리루틴 실행");
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println(e /*.toString*/ + " 에러가 발생했습니다.");
			System.out.println("배열의 범위를 넘었습니다.");
		}catch(ArithmeticException e ){ //e 지역변수이므로 똑같이 만들어도 상관없다.
			System.out.println(e /*.toString*/ + " 에러가 발생했습니다.");
			System.out.println("0으로 나눌수 없음");
		}finally{
			System.out.println("finally 구문");
		}
		System.out.println("프로그램 종료");
		
		//catch는 한번만 실행도니다고 보면된다.
		
		//Exception이 예외처리에서는 가장 높다고 생각하자.
		
	}

}
