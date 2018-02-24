package ex_java;
public class Ex07_10_throw {
	
	static void call() throws Exception{ // 에러가 발생되었다는 정보를 아래 메인 메소드에 있는 call()에 오류가 났다고 알려줌 //  
		int i=1/0;
		
		/*try{
			int i=1/0;
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println("call 에서 에러발생 ");
		}*/
		
	}
	
	
	public static void main(String[] args) {
		
		try{
			call();//위의 메소드에서 오류가 생긴걸 알수는 없기때문에 정상처리된다.
			System.out.println("정상처리 되었습니다");
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println("처리중에러발생");
		}
		
	}

}
