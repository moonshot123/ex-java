package ex_java;
class Person2{
	private String name; //아이우                   // 값을 넣는것: 주입
	private int age; // 76
	private double height; //190.1
	
	//Person2(){} 이건 자동으로 만들어짐
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age<0){
			this.age=0;
			return;
		}else{
			this.age = age;	
		}
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	
	
	
/*	void setName(String name){// 이런걸쓰는 이유는 유요한 값을 받고 싶기때문이라고 함? 
		this.name=name;  // this.name은 멤버변수를 뜻하는것
	}
	
	String getName(){// set을 쓰니까 어쩔수 없이 같이 써줘야 하는듯
		return name;
	}
	
	void setAge(int age){
		this.age=age; //this.age 멤버변수
	}
	
	int getAge(){
		return age;//age멤버변수
	}
	
	void setHeight(double height){
		this.height=height;//this.height멤버변수
	}
	double getHeight(){
		return height;//height멤버변수
	}*/
}


public class Ex05_13_setter_getter {

	public static void main(String[] args) {

		Person2 per = new Person2();
		
		per.setName("아이유"); // 값을 입력할때 사용
		System.out.println(per.getName()); // 값을 출력할때 사용
		
		per.setAge(28);// 값을 입력할때 사용
		System.out.println(per.getAge());// 값을 출력할때 사용
		
		per.setHeight(190.23);// 값을 입력할때 사용
		System.out.println(per.getHeight());// 값을 출력할때 사용
		
	}
}
