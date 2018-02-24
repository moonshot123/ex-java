package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	public Card(){}
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String gettel(){
		return tel;
	}
	public String getName() {
		return name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString(){
		return name +"     " + tel;
	}
}


public class Ex09_09_ArrayList_조정우 {

	public static void main(String[] args) throws IOException {
		int input=0;
		String input_name="";
		String input_tel="";

		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 

		ArrayList<Card> list =new ArrayList<Card>();

		Card c =new Card();

		do{
			boolean flag = true;
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
			input = sc.nextInt();
			switch (input) {
			case 1:// 명함추가

				System.out.print("이름을 입력하세요.:");
				input_name = br.readLine();
				System.out.print("번호를 입력하세요:");
				input_tel = sc.next();
				list.add(new Card(input_name,input_tel));
				break;


			case 2://명함삭제

				System.out.print("이름을 입력하세요.:");
				input_name = br.readLine();

				for(int i =0; i<list.size();i++){

					if(list.get(i).getName().equals(input_name)){
						list.remove(i);//i뿐만 아니라 객체 이름을 넣으면 지울수 있음
						System.out.println("삭제되었습니다");
						flag=false;
						break;
					}
				}

				if(flag ==true){
					System.out.println("이름을 잘못입력하셨습니다.");
				}

				break;

			case 3://명함수정

				System.out.print("이름을 입력하세요.:");
				input_name = br.readLine();

				for(int i =0; i<list.size();i++){

					if(list.get(i).getName().equals(input_name)){

						System.out.print("수정하실 번호를 입력하세요:");
						input_tel = sc.next();
						
						list.set(i,new Card(input_name,input_tel));
						System.out.println("수정되었습니다");
						flag=false;
						
						/*세터도 써보자 
						list.get(i).setTel(input_tel);
						System.out.println("수정되었습니다");
						flag=false;
						*/
					}
				}
				if(flag ==true){
					System.out.println("이름을 잘못입력하셨습니다.");
				}

				break;

			case 4://명함보기
				
				System.out.println("이름	전화번호");
				for(Card e :list){
					System.out.println(e);
				}
				/*
				 * 여러방법으로 만들어보자
				for(int i=0;i<list.size();i++){
					Card x= list.get(i);
					System.out.println(x);
					//System.out.println(c.getName()+"\t"+c.gettel());
				}*/
				
				break;

			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("잘못입력했습니다. 다시입력하세요");
				break;
			}
			
			System.out.println();
		}while(true);

	}

}


/* 버퍼드리더사용방법
String name;
System.out.print("이름:");
//name =sc.next();			// 공백있으면 안나옴
//System.out.println(name);

name = br.readLine(); // 예외처리무조건 해야됨 throws 혹은 예외처리 해야됨, 두가지 방법을 다해보자....
//일단 엔터를 치기전까지 공백포함해서 읽음 
System.out.println(name);
 */



/*
1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : 홍 길동
전화번호를 입력하세요 : 111

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : 이 윤성
전화번호를 입력하세요 : 222

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
홍 길동		111
이 윤성		222

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : 이윤성
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : 이 윤성
수정하실 전화번호는 : 333
수정되었습니다. 

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
홍 길동		111
이 윤성		333

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : 이윤성
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : 이 윤성
삭제되었습니다. 

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
홍 길동		111

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
프로그램을 종료합니다.
 */
