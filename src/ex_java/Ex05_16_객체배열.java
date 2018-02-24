package ex_java;
class Student{
	
	private String name;
	private int kor, eng, mat;
	
	//오버로딩: 이름이 같은 메소드를 여러개만드는것
	//아래 생성자는 생성자 오버로딩한다. 
	public Student() {
		this.name = "수영";
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
	
	String display(){ //String이 하나라도 있으면 String형으로... 전부 변함
		return name+ "," +kor+","+eng+","+mat;
	}
	
	
	//자주자주 사용되는 됨: 연습하기
	public String toString(){//사용하기위해서는 호출메소드를 불러줘야 되는데
		return name+ "," +kor+","+eng+","+mat;
	}
	
	
	
}



public class Ex05_16_객체배열 {

	public static void main(String[] args) {
		
		Student s1 =new Student();//수영,20,30,40 
		Student s2 =new Student("태연"); //태연,33,44,55
		Student s3 =new Student("윤아",70,80,90); 
		
		//한개씩 호출하는게 귀찮으니 객체 단위로 
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
		// toString은 참조변수만 써도 출력이된다. 자바에서 만들어 놓은것이기떄문에 편하게 사용할수 있음
		//참조변수 == 참조변수.toString() 
		 
		//주소가 잡혀있는 크기는 4바이트
		//객체배열 만드는건 똑같음
		Student [] arr=new Student[3]; 
		arr[0]=new Student();
		arr[1]=new Student("태연");
		arr[2]=new Student("윤아",70,80,90);

		
		Student[] arr1={	
				new Student(), 
				new Student("태연"), 
				new Student("윤아",70,80,90)
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
