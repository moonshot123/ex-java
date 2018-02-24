package ex_java;

public class Ex03_03_switchcase {

	public static void main(String[] args) {
		
		int num = 2;
		
		switch (num) {//스위치 괄호 안에는 정수, 문자열 등이 가능(O)    실수형은 안됨(X)			
			case 1:System.out.println("1입니다.");
				break;
			
			case 2:System.out.println("2입니다.");
				break;//브레이크를 만나면 스위치문끝으로 감
		
			case 3:System.out.println("3입니다.");
				break;
							
			default:System.out.println("1~3수아님");
				
		}//switch
		
		
		switch (num%2) {
			case 0:System.out.println("짝수");
				break;

			case 1:System.out.println("홀수");
				break;
		}//switch
		
		
		
		String fruit ="banana";
		
		switch (fruit) {
		case "apple":System.out.println("사과");
			break;
			
		case "banana":System.out.println("바나나");
			break;
			
		case "grape":System.out.println("포도");
			break;
			
		default:
			break;
		}
		
		
		System.out.println("swhitch 공부중");
		
		
		
		
		
	}

}
