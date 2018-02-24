package ex_java;
import java.util.Date;
import java.util.Scanner;

class Student{
	
	private int hakbun;
	private String name;
	
	public Student(int hakbun, String name){
		this.hakbun=hakbun;
		this.name=name;
	}
	
	//오브젝트의 11개 메소트중toString, equals 잘 알아둬야함 
	
	//부모의 toString 주소값을 리턴 
	public String toString(){
		return name+" "+hakbun;
	} 
	
	
// ************************이거 이해가 잘 안됨	********************
	public boolean equals(/* s1(this) */Object obj/* s2 */){
		if(obj instanceof Student){//obj를 Student로 바꿀수 있냐?
			Student s = (Student)obj;
			return s.hakbun==this.hakbun;// 학번을 비교한다는 뜻이다. 이름은 확인도 안함
		}else{
			return false;
		}
	}
	
	void display(){
		System.out.println(name);
	}
}


public class Ex08_01_toString {

	public static void main(String[] args) {
		
		Student s1 =new Student(2012,"현빈");
		Student s2 =new Student(2012,"소지섭");
		
		System.out.println("s1:"+s1);// 참조변수(주소값을 가지고 있는 변수)s1 에는 toString이 자동으로 호출되기때문에 자동toString으로 실행됨 
		System.out.println("s2:"+s2);// 따로 toString 을 써주지 않아도 
		// 나옴 내가 toString을 만들지 않으면 원래 api에서 만들어놓은것은 그 주소값을 나타내는것이기때문에 주소값이 나오는것이다.
		// 그래서 값을 넣고싶으면 내가 직접 오버라이딩해야함
		
		// 일반 변수에서는(직접 값이 들어가는것) 에서는 toString이 안됨 
		
		System.out.println("s1.toString():"+s1.toString());
		System.out.println("s2.toString():"+s2.toString());

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // 디폴트equals는 == 과 같은 기능을 갖고 있기때문에
		// 오버라이딩해서 자기가 만든 equals를 호출하려고 하는것
		
		boolean result =s1.equals(s2);// 부모가 물려주는equals메소드는 참조값을 비교 
		//s1의 주소값도 받아줌?
		s1.display();
		s2.display();
		
		if(result == true){
			System.out.println("학번이 같습니다.");
		}else{
			System.out.println("학번이 다릅니다.");
		}
		
		Date d =new Date();
		System.out.println(d);// 참조값을 출력함 // 참조값을 출력할때는 toString이 자동으로 호출됨
		
		System.out.println(new Date());
		System.out.println(new Date().toString());
		
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		/*
		string 선언해서 만든것 틀리기 좋다.
		*/
		String a; 
		String b="오징어";
		
		System.out.println("오징어");
		Scanner sc =new Scanner(System.in);
		a=sc.nextLine();
		
		if(b.equals(a)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		} 
		
		/*
		  
		String은 참조값을 가지고 자료형이지만 값을 바로 변수에 입력하는것은 아니라 주소값을 넣는다.
		하지만 String을 만드는 두가지 방법이 있는데 그에 따라서 완전히 다르다.
		String 을 이용하여 만드는 것은 같은 변수가 있다면 같은 주소값을 같도록 하게 만드는것이고 
		new를 이용하여 만들어낸 String은 전혀 다른 곳에 새로운 객체를 만들어내는 것과 같은 모양으로 만들어진다. 
		
		내가 어렵게 생각했던것이 객체를 만들어 비교를 한다면 주소값이 당연히 다르지만
		String도 참조값으로 따로따로 만들어내면 다영히 주소값이 달라질것이라고 생각했는데 Strig의 특수한 점떄문에 일반적인 변수선언법으로 만들어낸다면 주소값은 같게된다.
		그러므로 equals를 사용해서도 주소값이 같다고 나온다.
		
		*/
		
		
		
		/*
		 
		****equals메소드를 오버라이딩 할때는 보편적 계약을 따르자****
		  
		클래스의 각 인스턴스가 본래부터 유일한 경우. 인스턴스가 갖는 값보다는 활동하는 개체임을 나타내는 것이 더 중요한 Thread와 같은 클래스가 여기에 해당된다. 
		그런 클래스들은 인스턴스가 갖는 값의 논리적인 비교는 의미가 없으며, 객체 참조가 같으면 동일한 것임을 알 수 있기 때문에 Object의 equals를 그냥 사용하면 된다.
		
		두 인스턴스가 논리적으로 같은지 검사하지 않아도 되는 클래스의 경우. 예를 들어, java.util.Random클래스에서는 두 개의 Random 인스턴스가 같은 난수열을 만드는지 확인하기 위해 equals 메소드를 오버라이딩 할 수 있었을 것이다. 
		그러나 그 클래스의 설계자는 클라이언트가 그런 기능을 원한다고 생각하지 않았다. 이런 경우 Object로부터 상속받은 equals를 그냥 쓰면 된다.
		수퍼 클래스에서 equals 메소드를 이미 오버라이딩 했고, 그 메소드를 그대로 사용해도 좋은 경우. 예를 들어 Set 인터페이스를 구현하는 대부분의 클래스들은 AbstractSet에 구현된 equals를 상속받아 사용하며, 
		
		List의 경우는 AbstractList로 부터, Map의 경우는 AbstractMap에서 상속받아 사용한다.
		private이나 패키지 전용 클래스라서 이 클래스의 equals메소드가 절대 호출되지 않아야 할 경우. 우연히 호출될 수 있는 그런 상황에서는 다음과 같이 equals메소드를 반드시 오버라이딩해서 호출되지 않도록 해야한다.
		
		*/
		
		
		
		
		
		
	}

}
