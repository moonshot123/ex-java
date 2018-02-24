package ex_java;
import java.util.HashMap;
import java.util.Map;

public class Ex09_07_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();// Map는 인터페이스로 상속받는 HashMap으로 객체를 만들수 있음// 제너릭은 내가 알아서 고쳐줘야됨
		map.put("대성", new Integer(32));	// HashMap에 데이터 추가(("대성", 32)) 이렇게 써도 됨 알아서 오토박싱됨
		map.put("탑", new Integer(22));	// 앞이key값 뒤가 value값
		map.put("승리", new Integer(53));	// 자료들의 순서가 없음
		map.put("지용", new Integer(32));	// 키는 중복허용안함, 값은 허용됨  
		map.put("탑", new Integer(75));	// 키값이 중복되면앞에 있는 탑이 뒤에 나온거에 덮어씀 >> 먼저나온 정보가 사라짐
		
		System.out.println(map);
		System.out.println(map.get("탑")); 	//get(키값) 키값만 넣을수 있고 값이 있으면 값만 나오고
		System.out.println(map.get("태양"));	//키값이 없다면 null로 나온다.
		
		// 여러 가지를 가지고 오고 싶으면 
		// 그 데이터에 해당하는 객체를 만들어 운영하면 다양한 데이터들을 쉽게 운영 할 수 있음
		
		
		
	}

}
