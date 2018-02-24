package ex_java;
class Student{
	
	private String name;
	private int kor, eng, mat;
	
	//�����ε�: �̸��� ���� �޼ҵ带 ����������°�
	//�Ʒ� �����ڴ� ������ �����ε��Ѵ�. 
	public Student() {
		this.name = "����";
		this.kor = 20;
		this.eng = 30;
		this.mat = 40;
	}
	
	Student(String name){
		this.name=name;
		this.kor=33;
		this.eng=44;
		this.mat=55;
	}
	
	Student(String name,int kor, int eng, int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	String getName(){
		return name;
	}
	
	int getkor(){
		return kor;
	}
	
	int geteng(){
		return eng;
	}
	
	int getmat(){
		return mat;
	}
	
	String display(){ //String�� �ϳ��� ������ String������... ���� ����
		return name+ "," +kor+","+eng+","+mat;
	}
	
	
	//�������� ���Ǵ� ��: �����ϱ�
	public String toString(){//����ϱ����ؼ��� ȣ��޼ҵ带 �ҷ���� �Ǵµ�
		return name+ "," +kor+","+eng+","+mat;
	}
	
	
	
}



public class Ex05_16_��ü�迭 {

	public static void main(String[] args) {
		
		Student s1 =new Student();//����,20,30,40 
		Student s2 =new Student("�¿�"); //�¿�,33,44,55
		Student s3 =new Student("����",70,80,90); 
		
		//�Ѱ��� ȣ���ϴ°� �������� ��ü ������ 
		System.out.println("s1:"+s1.getName());
		System.out.println("s1:"+s1.getkor());
		System.out.println("s1:"+s1.geteng());
		System.out.println("s1:"+s1.getmat());
		System.out.println("========================================");
		
		System.out.println("s2:"+s2.getName());
		System.out.println("s2:"+s2.getkor());
		System.out.println("s2:"+s2.geteng());
		System.out.println("s2:"+s2.getmat());
		System.out.println("========================================");
		
		System.out.println("s3:"+s3.getName());
		System.out.println("s3:"+s3.getkor());
		System.out.println("s3:"+s3.geteng());
		System.out.println("s3:"+s3.getmat());
		System.out.println();
		System.out.println();

		
		System.out.println(s1.display());
		System.out.println("========================================");
		System.out.println(s2.display());
		System.out.println("========================================");
		System.out.println(s3.display());
		System.out.println("========================================");
		System.out.println();
		
		System.out.println(s1);
		// toString�� ���������� �ᵵ ����̵ȴ�. �ڹٿ��� ����� �������̱⋚���� ���ϰ� ����Ҽ� ����
		//�������� == ��������.toString() 
		 
		//�ּҰ� �����ִ� ũ��� 4����Ʈ
		//��ü�迭 ����°� �Ȱ���
		Student [] arr=new Student[3]; 
		arr[0]=new Student();
		arr[1]=new Student("�¿�");
		arr[2]=new Student("����",70,80,90);

		
		Student[] arr1={	
				new Student(), 
				new Student("�¿�"), 
				new Student("����",70,80,90)
		};
		
		
		System.out.println("========================================");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("========================================");
		for(Student s : arr){
			System.out.println(s);
		}

		
		
		
	}

}
