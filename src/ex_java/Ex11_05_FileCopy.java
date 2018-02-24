package ex_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_FileCopy {

	public static void main(String[] args) throws IOException {

		//FileInputStream, FileOutputStream 은 직접쓸수 있는 1차 스트림
		
		FileInputStream fis =new FileInputStream("from.txt");//데이터를 읽기위한 다리 fis만들기    // 위치는"from.txt"는 현재 위치에 있는 파일을 찾음 아니면 위치를 지정해줘야됨
		//InputStream 은 추상클래스이기 때문에 사용할수 없다.  // FileNotFoundException 실행되는때는 파일이 존재하지 않을때, 찾을수 없을떄
		//1바이트 짜리라서 이걸로는 한글은 사용못함
		int i;  

		FileOutputStream fos =new FileOutputStream("to.txt",true);//데이터를 보내기 위한 다리 fos만들기     
		//("to.txt",false) 혹은 ("to.txt") 는 파일이 없으면 생성된다. 하지만 파일이 있으면 지우고 새로만든다.
		//("to.txt",true)  파일이 없으면 생성되고 있어도 뒤에 파일내용이 추가된다. 새로운 파일이 만들어지는게 아니고 내용이 추가 
		//"c:\\xyz\\to.txt" 파일을 만들고 싶은데 xyz라는 폴더가 없기떄문에 경로가 달라져서 예외가 생김    FileNotFoundException 경로가 일치 하지 않을때 
		
		/*
		while ((i= fis.read())!=-1){

			System.out.println((char)i);
			fos.write(i);
		}
		 */		
		
		while (true){

			i= fis.read();// 파일을 읽는 기능(글자 읽기)
			if(i==-1){
				break;
			}else{
				System.out.print((char)i); // 콘솔창에 출력(저장된 글자 출력)
				fos.write(i);//파일에 입력(글자 저장)
			}

		}
		fis.close();
		fos.close();

	}

}
