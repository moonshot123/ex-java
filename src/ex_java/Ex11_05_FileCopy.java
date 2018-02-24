package ex_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_FileCopy {

	public static void main(String[] args) throws IOException {

		//FileInputStream, FileOutputStream �� �������� �ִ� 1�� ��Ʈ��
		
		FileInputStream fis =new FileInputStream("from.txt");//�����͸� �б����� �ٸ� fis�����    // ��ġ��"from.txt"�� ���� ��ġ�� �ִ� ������ ã�� �ƴϸ� ��ġ�� ��������ߵ�
		//InputStream �� �߻�Ŭ�����̱� ������ ����Ҽ� ����.  // FileNotFoundException ����Ǵ¶��� ������ �������� ������, ã���� ������
		//1����Ʈ ¥���� �̰ɷδ� �ѱ��� ������
		int i;  

		FileOutputStream fos =new FileOutputStream("to.txt",true);//�����͸� ������ ���� �ٸ� fos�����     
		//("to.txt",false) Ȥ�� ("to.txt") �� ������ ������ �����ȴ�. ������ ������ ������ ����� ���θ����.
		//("to.txt",true)  ������ ������ �����ǰ� �־ �ڿ� ���ϳ����� �߰��ȴ�. ���ο� ������ ��������°� �ƴϰ� ������ �߰� 
		//"c:\\xyz\\to.txt" ������ ����� ������ xyz��� ������ ���⋚���� ��ΰ� �޶����� ���ܰ� ����    FileNotFoundException ��ΰ� ��ġ ���� ������ 
		
		/*
		while ((i= fis.read())!=-1){

			System.out.println((char)i);
			fos.write(i);
		}
		 */		
		
		while (true){

			i= fis.read();// ������ �д� ���(���� �б�)
			if(i==-1){
				break;
			}else{
				System.out.print((char)i); // �ܼ�â�� ���(����� ���� ���)
				fos.write(i);//���Ͽ� �Է�(���� ����)
			}

		}
		fis.close();
		fos.close();

	}

}
