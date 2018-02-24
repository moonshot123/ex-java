package ex_java;
import java.io.File;

public class Ex11_01_File {

	public static void main(String[] args) {
		
		String s = File.separator; //리턴값이 String 이라서 s에 넣을수 있음
		//separator변수는 static이기때문에 File.separator 사용가능 문자열 리턴
		//separator 구분자 (/ or \)
		System.out.println(s);
		//c:\imsi\a.txt >>>>  윈도우에서는 \(역슬래쉬) 
		//c:/imsi/a.txt >>>>  리눅스에서는 /이렇게됨
		//다르기 때문에 귀찮을수 있으니 separator를 넣어주면 알아서 맞게 만들어짐 이런거 틀리기좋다....
		
		
		//File을 객체로 만들어주는방법 
		//File f1 =new File();//new File() 파일에는 이런 생성자가 없어서 객체를 못만듬
		//1번방법//File f1 =new File("c:\\sun\\abc.txt"); //  \\2개씩 써줘야된다고함
		//2번방법//File f1 =new File("c:\\sun","abc.txt");// 문자열 두개짜리 생성자
		
		//File dir =new File("c:\\sun");// 3번방법
		//File f1 =new File(dir,"abc.txt");// 문자열 두개짜리 생성자
		
		File f1 =new File("c:" + File.separator+"sun" + File.separator + "abc.txt"); 
		
		
		System.out.println(f1.exists());//exists() 존재 여부를 물어보는것 // 반환값은 boolean형
		System.out.println(f1.length());//f1파일의 길이 hello인데 5글자+엔터(2칸으로인식) // 엔터는 맨앞으로 가는 기능과 아래칸으로 내려가는 것이 있음
		
	}

}
