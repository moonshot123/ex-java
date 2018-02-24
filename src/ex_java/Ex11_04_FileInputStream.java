package ex_java;
// ����ó�� �Ұ� ����.... throws�� �̿��ϸ� ������ �� �� ����
import java.io.File;
import java.io.FileInputStream;

public class Ex11_04_FileInputStream {

	public static void main(String[] args) throws Exception {
		File dir =new File("c:\\sun");
		File f3 =new File(dir,"abc.txt");
		//File f3 =new File("c:\\sun","abc.txt");
		
		FileInputStream fis =new FileInputStream(f3);//f3���� �о�������� (�����͸� �����ϱ�����) ����ٸ�(����ٸ��̸��� fis) �� �����.
		//FileInputStream 1����Ʈ ������ �� �ѱ��� ������ ���� ���� �ؾߵ� 2����Ʈ¥��
		//FileInputStream fis =new FileInputStream("c:\\sun");
		
		/*
		int str;
		while((str=fis.read()) != -1){
			System.out.println((char) str);
		}
		*/
		
		while(true){
			
			int str = fis.read(); //read() �� ���� ����ó���� ������ ����� �Ѵ�.
			//read()�� int�� �����ϴµ� ���� ���� ������ �ƽ�Ű�ڵ尪�� ���Ϲ޴� �޼ҵ� a:97       read()>> �ѱ��ھ� ������(�ƽ�Ű�ڵ尪����)
			if(str==-1){//EOF(��� ����)�� ��(-1)�� ���� ����������. ������ ������ ���������� �����ڵ� �� �ƽ�Ű �ڵ尪��-1
				break;
			}
			System.out.print((char) str);
		}
		fis.close();//����ٸ�(fis)�� �ݰڴ�close()   // �̰͵� ����ó���� �������
		
		//���� ���Ŀ��� fis�� ������ , �ظ��ϸ� 
	}
}


// ���Ͽ��� EOF�� ����ִµ� (end of file) ���ڰ� ����ִ°� �ƴϰ� �׷��� ���°� �� �ִ�. ������ ���� ��Ÿ��