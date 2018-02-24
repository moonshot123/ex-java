package ex_java;
// 예외처리 할게 많다.... throws를 이용하면 빠르게 할 수 있음
import java.io.File;
import java.io.FileInputStream;

public class Ex11_04_FileInputStream {

	public static void main(String[] args) throws Exception {
		File dir =new File("c:\\sun");
		File f3 =new File(dir,"abc.txt");
		//File f3 =new File("c:\\sun","abc.txt");
		
		FileInputStream fis =new FileInputStream(f3);//f3에서 읽어오기위한 (데이터를 연결하기위한) 연결다리(연결다리이름은 fis) 를 만든다.
		//FileInputStream 1바이트 데이터 라서 한글은 읽을수 없고 따로 해야됨 2바이트짜리
		//FileInputStream fis =new FileInputStream("c:\\sun");
		
		/*
		int str;
		while((str=fis.read()) != -1){
			System.out.println((char) str);
		}
		*/
		
		while(true){
			
			int str = fis.read(); //read() 도 보면 예외처리를 무조건 해줘야 한다.
			//read()는 int를 리턴하는데 내가 읽은 글자의 아스키코드값을 리턴받는 메소드 a:97       read()>> 한글자씩 가져옴(아스키코드값으로)
			if(str==-1){//EOF(어떠한 상태)의 값(-1)이 들어가면 빠져나간다. 파일이 끝나면 빠져나가기 위한코드 의 아스키 코드값이-1
				break;
			}
			System.out.print((char) str);
		}
		fis.close();//연결다리(fis)를 닫겠다close()   // 이것도 예외처리를 해줘야함
		
		//닫은 이후에는 fis는 사용못함 , 왠만하면 
	}
}


// 파일에는 EOF가 들어있는데 (end of file) 글자가 들어있는게 아니고 그러한 상태가 들어가 있다. 파일의 끝을 나타냄