package ex_java;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_10_FileReader {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw =new FileWriter("write.txt",true);//"write.txt" ������ �������  //true������ ������ ����� ������ �Ǹ����.  // ��ΰ� �߸��Ǹ� ������ ����µ� IOException�� ����
		fw.write("��ſ� �ڹټ���");
		fw.close();
		
		FileReader fr =new FileReader("write.txt");
		int i;
		
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}
		fr.close();
		
	}

}
