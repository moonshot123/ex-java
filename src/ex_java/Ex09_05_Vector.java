package ex_java;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_05_Vector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();//Vector는 녹색c가 나옴 클래스라는 뜻
		v.addElement(new String ("봄"));
		v.addElement(new String ("여름"));
		v.addElement(new String ("봄"));
		v.addElement(new String ("겨울"));
		
		System.out.println(v);
		
		Enumeration<String> en = v.elements();//elements은 요소
		//Enumeration 을 이용한 데이터 출력 >> 열거된 데이터를 관리할수 있는 인터페이스
		//Enumeration 보라색i 인터페이스이다. 마우스 올려보면나옴
		
		// 컬렉션 검색방법3가지
		
		//hasMoreElements ~ nextElement
		while(en.hasMoreElements()){//hasMoreElements 은 관리하는 요소가 있나?(위에 4개가 있음) boolean형
			String temp = en.nextElement();//nextElement() 요소를 한개 꺼내오는메소드
			System.out.println(temp);
		}
		System.out.println();
		
		//2.Iterator를 이용한 데이터 출력
		for(Iterator<String>i = v.iterator(); i.hasNext();){//for(초기값;범위;증감식(여기서는 없음))내부에서 증감을 넣으면 증감식을 for문에 넣지 않아도 됨
			String tmp =i.next();
			System.out.println(tmp);
		}
		System.out.println();
		
		//3.확장for문을 이용한 데이터 출력
		for(String tmp: v){
			System.out.println(tmp);
		}
		
		
		int [] num = {10,20,30};
		int i;
		for(i=0; i<num.length; i++){
			
		}
		
		for(int e: num){//배열의 처음부터 끝까지 >>배열과 컬렉션에서 많이사용됨>> 요소를 가지고 올때 많이 사용됨
			System.out.println(e); 
		}
		
	}

}
