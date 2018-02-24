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
	
	//������Ʈ�� 11�� �޼�Ʈ��toString, equals �� �˾Ƶ־��� 
	
	//�θ��� toString �ּҰ��� ���� 
	public String toString(){
		return name+" "+hakbun;
	} 
	
	
// ************************�̰� ���ذ� �� �ȵ�	********************
	public boolean equals(/* s1(this) */Object obj/* s2 */){
		if(obj instanceof Student){//obj�� Student�� �ٲܼ� �ֳ�?
			Student s = (Student)obj;
			return s.hakbun==this.hakbun;// �й��� ���Ѵٴ� ���̴�. �̸��� Ȯ�ε� ����
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
		
		Student s1 =new Student(2012,"����");
		Student s2 =new Student(2012,"������");
		
		System.out.println("s1:"+s1);// ��������(�ּҰ��� ������ �ִ� ����)s1 ���� toString�� �ڵ����� ȣ��Ǳ⶧���� �ڵ�toString���� ����� 
		System.out.println("s2:"+s2);// ���� toString �� ������ �ʾƵ� 
		// ���� ���� toString�� ������ ������ ���� api���� ������������ �� �ּҰ��� ��Ÿ���°��̱⶧���� �ּҰ��� �����°��̴�.
		// �׷��� ���� �ְ������ ���� ���� �������̵��ؾ���
		
		// �Ϲ� ����������(���� ���� ���°�) ������ toString�� �ȵ� 
		
		System.out.println("s1.toString():"+s1.toString());
		System.out.println("s2.toString():"+s2.toString());

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // ����Ʈequals�� == �� ���� ����� ���� �ֱ⶧����
		// �������̵��ؼ� �ڱⰡ ���� equals�� ȣ���Ϸ��� �ϴ°�
		
		boolean result =s1.equals(s2);// �θ� �����ִ�equals�޼ҵ�� �������� �� 
		//s1�� �ּҰ��� �޾���?
		s1.display();
		s2.display();
		
		if(result == true){
			System.out.println("�й��� �����ϴ�.");
		}else{
			System.out.println("�й��� �ٸ��ϴ�.");
		}
		
		Date d =new Date();
		System.out.println(d);// �������� ����� // �������� ����Ҷ��� toString�� �ڵ����� ȣ���
		
		System.out.println(new Date());
		System.out.println(new Date().toString());
		
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		/*
		string �����ؼ� ����� Ʋ���� ����.
		*/
		String a; 
		String b="��¡��";
		
		System.out.println("��¡��");
		Scanner sc =new Scanner(System.in);
		a=sc.nextLine();
		
		if(b.equals(a)){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		} 
		
		/*
		  
		String�� �������� ������ �ڷ��������� ���� �ٷ� ������ �Է��ϴ°��� �ƴ϶� �ּҰ��� �ִ´�.
		������ String�� ����� �ΰ��� ����� �ִµ� �׿� ���� ������ �ٸ���.
		String �� �̿��Ͽ� ����� ���� ���� ������ �ִٸ� ���� �ּҰ��� ������ �ϰ� ����°��̰� 
		new�� �̿��Ͽ� ���� String�� ���� �ٸ� ���� ���ο� ��ü�� ������ �Ͱ� ���� ������� ���������. 
		
		���� ��ư� �����ߴ����� ��ü�� ����� �񱳸� �Ѵٸ� �ּҰ��� �翬�� �ٸ�����
		String�� ���������� ���ε��� ������ �ٿ��� �ּҰ��� �޶������̶�� �����ߴµ� Strig�� Ư���� �������� �Ϲ����� ������������� �����ٸ� �ּҰ��� ���Եȴ�.
		�׷��Ƿ� equals�� ����ؼ��� �ּҰ��� ���ٰ� ���´�.
		
		*/
		
		
		
		/*
		 
		****equals�޼ҵ带 �������̵� �Ҷ��� ������ ����� ������****
		  
		Ŭ������ �� �ν��Ͻ��� �������� ������ ���. �ν��Ͻ��� ���� �����ٴ� Ȱ���ϴ� ��ü���� ��Ÿ���� ���� �� �߿��� Thread�� ���� Ŭ������ ���⿡ �ش�ȴ�. 
		�׷� Ŭ�������� �ν��Ͻ��� ���� ���� ������ �񱳴� �ǹ̰� ������, ��ü ������ ������ ������ ������ �� �� �ֱ� ������ Object�� equals�� �׳� ����ϸ� �ȴ�.
		
		�� �ν��Ͻ��� �������� ������ �˻����� �ʾƵ� �Ǵ� Ŭ������ ���. ���� ���, java.util.RandomŬ���������� �� ���� Random �ν��Ͻ��� ���� �������� ������� Ȯ���ϱ� ���� equals �޼ҵ带 �������̵� �� �� �־��� ���̴�. 
		�׷��� �� Ŭ������ �����ڴ� Ŭ���̾�Ʈ�� �׷� ����� ���Ѵٰ� �������� �ʾҴ�. �̷� ��� Object�κ��� ��ӹ��� equals�� �׳� ���� �ȴ�.
		���� Ŭ�������� equals �޼ҵ带 �̹� �������̵� �߰�, �� �޼ҵ带 �״�� ����ص� ���� ���. ���� ��� Set �������̽��� �����ϴ� ��κ��� Ŭ�������� AbstractSet�� ������ equals�� ��ӹ޾� ����ϸ�, 
		
		List�� ���� AbstractList�� ����, Map�� ���� AbstractMap���� ��ӹ޾� ����Ѵ�.
		private�̳� ��Ű�� ���� Ŭ������ �� Ŭ������ equals�޼ҵ尡 ���� ȣ����� �ʾƾ� �� ���. �쿬�� ȣ��� �� �ִ� �׷� ��Ȳ������ ������ ���� equals�޼ҵ带 �ݵ�� �������̵��ؼ� ȣ����� �ʵ��� �ؾ��Ѵ�.
		
		*/
		
		
		
		
		
		
	}

}
