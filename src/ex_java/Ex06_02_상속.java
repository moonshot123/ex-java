package ex_java;
class Person{// 슈퍼를 쓰라는 이야기는 부모생성자를 통해서 만들어라 라는 뜻
	String name;
	int age;

	Person(){}

	Person(String name, int age) {
		this.name =name;
		this.age=age;
	}
	void display() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
	public String toString(){
		return name+" "+age;
	}
}//person



class Student extends Person{
	//String name;
	//int age;
	int kor,eng;

	public Student(){}

	public Student(String name, int age, int kor, int eng) {

		super(name,age);
		/*this.name=name;// 자기꺼가 없기 때문에 부모꺼를 물려받는다고 생각해서 this로 씀 
		this.age=age;*/
		this.kor=kor;
		this.eng=eng;

	}
	void display() {//오버라이딩
		super.display();//display가 자식메소드에도 있기 떄문에 그냥 디스플에이라고 하면 안되고 부모꺼라고 super이라고 써줘야 한다.
		System.out.println("한국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println();
	}

	/*public String toString(){
		return name+" "+age+" "+kor+" "+eng;
	}*/
	public String toString(){//오버라이딩
		return super.toString()+" "+kor+" "+eng;
	}


}//student



class Employee extends Person{
	//String name;
	//int age;
	String company,part;
	public Employee(){}
	public Employee(String name, int age, String company, String part) {
		super(name,age);
		/*this.name=name;
		this.age=age;*/
		this.company=company;
		this.part=part;
	}
	void display() {//오버라이딩
		super.display();
		System.out.println("회사:"+company);
		System.out.println("부서:"+part);
		System.out.println();
	}

	/*public String toString(){
		return name+" "+age+" "+company+" "+part;
	}*/

	public String toString(){//오버라이딩
		return super.toString()+" "+company+" "+part;
	}


}//employee



class Teacher extends Employee{

	String subject;

	public Teacher() {}

	Teacher(String name, int age, String company, String part, String subject) {
		super(name,age,company,part);
		this.subject=subject;
	}

	public String toString(){//오버라이딩
		return super.toString()+" "+subject;
	}

}//Teacher




public class Ex06_02_상속 {

	public static void main(String[] args) {

		//Person p= new Person("하니",20);
		Student s = new Student("찬열",13,89,93);
		Employee e = new Employee("수지",33,"삼성","홍보부");
		Teacher t =new Teacher("공유",900,"중앙", "연구부","영어");
		s.display();
		e.display();
		System.out.println("=====================================");

		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(t.toString());
		System.out.println();

		System.out.println("#####################################");

		Person[] p1 ={
						(Person)new Student("찬열",13,89,93),
						new Employee("수지",33,"삼성","홍보부"),//(Person)업캐스팅이라 생략됨
						new Teacher("공유",900,"중앙", "연구부","영어")////(Person)업캐스팅이라 생략됨
		}; 

		for(int i=0; i<p1.length;i++){
			p1[i].display();
		}
		// 단순히 생각하면 자식들이 더많은 정보를 가지고 있기떄문에 더 큰거 같지만 프로그래밍에서는 부모가 자식보다 크다고 생각해야된다.
		// 서도 다른 객체를 통합적으로 관리 할때 사용되는것같다.
		// 모든객체를따로 따로 관리하는 것보다 비슷한 객체를 이용 상속해주는 부모클래스를 이용하여 한번에 관리해준다면 훨씬 간단하게 만들수 있기 떄문에????????




	}

}