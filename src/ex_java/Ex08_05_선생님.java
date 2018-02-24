package ex_java;
import java.util.Scanner;

class Person5{

	String id;
	String pw;
	String name;
	public Person5(){}
	public Person5(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}

public class Ex08_05_선생님 {
	public static void main(String[] args) {
		boolean result=true;
		String inputId="";
		String inputPw="";
		String yn="";
		boolean flag=false;
		Scanner sc =new Scanner(System.in);
		Person5[] p = {
				new Person5("kim","1234","김연아"),
				new Person5("park","5678","박보검"),
				new Person5("lee","3333","이승기")
		};

		do{
			flag=false;
			System.out.print("Id입력:");
			inputId=sc.next();

			if(inputId.length()<3 || inputId.length()>8){
				System.out.println("id는 3글자~8글자 입력해야 합니다.");
				continue;// while do~while은 조건문으로 이동 
			}            // for : 증감식 
						 // 이걸 생각보다 활용을 못함(연습필요)

			for(int i=0; i<p.length;i++){
				if(inputId.equals(p[i].id)){
					System.out.print("pw입력:");
					inputPw=sc.next();
					//flag=true; 여기다가쓸수 있음
					if(inputPw.equals(p[i].pw)){
						System.out.println(p[i].name+"님 반갑습니다.");
						flag=true;
						break;//반복문을 빠져나간다. if문을 빠져나가는것이 아님, 그 위의 for문을 빠져나감 가장가까운 반복문을 빠져나옴
					}else{
						System.out.println("비번이 다릅니다.");
						flag=true;
						break;
					}
				}
			}//1.break 실행되면 이쪽으로  2.전부 돌았을떄 : 못찾았을떄
			
			//이럴떄는일단 끝까지 for문이 돌고 나서 나와야됨 하지만 for문이 돌면서도 상태를 관리해주는flag를 사용해서 해당아이디 여부를 확인할 수있도록 만들어줘야한다.
			//일단 왠만하면 for문을 같이 쓰도록 합시다...
			if(flag==false){
				System.out.println("해당 아이디가 없습니다.");
			}

			System.out.print("계속:y?");
			yn=sc.next();

		}while(yn.equalsIgnoreCase("y"));
		System.out.println("프로그램을 종료합니다.");
	}
}


	/*
		id입력:as
		id는 3글자~8글자 입력해야 합니다.
		id입력:sdfsfsdfsdfsf
		id는 3글자~8글자 입력해야 합니다.
		id입력:choi
		해당 아이디가 없습니다.
		계속?y
		id입력:kim
		pw입력:1234
		김연아님 반갑습니다.
		계속?y
		id입력:park
		pw입력:4334
		비번이 맞지 않습니다.
		계속?y
		id입력:pa
		id는 3글자~8글자 입력해야 합니다.
		id입력:park
		pw입력:5678
		박보검님 반갑습니다.
		계속?n
		프로그램을 종료합니다.
	 */