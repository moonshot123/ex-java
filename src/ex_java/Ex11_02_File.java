package ex_java;
import java.io.File;

public class Ex11_02_File {

	public static void main(String[] args) {
		File winfolder = new File("c:\\windows\\"); //window X
		System.out.println(winfolder);
		
		String result = winfolder.isDirectory()?"����":"����"; //winfolder �� ������? �����̳�? ���׿����� 
		System.out.println(result);
		
		String[] lists = winfolder.list(); //list() �̷��� ���� �ȵ�   //winfolder.list()�̷��� ���� 
		System.out.println(lists.length);
		
		for(int i = 0;i<lists.length;i++){
			File kind = new File(winfolder,lists[i]);
			if(kind.isFile()){
				System.out.println("����: "+lists[i]);
			}else{
				System.out.println("����: "+lists[i]);
			}
		}
		
		
		
	}

}
