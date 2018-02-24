package ex_java;

public class Ex05_05_main함수란무엇인가 {
	
	public static void main(String[] args) {
		/*
		1. 기본내용

		클래스가 main() 를 포함하고 있는가, 아닌가 와 이 main()가 필요에 따라 선언되는가 아닌가는 

		컴파일러에 의해 확인되어지는게 아니라 런타임시 JVM이 이 것을 확인한다.



		main을 안넣으면 RuntimeException : NoSuchMethodError.main이 발생



		public static void main(String args[]) -> JVM이 확인



		2. 각각을 사용하는 이유

		public인 이유 : 어느곳으로부터든지 JVM에 의해서 call하기 위해

		static인 이유 : 존재하는 객체 없이  JVM은 이 메쏘드와 main메쏘드를 콜 할 수 있다.

		void인 이유 : JVM으로 어떤 것이든 return하지 않기 위해 

		main() 인 이유 : 이것은 JVM에 있는 네임임

		String args[]인 이유 : 커맨드 라인 argument - 프로그램 실행시 매개변수를 보내서 실행할 수 있다는 뜻



		3, public static void main(String args[]) 중  바꿀 수 없는 것

		void를 int로 바꾸거나 main을 Main, String args[]를 String 등 몇개를 바꿔서 실행시키면 

		NoSuchMethodError.main 예외가 발생



		# void는 리턴타입이 없다는 뜻이다. 메인 메쏘드는 프로그램 진입점이면서 종결점이기도 하다.

		  그러므로 리턴하는 값 자체가 불필요하고, 다른 타입으로 바꾸면 에러가 난다.



		3. public static void main(String args[]) 중 바꿀 수 있는것

		some change는 acceptable함

		1) public, static 순서는 바뀌어도 상관없으나 리턴타입은 반드시 메쏘드 명 앞에 와야함

		2) main(String[] args)를 아래와 같이 바꿔도 실행됨 
		   -> main(String []args) 
		   -> main(String args[])

		3) args대신 어느 자바 구별자로 사용 가능

		4) main(String[] args)에서 main(String... args)로 변경 가능(자바 v1.5이상부터)

		5) final, synchronized, strictfp(자바 v1.2부터) modifier를 main()와 같이 선언할 수 있음

		아래의 예처럼 변형하여 사용할 수 있음
		class Test{
		final static synchronized strictfp public void main (String... durga){
		System.out.println("test");
		{
		}


		출처: http://superfelix.tistory.com/125 [☼ 꿈꾸는 도전자 Felix !]


		 */
	}

}
