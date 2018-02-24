package ex_java;
import java.io.File;

public class Ex11_02_File {

	public static void main(String[] args) {
		File winfolder = new File("c:\\windows\\"); //window X
		System.out.println(winfolder);
		
		String result = winfolder.isDirectory()?"폴더":"파일"; //winfolder 가 폴더냐? 파일이냐? 삼항연산자 
		System.out.println(result);
		
		String[] lists = winfolder.list(); //list() 이렇게 쓰면 안됨   //winfolder.list()이렇게 쓰자 
		System.out.println(lists.length);
		
		for(int i = 0;i<lists.length;i++){
			File kind = new File(winfolder,lists[i]);
			if(kind.isFile()){
				System.out.println("파일: "+lists[i]);
			}else{
				System.out.println("폴더: "+lists[i]);
			}
		}
		
		
		
	}

}
