package ex_java;
class Soshi{
	String name;
	int age;

	Soshi() {
		//name="똥개";   
		//age=15;
		//this("똥개",15);   바로 써도 되지만 this를 이요하면 더 간단하고 쉽게 코드를 재활용 할 수 있다.
		
		this("똥개"); //이녀석은 아래 있는 name매개변수 받는 곳으로 가기서 다시 가장 밑에 있는 곳으로 가서 입력 받는다. 값은 그래서 (똥개, 10) 으로 나옴
	}
	Soshi(String name) {
		//방법1	this.name=name;
		//		this.age=10;// 여기는 age가 없으므로 this를 붙여도 되고 안붙어도 상관은 없음
		
		this(name, 10);// 생성자 호출, 생성자 호출하는 것은 생성자 안에서만 만들수 있다 다른 메소드에서는 사용할 수 없다. 
		//this와 같은 매개변수 형태를 가지고 있는 생성자(아래있는 효현생성자)쪽으로 내려가서 생성자를 사용함  
		
		System.out.println("123"); //생성자 호출하는 코드는 맨위에 있어야 한다. 만약에 출력문 같은것이 위에 있으면 오류가 남  
	}	
	Soshi(String name, int age) {
		this.name=name;
		this.age=age;
	}
		
	public String toString(){
		return name+","+age;
	}
}

public class Ex06_04_this {

	public static void main(String[] args) {
		
		Soshi s1 =new Soshi();
		Soshi s2 =new Soshi("티파니");
		Soshi s3 =new Soshi("효연",20);
		System.out.println(s3); //s3객체를 생성하면 s3에 값이 들어가는것이 아니라 객체가 있는 주소값을 나타내주는 주소값이다.출력해보면 주소값이 나옴 
								//toString을 만들어서 넣으면 주소 값이 나오는것이 아니라 값이 나옴
		
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
