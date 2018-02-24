package ex_java;
class Parent{
	/*private*/ int x=10;
	void sub(){
		//int x=11;
		System.out.println("parent sub x="+x);
	}
}


class Child extends Parent{
	int x=20;  //우선순위2 인스턴스변수 
	
	void method(){
		int x=30;  //우선순위1 지역변수   
		System.out.println("x="+x); //지역변수가 우선순위가 가장높음 //지역변수를 지운다면 인스턴스 변수를 출력함 
		System.out.println("this.x="+this.x); 
		System.out.println("super.x="+super.x);// 부모의 변수만 찾음 자식의 변수가 있어도 읽지 않는다. //부모의 변수가 private을 하면 상속을받고 super을 쓰더라도 무조건 사용이 안됨 
		//이러한 문제를 해결하기 위해서는 게터 세터를 사용해야 될것 같다.
		//super은 부모의 변수만 찾는것이 아니라 메소드도 가능함
		sub();
		super.sub();
		
	}
	
	void sub(){
		//int x=11;
		System.out.println("child sub x="+x);
	}
	
}



public class Ex06_06_super {

	public static void main(String[] args) {
		Child c= new Child();
		c.method();
		c.sub();
	}

}
