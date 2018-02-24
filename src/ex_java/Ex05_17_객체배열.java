package ex_java;
import java.util.Scanner;

class Saram{
	
	private String name;
	private int age;
	
	Saram() {	
	}
	
	Saram(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	// 이걸안쓰면 배열 주소가 나온다.....
	public String toString(){
		return name+","+age;
	}
	
}


public class Ex05_17_객체배열 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//위에 있는 변수와 는 상관없음
		String name;
		int age;
		
		Saram[] sa= new Saram [3];
		sa[0]=new Saram("고릴라",80);
		
		for(int i=1; i<sa.length;i++){

			System.out.print("이름:");
			name=sc.next();
			System.out.print("나이:");
			age=sc.nextInt();
			
			sa[i]=new Saram(name,age);
			
		}
		
		
		//널포인트 예외 > 값이 없는데 출력하라고 해서 나옴
		
		for(Saram s:sa){
			System.out.println(s.toString());//toString에 대한 중요성을 알수 있다.
		}
		
		
		for(int i=0; i<sa.length;i++){
			if(sa[i] != null){
			System.out.println(sa[i]);
			}
		}
		
		
		/*for(int i=0; i<sa.length;i++){
			System.out.println(sa[i]);
		}*/
		
	}

}
