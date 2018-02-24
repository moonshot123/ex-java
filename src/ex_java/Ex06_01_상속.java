package ex_java;
class Sports extends Object{// 부모는 자식것을 사용할수 없음 ta, goal을 넣으면 오류가남 //object메소드는 모든 메소드들의 부모클래스이다.// 메소드마다 오브젝트를 부모로 하지만 안써줘도 된다.
	String name;
	int inwon;
	
	Sports(){}

	public Sports(String name, int inwon) {
		this.name=name;
		this.inwon=inwon;
	}

	

	void display() {
		System.out.println("이름:"+name);
		System.out.println("인원수:"+inwon);
	}
}//Sports



class Baseball extends Sports{//부모의 자료를 받아온다.  
	// calss 자식 extends 부모  
	
	/*String name;
	int inwon;*/
	double ta;
	public Baseball(){
		
	}
	
	public Baseball(String name, int inwon, double ta) {
		super(name,inwon);
		//this.name=name;
		//this.inwon=inwon;
		this.ta=ta;
	}
/*
오버로딩과 오버라이딩	

	ex)오버로딩:   
				println()
			    println(int u)
				println(double d)
				println(boolean b)
				
				하나의 클래스에 같은 이름의 메소드가 여러개 있는것
				매개변수의 갯수나 타입이 달라야함
				리턴타입은 상관이 없다
				매개변수 변수이름도 상관없음
				매개변수 순서에 따라 가능 함
				
				 
	ex)오버라이딩: 
				상속관계에서 부모가 물려주는 메소드를 자식이 재정의하는것
				물려주는 메소드와 새로 정의하는 메소드 이름이 같아야한다.
				매개변수도 같아야한다.
				리턴타입도 같아야한다. 
				 
				
*/
	void display() {//오버라이딩: 상속에서 새롭게 정의하는것으로서 부모의 메소드를 수정하는것 
		//System.out.println("이름:"+name);
		//System.out.println("인원수:"+inwon);
		super.display();// 부모의 display() 호출함   
		// display()만 넣으면 자신의 display()만 계속 도는 재귀함수가 됨 : 우선순위는 자기자신의 메소드가 순위기 높기때문임    
		System.out.println("타율:"+ta);
	}
	
	
	/*void display() {
		System.out.println("이름:"+name);
		System.out.println("인원수:"+inwon);
	}*/

}//Baseball 



class Football extends Sports{//football이 sports를 상속받다.

	/*String name;
	int inwon;*/
	int goal;
	public Football(){}
	
	public Football(String name, int inwon, int goal) {
		this.name=name;//this는 현재 클래스라는뜻 여기에는 없지만 부모에게 상속받아서 있다고 생각함
		this.inwon=inwon;
		this.goal=goal;
	}
	void display() {
		//System.out.println("이름:"+name);
		//System.out.println("인원수:"+inwon);
		super.display();//부모의 메소드에 접근할때 사용되는 키워드super
		System.out.println("골:"+goal);
	}
}//Football



public class Ex06_01_상속 {

	public static void main(String[] args) {
		
		Baseball bb = new Baseball(); // bb가 값을 가지고 있는게 아니고 값을 가지고 있는 곳을 가리키는 주소값을가지고 있는것
		bb.name="야구";
		bb.inwon=9;
		bb.ta=0.456;
		
		Football fb= new Football();
		fb.name="축구";
		fb.inwon=11;
		fb.goal=7;
		
		Baseball bb1 =new Baseball("야구",9,0.456);// 객체를 생성할떄 생성자가 필요한데 없기때문에 오류가 남 만들어줘야됨
		Football fb1 = new Football("축구", 11,7);
		// 자식클래스만 보면됨
		bb1.display();
		fb1.display();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Sports s1 =(Sports)new Baseball("야구",9,0.456); // 업캐스팅
		Sports s2 = new Football("축구", 11,7); //
		// 부모에 있기때문에 가능 함
		s1.display();
		s2.display();
		
		System.out.println("-----------------------------------------------------");
		/*
		 * 
		 * 
		 * 관리하는 관리자가 Sports이기때문이다.
		 * 왜 쓸까 생각해보면 아마도 다른형태의 Baseball, Football 을 통합적으로 관리하기 위해서 Sports로 통합 관리 하기 위해서 사용하는거 같다.
		 * 다형성개념에서 이런관리를 위해서 필요할까 생각해보자 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 
		 * 
		 * 
		 * 
		*/  
		Sports [] s= {
					new Baseball("야구",9,0.456), 
					new Football("축구", 11,7)				
		};
		
		for(int i =0; i<2;i++){
			s[i].display();
		}
		
		
	}

}
