package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_11_InputStreamReader {

	public static void main(String[] args) {
		
		System.out.println("�������Է�:");
		InputStream is = System.in; // Ű���带 ���� 1����Ʈ�� �о�ڴ�. ��¶�
		//in:Ű����      System.in��  InputStream �� ��������                          InputStream(1����Ʈ �Է¤���)
		// ���͸� ġ�������� �Է¹ް� ����
		
		
		//Reader�� 2����Ʈ (�ѱ��Է°���)
		try {
			InputStreamReader ir =new InputStreamReader(is);//InputStreamReader: 1����Ʈ �Է��� 2����Ʈ�� �ٲٰڴ� ��¶�   
			BufferedReader br =new BufferedReader(ir);
			
			
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // �ܿ��
			//Ű����� �Է� �ް� 1����Ʈ(����,��ȣ)�� 2����Ʈ(�ѱ�)�� �Է��� �ް� ���۸� �̿��ؼ� �ӵ��� ���̰ڴٴ¶�   
			
			
			String	str = br.readLine();//readLine(): ������� �����ϴ� ��� ���ڸ� �Է¹޴°� (���ͷ� ����)  
			System.out.println(str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
