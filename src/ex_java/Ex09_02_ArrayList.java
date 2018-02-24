package ex_java;
//컬렉션은 중요하니 열심히 이해하자 ...
import java.util.ArrayList;

public class Ex09_02_ArrayList {

	public static void main(String[] args) {
		
		String s ="하하";
		System.out.println(s.toString());//String의toString()은 문자열 출력기능으로 오버라이딩
		
		//Class ArrayList<E> e는 요소인데 모든자료형이 가능하다느뜻임 자신이 만든 자료형이 들어감 
		ArrayList <String> list =new ArrayList<String>(); //어떠한 저장공간이 생김   
		//<String>이 없다면 입력은 가능하지만 값을 리턴할떄는 오브젝트형으로 리턴되므로 오류가 생겨서 강제 형변환을 따로 해줘야함
		//ArrayList 안에는 개체만 넣을수 있다.
		list.add("태연");//add는 공간에 입력   0번부터 시작됨 
		list.add("윤아");//1
		list.add("수영");//2
		list.add("태연");//3
		
		System.out.println("갯수"+list.size());//데이터 크기를 (개수)를 알려주는메소드
		
		
		/***********************************************
		*length: 배열의 방의 갯수(배열)
		*length(): 문자열의 개수() (String 클래스가 가지고 있음)   
		*size(): 컬렉션의 공간의 요소 개수 (ArrayList가 가지고 있음) 
		************************************************/
		
		
		for(int i =0; i<list.size();i++){
			System.out.print(list.get(i)+" ");//배열과 리스트를 잘못보고 틀릴수 있다.
		}
		
		System.out.println();
		
		
		
		System.out.println(list.toString());// 여기서는 잘되는게 list에 있는 String에 있는 toString 실행되는것 그래서 이렇게 문자열이 출력09_3예제는 person이므로 이므로 오버라이팅이 되어있지않아서 그냥 조소값만 나옴  
		System.out.println(list.get(2));//문자열 리턴
		String s2 = list.get(0);//출력
		System.out.println(s2);
		// 여기까지는 4칸 
		list.add(1, "제시카"); // 1번위치에 제시카를 넣어라 아래는 밀림
		System.out.println(list.toString());
		
		list.remove(0); // 0방을 지워라 아래있는게 올라옴
		System.out.println(list.toString());
		
		int index = list.indexOf("윤아");
		System.out.println("index:"+index);// 찾는 문자의 위치가 나옴
		
		int index2 = list.indexOf("써니");
		System.out.println("index:"+index);// 없으면 -1이 나옴  // 그리고 여러개의 써니가 있다면 가장 처음의 써니만 나옴
		
		
		
		//객체밖에 못넣어서 기본형으로는 못만드는듯...
		ArrayList <Integer> list1 =new ArrayList<Integer>(); //어떠한 저장공간이 생김
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1.toString());//ArrayList는 <제너릭>의 오버라이딩 기능을 
		System.out.println(list1.get(2));//Integer 리턴
	}

	
	
	//스택을 생각해보면 웹페이지 이동하는것 같은 구조 마지막에 한것을 제일 먼저 함...() 수식계산, 웹브라우저의 앞으로 뒤로가기
	//큐는 가장먼저 들어온 것을 가장 먼저 뺴냄 .... 인쇄작업대기목록 들어온순서대로 해야되는일들, 버퍼
	
}
