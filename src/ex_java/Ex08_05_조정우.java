package ex_java;
import java.util.Scanner;

class Person{

	String id;
	String pw;
	String name;
	public Person(){}
	public Person(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}

public class Ex08_05_조정우 {
	public static void main(String[] args) {
		boolean result=true;
		String inputId="";
		String inputPw="";
		String yn="";
		int count=0;
		Scanner sc =new Scanner(System.in);
		Person[] p = {
				new Person("kim","1234","김연아"),
				new Person("park","5678","박보검"),
				new Person("lee","3333","이승기")
		};


		do{

			while(result){

				System.out.print("Id입력:");
				inputId=sc.next();

				if(inputId.length()>=3 && inputId.length()<=8){

					for(int i=0; i<p.length;i++){

						if(inputId.equals(p[i].id)){
							result=false;
							break;
						}else{
							count++;
						}
					}
					if(count==p.length){
					System.out.println("해당 아이디가 없습니다.");
					}
				}else{
					System.out.println("id는 3글자~8글자 입력해야 합니다.");
				}

			}
			
			
			count=0;
			result = true;
			while(result){

				System.out.print("pw입력:");
				inputPw=sc.next();

				for(int i=0; i<p.length;i++){

					if(inputPw.equals(p[i].pw)){
						System.out.println(p[i].name+"님 반갑습니다.");
						result=false;
						break;
					}else{
						count++;
					}
					if(count==p.length){
						System.out.println("비번이 다릅니다.");
						
					}
				}
			}

			
			System.out.print("계속:y?");
			yn=sc.next();
			if(yn.equalsIgnoreCase("y")){
				result=true;
			}else{
				result=false;
			}

		}while(result);


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
