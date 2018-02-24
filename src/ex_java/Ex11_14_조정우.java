package ex_java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_14_조정우 {

	public static void main(String[] args) throws IOException {
		int input_num;
		String input;
		boolean retry=false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		FileWriter fw =new FileWriter("ex.txt",true);
		Scanner fsc = new Scanner(new File("ex.txt")).useDelimiter("/");		
		
		
		do{
			System.out.println("1.단어입력 2.단어검색 3.종료");
			System.out.print(">>");
			input_num = sc.nextInt();

			switch (input_num) {
			
			case 1://단어 입력하기
				System.out.print("단어/뜻 입력>>");
				input = br.readLine();
				fw.write(input);
				fw.write("\r\n"); // 한줄 넘기기 엄청중요함
				fw.flush();
				break;
			case 2://단어 검색하기
				System.out.print("검색단어 입력>>");
				input=br.readLine();
				
				while(fsc.hasNextLine()){
					
						System.out.print("단어>"+fsc.next()+"\n");
						System.out.print("단어의 뜻>"+fsc.next()+"\n");
					
				}
				
				break;
			case 3:
				System.out.println("종료되었습니다");
				fw.close();
				fsc.close();
				System.exit(0);
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}

		}while(true);

		
	}

}

/*
홍길동
11
22
33
입력

수지
21
51
74

....

파일에 입력

다른파일에 복사하는데
과목별로 평균

사람별로 평균
*/



/*
 * 데이터가 txt파일로 저장 읽을떄도 텍스트 파일을 읽음
 * 
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
