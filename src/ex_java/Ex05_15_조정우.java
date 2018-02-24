package ex_java;
class Member{
	private String id;
	private String passwd;
	private static String company;//공통되는 부분 static 을 이용하여 만들어야함 물론 프라이빗으로 만들어서 게터 세터 만들어야 변경가능함 
	// static 이 있으면 클래스 이름으로 도 호출이 가능 하기 때문에 클래스 변수하고도함 ex) Member.company = 멤버 클래스의 스태틱한 컴퍼니 변수를 호출
	
	static String getCompany(){//static 이 있는 변수만 static을 붙일수 있음
		return company;// Member.company 가능?
	}
	
	
	
	/*
	==================================================================================================================
	*/	
	//this와 member차이를 이해못함
	
	static void setCompany(String company){// 공통으로 사용할수 있도록 클래스 이름으로 접근할수있도록 스태틱사용   //원래 일반적으로 this 가 붙는데
		Member.company=company;//원래 일반적으로 멤버변수를 나타내는 this가 붙는데 static이 있으면 this를 쓸수 없다. 그대신 클래스 이름을 쓴다. 
	}
	
	/*
	==================================================================================================================
	*/
	
	
	
	
	
	void setId(String id){
		this.id=id;
	}
	String getId(){
		return id;
	}
	
	void setPasswd(String passwd){
		this.passwd=passwd;
	}
	String getPasswd(){
		return passwd;
	}
	
	Member() {
		this.id="choi";
		this.passwd="9876";
		//company ="중앙";
	}
	
	Member(String id, String passwd) {
		this.id=id;
		this.passwd=passwd;
	}
	
}

public class Ex05_15_조정우 {

	public static void main(String[] args) {

		Member m1 = new Member();//setter 통한 자동주입(kim,1234)  
		Member m2 = new Member();//생성자 통한 주입(choi,9876)
		Member m3 = new Member("park","5678");//생성자 통한 주입
		
		m1.setId("kim");//m1주소가 넘어감
		m1.setPasswd("1234");
		System.out.println("m1아이디:"+m1.getId());
		System.out.println("m1패스워드:"+m1.getPasswd());
		System.out.println();
		
		System.out.println("m2아이디:"+m2.getId());//m2의 주소가 넘어감 
		System.out.println("m2패스워드:"+m2.getPasswd());
		System.out.println();
		
		System.out.println("m3아이디:"+m3.getId());
		System.out.println("m3패스워드:"+m3.getPasswd());
		
		System.out.println(m1.getCompany());
		System.out.println(m2.getCompany());
		System.out.println(m3.getCompany());
		System.out.println(Member.getCompany());
		
		m1.setCompany("현대");
		System.out.println(m1.getCompany());
		System.out.println(m2.getCompany());
		
		Member.getCompany();
		
	}

}
