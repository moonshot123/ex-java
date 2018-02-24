package ex_java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_14_선생님 {

public static void main(String arg[]) throws IOException { 
		
		String str;
		int count = 0;   
		boolean flag=false;

		Scanner sc = new Scanner(System.in); 
		String input; 
		BufferedReader in = null; 
		BufferedWriter out = null; 
		
		while(true) { 
			System.out.println("1.단어입력 2.단어검색 3.종료"); 
			System.out.print(">>");
			input = sc.next();
						
			switch(input.charAt(0)) { //charAt(0):째 위치해 있는것을 가져와라 // charAt(0)걸로도 만들어 보자
			case '1':
			
				System.out.print("단어/뜻 입력>>");				
				
				in = new BufferedReader(
						new InputStreamReader(System.in));
				str = in.readLine();// 띄어쓰기 가능하도록 만듬 
				
				out = new BufferedWriter(
						new FileWriter("c:\\sun\\voca.txt",true));//2바이트짜리 문자스트림을 이용해서 만들자
				
				out.write(str);
				out.write("\r\n");//out.newLine();과 같다. //엔터를 친것과 같은 뜻?
				System.out.println();
				out.close();
				break; 				
				
			case '2': 
				System.out.print("검색 단어 입력>>"); 
				
				in = new BufferedReader(
						new InputStreamReader(System.in));
				str =in.readLine();
				
				in = new BufferedReader(
						new FileReader("c:\\sun\\voca.txt"));// 
				String line; 
				
				while ((line = in.readLine()) != null) { //apple/사과 //readLine()라인별로 읽고 쓰는 것인듯
					flag=false;
					String[] tokens = line.split("/"); //split 리턴 값: 배열
					//tokens[0]=apple, tokens[1]=사과
					
					if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0){ //trim():공백지우는 메소드 //compareToIgnoreCase:대소문자 무시
						System.out.println("단어>" + tokens[0].trim()); 
						System.out.println("단어의 뜻>" + tokens[1]);
						flag=true;
						break;
					} 
				} 
				if(!flag){
					System.out.println("찾는 단어 없음");
				}
				System.out.println();
				
				break; 
				
			case '3': 
				System.out.println("프로그램 종료합니다.");
				in.close(); 
				System.exit(0); 
			} 
		} 
	} 
}




/*
1.단어입력 2.단어검색 3.종료
>>1
단어/뜻 입력>>apple/사과

1.단어입력 2.단어검색 3.종료
>>1
단어/뜻 입력>>blue desk/파란 책상

1.단어입력 2.단어검색 3.종료
>>1
단어/뜻 입력>>hand/손

1.단어입력 2.단어검색 3.종료
>>2
검색 단어 입력>>hand
단어>hand
단어의 뜻>손

1.단어입력 2.단어검색 3.종료
>>2
검색 단어 입력>>bluedesk
찾는 단어 없음

1.단어입력 2.단어검색 3.종료
>>2
검색 단어 입력>>blue desk
단어>blue desk
단어의 뜻>파란 책상

1.단어입력 2.단어검색 3.종료
>>3
프로그램 종료합니다.
*/


