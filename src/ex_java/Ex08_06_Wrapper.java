package ex_java;
//래퍼클래스는 lang클래스에 있으므로 따로 import를 하지 않아도 된다. 
public class Ex08_06_Wrapper {

	public static void main(String[] args) {
		//Integer it1=new Integer(11);
		Integer it1 =11;//autoboxing(자동으로 wrapper 클래스로 변환)
		Integer it2 =12;
		System.out.println(it1+it2);
		
		//Integer data=new Integer(21);
		//int it3 = data.intValue();
		Integer it3 =new Integer(21);
		Integer it4 =new Integer(22);
		//unboxing(자동으로 wrapper 자료형을 기본 자료형으로 변환)
		System.out.println(it3+it4);
		
		
		// 이건 좀 많이 쓸듯? INT형말고도 대부분 형태(double, float...)가 가능함 
		//문자열 >> 기본형으로 변환
		int i =Integer.parseInt("100");//문자열100을 숫자(int형)100으로 바꿔줌 
		int j =Integer.parseInt("200");//int로 리턴하지만 Integer로 만들어도 오토박싱을 하기때문에 가능함 하지만 왠만하면 맞춰서하는게 나을듯  
		System.out.println(i+j);
		
		Integer ii =Integer.valueOf("300");
		Integer jj =Integer.valueOf("400");//Integer로 리턴하지만 int로 바꾸어도 됨 그래도 왠만하면 맞춰서하는게 좋음
		System.out.println(ii+jj);
		
		
		//기본형을 문자열로 변환 
		String s1 = String.valueOf(1000);//static메소드이므로 클래스이름(String)으로 호출 
		String s2 = String.valueOf(2000);
		System.out.println(s1+s2);
		
	}
}
