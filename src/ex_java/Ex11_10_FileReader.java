package ex_java;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_10_FileReader {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw =new FileWriter("write.txt",true);//"write.txt" 파일이 만들어짐  //true파일이 없으면 만들고 있으면 또만든다.  // 경로가 잘못되면 오류가 생기는데 IOException이 생김
		fw.write("즐거운 자바수업");
		fw.close();
		
		FileReader fr =new FileReader("write.txt");
		int i;
		
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}
		fr.close();
		
	}

}
