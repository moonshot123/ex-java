package ex_java;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex09_06_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("�¿�");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");

		System.out.println("hashset:"+ set);//��ü 

		System.out.println("����� �����ͼ�"+set.size());//���� 
		set.remove("����");
		System.out.println(set.contains("����ī"));//contains("����ī") �� ���ԵǾ� �ֳ�? ����°� ������ boolean  
		//System.out.println(set.get());  set���� get�޼ҵ尡 ����. �ҷ����¹���� �ٸ�
		Iterator<String> iter =set.iterator();
		while(iter.hasNext()){
			String temp = iter.next();
			System.out.print(temp+" ");
		}
		System.out.println();



		/***********************************
		//HashSet, LinkedHashSet, TreeSet��
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
		// ���������ϰ� �ߺ��ȵǰ� ���Եȴ�.

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
		// �ۼ��� ������� �ߺ��ȵǰ� ���Եȴ�.


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
		// ���ĺ� ������ �ߺ��ȵǰ� ���Եȴ�.




	}

}
