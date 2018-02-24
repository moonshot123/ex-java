package ex_java;
public class Ex08_04_StringBuffer {

	public static void main(String[] args) {
		
		//String 클래스는 수정이 불가능한(Immutable) 클래스
		String str1 = "Have "; //str1.append("b "); 이런식으로 변경 안됨,에러남 // 주소값:100
		String str2 = "a ";	//주소값:200
		String str3 = "nice day";//주소값: 300
		String str4 = str1 + str2 + str3;//주소값 400
		System.out.println(str4);//주소값400
		String str5 = str4.replace("nice", "good");//replace는 변경하라는 메소드 인데 내가 변셩을 하고 싶으면 다시 str5를 만들어서 넣어줘야 한다.
		System.out.println(str5);// 이렇게 다시 간들어서 넣어줘야함// 주소값 500
		
		//StringBuffer 클래스는 수정이 가능한 클래스
		StringBuffer sb = new StringBuffer("Have "); //100번지
		sb.append("a "); // String에는 append가 없다. //append는 추가하는 메소드 >>>변경을해도 새롭게 만들 필요는 없음
		sb.append("nice day");//100번지 >> 변경을해도 새롭게 만들 필요는 없음
		sb.replace(7, 11, "good");//100번지 >> 변경을해도 새롭게 만들 필요는 없음
		String str = sb.toString();
		System.out.println(str);
		//속도차이가 나지만 문자열의 변경을 많이 하지 않는다면 그렇게 많이 사용되지 않음.
		
	}

}