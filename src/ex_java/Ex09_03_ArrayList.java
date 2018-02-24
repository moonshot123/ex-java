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
		return name+"/"+age; // 스트링은 이전에 만들어 져있지만 여기 클래스에는 따로 만들어져 있지 않았기 떄문에 꼭 
	} 
	
}


public class Ex09_03_ArrayList {

	public static void main(String[] args) {
		
		Person p1 =new Person("유진",21);
		Person p2 =new Person("용석",65);
		Person p3 =new Person("윤영",97);
		ArrayList<Person> list = new ArrayList<Person>();// <Person>형태의 arraylist 공간을 만듬
		list.add(p1);//list.add(new Person("유진",21));
		list.add(p2);
		list.add(p3);
		
		System.out.println(list.toString()); //이건 person 형태이므로 주소값만 나옴 
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		Person[] arr = {
						new Person("정우",21),
						new Person("구환",65),
						new Person("경우",97)
		};
		
		for(int i=0; i<arr.length;i++){
			list2.add(arr[i]);
		}
		System.out.println(list2.toString());//toString 을 오버라이딩 안하면 주소값이 나옴 당연히 Person이 기준이기때문에 오버라이딩이 되어있지 않아서 오브젝트의 투스트링을 사용하기떄문이이다.
		
		
		
		
		boolean flag = false;
		Scanner sc =new Scanner(System.in);
		String name, retry;
		int age;
		
		while(true){
			
			System.out.print("이름:");
			name = sc.next();
			System.out.print("나이:");
			age = sc.nextInt();
			
			//객체만들어서 바로 넣기
			Person ppp = new Person(name, age);
			list2.add(ppp);
			//list2.add(new Person(name, age));
			
			
			System.out.println("계속하시겠습니까?y");
			retry = sc.next();
			if(!(retry.equals("y"))){
				break;
			}
		}
		
		System.out.println(list2.toString());
		
		System.out.print("찾는이름 : ");
		name=sc.next();
		
		for(int i=0; i<list2.size();i++){
			
			if(list2.get(i).name.equals(name)){//i방 가져오는것 get(i)
				
				System.out.println(name+"의 나이는"+ list2.get(age));
				flag=true;
				break;
			}
			
		}
		// 찾는이름이 없습니다는 방이 끝난다음 나와야됨
		if(flag==false){
			System.out.println("찾는이름이 없습니다");
		}
		
		
	}

}
