package ex_java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_13_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("data.txt")).useDelimiter(",");         //new File("data.txt") //"data.txt"������ �аڴ�.
		int sum= 0, cnt=0, num;
		
		while(sc.hasNextInt()){//hasNextInt() ������ �� ������ �ֳ�? ���� 4���� ����
			num= sc.nextInt();
			System.out.print(num+" ");
			sum += num;
			cnt++;// �ؽ�Ʈ ���Ͽ��� �������� ���ڰ����� �����ϱ����ؼ�
		}
		
		System.out.println("\nsum="+sum);
		System.out.println("average="+(double)sum/cnt);
		sc.close();
	}

}
