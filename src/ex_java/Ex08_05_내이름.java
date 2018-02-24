package ex_java;
class Person{
	
	String id;
	String pw;
	String name;
	
}

public class Ex08_05_내이름 {
	public static void main(String[] args) {
		
		Person[] p = {
						new Person("kim","1234","김연아"),
						new Person("park","5678","박보검"),
						new Person("lee","3333","이승기")
					};
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

