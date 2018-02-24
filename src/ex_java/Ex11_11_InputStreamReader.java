package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_11_InputStreamReader {

	public static void main(String[] args) {
		
		System.out.println("데이터입력:");
		InputStream is = System.in; // 키보드를 통한 1바이트만 읽어보겠다. 라는뜻
		//in:키보드      System.in은  InputStream 을 리턴해줌                          InputStream(1바이트 입력ㄱ밧)
		// 엔터를 치기전까지 입력받고 저장
		
		
		//Reader는 2바이트 (한글입력가능)
		try {
			InputStreamReader ir =new InputStreamReader(is);//InputStreamReader: 1바이트 입력을 2바이트로 바꾸겠다 라는뜻   
			BufferedReader br =new BufferedReader(ir);
			
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // 외우기
			//키보드로 입력 받고 1바이트(영어,기호)를 2바이트(한글)로 입력을 받고 버퍼를 이용해서 속도를 높이겠다는뜻   
			
			
			String	str = br.readLine();//readLine(): 빈공간을 포함하는 모든 글자를 입력받는것 (엔터로 구분)  
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
