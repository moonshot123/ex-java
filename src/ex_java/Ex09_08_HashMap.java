package ex_java;
import java.util.*;//*은 클래스까지만 가능함

public class Ex09_08_HashMap {

	public static void main(String[] args) {
		Map <String, String> dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String word;
		dic.put("pencil", "연필");
		dic.put("car", "자동차");
		dic.put("sky", "하늘");
		dic.put("water", "물");
		dic.put("apple", "사과");

		
		do{
			System.out.print("찾는 단어?:");
			word = sc.next();
			if(word.equals("q")){
				break;
			}
			
			if(dic.get(word)==null){
			// dic.get(word) 이건 키값을 입력해서 받은 value값   //word가 키값....
				System.out.println("찾는 단어 없음");
			}else{
				System.out.println(dic.get(word));
			}
			
					
		}while(true);
		
		System.out.println("프로그램 종료");
		
		
		//찾는 단어는? face
		//뜻: 얼굴
		
		//찾는 단어는? milk
		//잘못선택함
				
		//찾는 단어는?q
		//프로그램을 종료합니다.
		
		
		
	}

}
