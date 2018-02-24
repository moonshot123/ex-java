package ex_java;
// 입출력을 통해서 텍스트 파일에 데이터를 입혁하는 방법 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_12_InputStreamReader {

	public static void main(String[] args) {

		String filename;
		String str;
		//System.out.printf("\t   \n \\");//   \\이렇게 쓰면 \ 나옴 1개만쓰면 오류됨  
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.print("파일을 입력하세요:");
			filename = br.readLine();

			//System.out.println(filename);

			FileWriter fw =new FileWriter(filename);//1차스트림
			BufferedWriter bw = new BufferedWriter(fw);//2스트림 // 대부분 입출력에서는 버퍼를 쓰니까 그냥 쓰자

			//컨트롤+z 가 null이다.
			while((str= br.readLine()) != null){//1바이트에서는 eof가 -1    2바이트에서는null
				//str= br.readLine(); // readLine() 한줄만 입력됨
				bw.write(str);//bw를 통해서 write()쓰라는 말인데  str에 들어가 있는 데이터를 파일에 쓴다는 말이다.
				bw.newLine();//
			}//연습파일 위치:  c:\sun\test.txt
			
			bw.close();// 닫아줘야 들어감 그렇지 않으면 버퍼에 남아있음

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
