package ex_java;
import java.util.Scanner;

public class Ex08_03_String {

	public static void main(String[] args) {
		
		String a1="nice";
		String b1="nice";
		System.out.println(a1==b1);//같은 주소값을 갖게 된다. 공간하나의 주소를 저장함
		
		String c1=new String("nice");
		String d1=new String("nice");
		System.out.println(c1==d1);// 주소값 출력은 false로 나옴 객체를 각자 만들기떄문에
		
		
		String s1 ="     abc      DE   Fg   "; // 문자열은 자른자료형과는 다르게 주소값을 가지고 있는데 
		String msg;
		
		
		msg=s1.toUpperCase();// String클래스가 가지고 있는 메소드로 소문자를 대문자로 바꿔줌
		System.out.println("s1대문자: "+msg);
		
		System.out.println("s1소문자: "+s1.toLowerCase());// 소문자로 바꿔줌
 		
		msg= s1.trim();
		//trim(): 첫문자앞, 마지막문자뒤의 공백제거
		System.out.println("trim()후:"+msg);
		
		
		String s2 ="apple";
		System.out.println("대소문자까지 비교:"+ s2.equals("Apple")); // 대소문자까지 같은지 비교
		System.out.println("대소문자 무시:"+ s2.equalsIgnoreCase("Apple")); // 대소문자 무시하고비교하는 메소드
		//System.out.println(s2=="apple"); 이렇게 하지말고 문자열을 비교할때는 equals를 사용하자
		
		System.out.println("compareTo(s2):"+s2.compareTo("apple"));//String s2 ="apple"; 과 매개변수를 비교해서 같으면 0 리턴
		// 같으면 0
		// 기준이 크면 양수
		// 비교대상(매개변수)이 크면 음수
		// 일반적으로 0이냐 0이 아니냐?로 사용
		
		
		char at = s2.charAt(3);// 0부터시작해서 매개변수값의 숫자에 위치한 글자를 리턴
		System.out.println("4번쨰 위치한 문자"+at);
		
		String str1 = "Have a nice day";
		System.out.println(str1.indexOf("nice"));// 글자의 인덱스를 알려줌 없으면 -1을 리턴해줌
		System.out.println(str1.lastIndexOf("a"));// 마지막 a를 찾음
		System.out.println(str1.indexOf("good"));// 글자의 인덱스를 알려줌 없으면 -1을 리턴해줌
		
		System.out.println(str1.length());//길이는 1부터  위치만 0부터 시작함
		//length; 배열의 길이(방의 개수)
		//length(); 문자열의 길이를
		
		System.out.println(str1.substring(7, 11));//7~(11-1)까지의 문자열을 리턴 
		System.out.println(str1.substring(7));//7~끝까지의 문자열을 리턴 
		
		
		String fullName ="hello.java";
		String fileName = "",ext="";
		
		int x=fullName.indexOf("."); //기준점
		fileName=fullName.substring(0, x);
		ext=fullName.substring(x+1);
		System.out.println(fullName+"의 확장자를 제외한 이름은"+fileName);
		System.out.println(fullName+"의 확장자는"+ext);
		
		Scanner sc =new Scanner(System.in);//컨트롤+쉬프트 +알파벳O: 자동임포트
		
		String id="kim "; //뒤에 빈공간이 있음 먼저 제거해줘야함// 아이디와 비번은 참조변수
		String pw="1234"; //String pw =new String("1234");  
		
		System.out.print("ID:");
		String inputId =sc.next();
		
		System.out.print("PW:");
		String inputPw =sc.next();
		
		if(id.trim().equals(inputId) && pw.equals(inputPw)){//문자열은 == 으로 비교하지말자  // 숫자나char변수값을 비교할떄는 ==을 사용해야함
			System.out.println("로그인 가능");
		}else{
			System.out.println("로그인 불가능");
		}
		
		System.out.println(id);
		System.out.println(id.toString());//위아래 같은거
		//String은 toString 을 오버라이딩해놨는데 그래서 스트링에서는 문자열이 나오도록 오버라이딩해뒀음
		//String은 equals을 문자열을 비교하는 메소드로 오버라이딩해뒀음 그래서 스트링에서는 바로 문자열로 비교가 가능함
		
		
		
	}

}
