package ex_java;
// ������� ���ؼ� �ؽ�Ʈ ���Ͽ� �����͸� �����ϴ� ��� 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_12_InputStreamReader {

	public static void main(String[] args) {

		String filename;
		String str;
		//System.out.printf("\t   \n \\");//   \\�̷��� ���� \ ���� 1�������� ������  
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.print("������ �Է��ϼ���:");
			filename = br.readLine();

			//System.out.println(filename);

			FileWriter fw =new FileWriter(filename);//1����Ʈ��
			BufferedWriter bw = new BufferedWriter(fw);//2��Ʈ�� // ��κ� ����¿����� ���۸� ���ϱ� �׳� ����

			//��Ʈ��+z �� null�̴�.
			while((str= br.readLine()) != null){//1����Ʈ������ eof�� -1    2����Ʈ������null
				//str= br.readLine(); // readLine() ���ٸ� �Էµ�
				bw.write(str);//bw�� ���ؼ� write()����� ���ε�  str�� �� �ִ� �����͸� ���Ͽ� ���ٴ� ���̴�.
				bw.newLine();//
			}//�������� ��ġ:  c:\sun\test.txt
			
			bw.close();// �ݾ���� �� �׷��� ������ ���ۿ� ��������

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
