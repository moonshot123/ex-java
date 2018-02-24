package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
// ������ �ּҸ� ���� ip�ּҸ� �˾Ƴ��¹��
public class Ex13_01_InetAddress {

	public static void main(String[] args) {
		
		BufferedReader br ;
		String url=null ;
		InetAddress[] addresses;//ip�ּҴ� InetAddress Ÿ������ �����ߵ� �׸��� ���� �ϼ� �ֱ⶧���� �迭�� ��������
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������Ʈ �ּҸ� �Է��ϼ���");
		
		try {
			url = br.readLine();
			
			addresses = InetAddress.getAllByName(url);//getAllByName�� �������� ip�ּҷ� �ٲ���
			// �ش� �����ΰ� ���� �Ǿ��ִ� ��� �ּҸ� �˷���
			for(int i=0; i<addresses.length;i++){
				System.out.println(addresses[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
