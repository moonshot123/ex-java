package ex_java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ex11_14_������ {

	public static void main(String[] args) throws IOException {
		int input_num;
		String input;
		boolean retry=false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		FileWriter fw =new FileWriter("ex.txt",true);
		Scanner fsc = new Scanner(new File("ex.txt")).useDelimiter("/");		
		
		
		do{
			System.out.println("1.�ܾ��Է� 2.�ܾ�˻� 3.����");
			System.out.print(">>");
			input_num = sc.nextInt();

			switch (input_num) {
			
			case 1://�ܾ� �Է��ϱ�
				System.out.print("�ܾ�/�� �Է�>>");
				input = br.readLine();
				fw.write(input);
				fw.write("\r\n"); // ���� �ѱ�� ��û�߿���
				fw.flush();
				break;
			case 2://�ܾ� �˻��ϱ�
				System.out.print("�˻��ܾ� �Է�>>");
				input=br.readLine();
				
				while(fsc.hasNextLine()){
					
						System.out.print("�ܾ�>"+fsc.next()+"\n");
						System.out.print("�ܾ��� ��>"+fsc.next()+"\n");
					
				}
				
				break;
			case 3:
				System.out.println("����Ǿ����ϴ�");
				fw.close();
				fsc.close();
				System.exit(0);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				break;
			}

		}while(true);

		
	}

}

/*
ȫ�浿
11
22
33
�Է�

����
21
51
74

....

���Ͽ� �Է�

�ٸ����Ͽ� �����ϴµ�
���񺰷� ���

������� ���
*/



/*
 * �����Ͱ� txt���Ϸ� ���� �������� �ؽ�Ʈ ������ ����
 * 
1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>1
�ܾ�/�� �Է�>>apple/���

1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>1
�ܾ�/�� �Է�>>blue desk/�Ķ� å��

1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>1
�ܾ�/�� �Է�>>hand/��

1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>2
�˻� �ܾ� �Է�>>hand
�ܾ�>hand
�ܾ��� ��>��

1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>2
�˻� �ܾ� �Է�>>bluedesk
ã�� �ܾ� ����

1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>2
�˻� �ܾ� �Է�>>blue desk
�ܾ�>blue desk
�ܾ��� ��>�Ķ� å��

1.�ܾ��Է� 2.�ܾ�˻� 3.����
>>3
���α׷� �����մϴ�.
 */
