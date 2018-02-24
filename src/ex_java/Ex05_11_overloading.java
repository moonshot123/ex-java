package ex_java;
public class Ex05_11_overloading {

	public static void main(String[] args) {
		
		int result1 =plus(3,5,7);
		System.out.println("result1="+result1);
		
		double result2=plus(1.5, 2.7);
		System.out.println("result2="+result2);
		
		sharp();
		System.out.println();
		sharp(3);
		
	}
	
	//다른이름으로 써도 되지만 아무래도 같은기능을 가지고 있는 메소드에 이름을 같게 하면 볼떄 편함?
	//대표적으로 api에서 보면 형태마다 이런것들이 뭔지 많이 나오는데 메소드 이름은 같지만 매개변수마다 만들어 놓은 것을 같은이름으로 편하게 사용하는 걸 생각해보자.
	static void sharp(){
		for(int i=0; i<5;i++){
			System.out.print("#");
		}
	}
	
	static void sharp(int a){
		for(int i=0; i<a;i++){
			System.out.print("#");
		}
	}
	
	
	//메소드이름이 같더라도 매개변수가 다르면(개수, 형)이 다르면 오버로딩을 통해 사용할 수 있다. 
	
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
					물려주는 메소드와 새로 정의 하는 메소드 이름이 같아야한다.
					매개변수도 같아야한다.
					리턴타입도 같아야한다. 
					 
					
	*/
	static int plus(int a, int b, int c){
		return a+b+c;
	} 

	static double plus(double a, double b){
		return a+b;
	}
	
	/*
	 * 리턴타입은 상관없기때문에 오류생김
	 * 매개변수이름이 다르지만 같은걸로 인식함
	 * 
	static double plus(double a, double b){
		return a+b;
	}
	static int plus(double c, double d){
		return a+b;
	}
	*/

	
	
	//순서가 달라지면 다른 메소드로 생각함
	static double plus(double a, int b){
		return a+b;
	}
	
	static double plus(int a, double b){
		return a+b;
	}
	
}
