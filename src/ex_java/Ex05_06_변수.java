package ex_java;
class VarCnt{
	static int a =0;
	int b=0;
	
	public void increment(){
		
		int c =0; // c는 increment()메소드안에서만 사용되는 지역변수 
		a++; b++; c++;
		
		System.out.println("static 변수 a:"+a);
		System.out.println("인스턴스 변수 b:"+b);
		System.out.println("지역 변수 c:"+c);
		System.out.println();
	}
}


public class Ex05_06_변수 {
	public static void main(String[] args) {
		
		int a=0;// 지역변수는 항상 초기화 되지 않기 때문에 꼭 초기화 해야됨 안그럼 빨간줄... 인스턴스변수나 static변수는 자동으로 초기화가 된다.
		System.out.println("객체1 생성");
		VarCnt cnt1 =new VarCnt();
		cnt1.increment();
		cnt1.increment();
		
		System.out.println("객체2 생성");
		VarCnt cnt2 =new VarCnt();
		cnt2.increment();
		cnt2.increment();
		
		/*
		int i;
		for(i=1;i<5;i++){
			int j=3; //지역변수: for문안에 들어가기 때문에 j는 다른곳에서는 쓸수 없다 바로 아래 for문에서 쓰려고 하면 오류가 나는이유가 그런거.....
			System.out.print(i+" "+j);
		}
		System.out.println();
		
		for(i=11;i<15;i++){
			System.out.print(i+" "+j+a);
		}
		*/
	}
}
