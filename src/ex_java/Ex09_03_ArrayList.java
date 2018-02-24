package ex_java;
import java.util.ArrayList;
import java.util.Scanner;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+"/"+age; // ��Ʈ���� ������ ����� �������� ���� Ŭ�������� ���� ������� ���� �ʾұ� ������ �� 
	} 
	
}


public class Ex09_03_ArrayList {

	public static void main(String[] args) {
		
		Person p1 =new Person("����",21);
		Person p2 =new Person("�뼮",65);
		Person p3 =new Person("����",97);
		ArrayList<Person> list = new ArrayList<Person>();// <Person>������ arraylist ������ ����
		list.add(p1);//list.add(new Person("����",21));
		list.add(p2);
		list.add(p3);
		
		System.out.println(list.toString()); //�̰� person �����̹Ƿ� �ּҰ��� ���� 
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		Person[] arr = {
						new Person("����",21),
						new Person("��ȯ",65),
						new Person("���",97)
		};
		
		for(int i=0; i<arr.length;i++){
			list2.add(arr[i]);
		}
		System.out.println(list2.toString());//toString �� �������̵� ���ϸ� �ּҰ��� ���� �翬�� Person�� �����̱⶧���� �������̵��� �Ǿ����� �ʾƼ� ������Ʈ�� ����Ʈ���� ����ϱ⋚�����̴�.
		
		
		
		
		boolean flag = false;
		Scanner sc =new Scanner(System.in);
		String name, retry;
		int age;
		
		while(true){
			
			System.out.print("�̸�:");
			name = sc.next();
			System.out.print("����:");
			age = sc.nextInt();
			
			//��ü���� �ٷ� �ֱ�
			Person ppp = new Person(name, age);
			list2.add(ppp);
			//list2.add(new Person(name, age));
			
			
			System.out.println("����Ͻðڽ��ϱ�?y");
			retry = sc.next();
			if(!(retry.equals("y"))){
				break;
			}
		}
		
		System.out.println(list2.toString());
		
		System.out.print("ã���̸� : ");
		name=sc.next();
		
		for(int i=0; i<list2.size();i++){
			
			if(list2.get(i).name.equals(name)){//i�� �������°� get(i)
				
				System.out.println(name+"�� ���̴�"+ list2.get(age));
				flag=true;
				break;
			}
			
		}
		// ã���̸��� �����ϴٴ� ���� �������� ���;ߵ�
		if(flag==false){
			System.out.println("ã���̸��� �����ϴ�");
		}
		
		
	}

}
