package ex_java;
class Person{// ���۸� ����� �̾߱�� �θ�����ڸ� ���ؼ� ������ ��� ��
	String name;
	int age;

	Person(){}

	Person(String name, int age) {
		this.name =name;
		this.age=age;
	}
	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
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
		/*this.name=name;// �ڱⲨ�� ���� ������ �θ𲨸� �����޴´ٰ� �����ؼ� this�� �� 
		this.age=age;*/
		this.kor=kor;
		this.eng=eng;

	}
	void display() {//�������̵�
		super.display();//display�� �ڽĸ޼ҵ忡�� �ֱ� ������ �׳� ���ÿ��̶�� �ϸ� �ȵǰ� �θ𲨶�� super�̶�� ����� �Ѵ�.
		System.out.println("�ѱ���:"+kor);
		System.out.println("����:"+eng);
		System.out.println();
	}

	/*public String toString(){
		return name+" "+age+" "+kor+" "+eng;
	}*/
	public String toString(){//�������̵�
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
	void display() {//�������̵�
		super.display();
		System.out.println("ȸ��:"+company);
		System.out.println("�μ�:"+part);
		System.out.println();
	}

	/*public String toString(){
		return name+" "+age+" "+company+" "+part;
	}*/

	public String toString(){//�������̵�
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

	public String toString(){//�������̵�
		return super.toString()+" "+subject;
	}

}//Teacher




public class Ex06_02_��� {

	public static void main(String[] args) {

		//Person p= new Person("�ϴ�",20);
		Student s = new Student("����",13,89,93);
		Employee e = new Employee("����",33,"�Ｚ","ȫ����");
		Teacher t =new Teacher("����",900,"�߾�", "������","����");
		s.display();
		e.display();
		System.out.println("=====================================");

		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(t.toString());
		System.out.println();

		System.out.println("#####################################");

		Person[] p1 ={
						(Person)new Student("����",13,89,93),
						new Employee("����",33,"�Ｚ","ȫ����"),//(Person)��ĳ�����̶� ������
						new Teacher("����",900,"�߾�", "������","����")////(Person)��ĳ�����̶� ������
		}; 

		for(int i=0; i<p1.length;i++){
			p1[i].display();
		}
		// �ܼ��� �����ϸ� �ڽĵ��� ������ ������ ������ �ֱ⋚���� �� ū�� ������ ���α׷��ֿ����� �θ� �ڽĺ��� ũ�ٰ� �����ؾߵȴ�.
		// ���� �ٸ� ��ü�� ���������� ���� �Ҷ� ���Ǵ°Ͱ���.
		// ��簴ü������ ���� �����ϴ� �ͺ��� ����� ��ü�� �̿� ������ִ� �θ�Ŭ������ �̿��Ͽ� �ѹ��� �������شٸ� �ξ� �����ϰ� ����� �ֱ� ������????????




	}

}