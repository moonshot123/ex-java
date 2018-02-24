package ex_java;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex09_06_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("태연");
		set.add("수영");
		set.add("유리");
		set.add("써니");
		set.add("수영");

		System.out.println("hashset:"+ set);//전체 

		System.out.println("저장된 데이터수"+set.size());//개수 
		set.remove("유리");
		System.out.println(set.contains("제시카"));//contains("제시카") 가 포함되어 있냐? 물어보는것 리턴형 boolean  
		//System.out.println(set.get());  set에는 get메소드가 없다. 불러오는방법이 다름
		Iterator<String> iter =set.iterator();
		while(iter.hasNext()){
			String temp = iter.next();
			System.out.print(temp+" ");
		}
		System.out.println();



		/***********************************
		//HashSet, LinkedHashSet, TreeSet비교
		***********************************/
		HashSet<String> set1 =
				new HashSet<String>();
		set.add("orange");
		set.add("grape");
		set.add("banana");
		set.add("apple");
		set.add("orange");
		for(String s : set)
			System.out.print(s+" ");

		// banana orange apple grape
		// 순서무시하고 중복안되게 삽입된다.

		LinkedHashSet<String> set2 =
				new LinkedHashSet<String>();
		set.add("orange");
		set.add("grape");
		set.add("banana");
		set.add("apple");
		set.add("orange");
		for(String s : set)
			System.out.print(s+" ");

		// orange grape banana apple
		// 작성한 순서대로 중복안되게 삽입된다.


		TreeSet<String> set3 =
				new TreeSet<String>();
		set.add("orange");
		set.add("grape");
		set.add("banana");
		set.add("apple");
		set.add("orange");
		for(String s : set)
			System.out.print(s+" ");

		// apple banana grape orange
		// 알파벳 순으로 중복안되게 삽입된다.




	}

}
