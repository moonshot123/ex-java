package ex_java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex11_14_������ {

public static void main(String arg[]) throws IOException { 
		
		String str;
		int count = 0;   
		boolean flag=false;

		Scanner sc = new Scanner(System.in); 
		String input; 
		BufferedReader in = null; 
		BufferedWriter out = null; 
		
		while(true) { 
			System.out.println("1.�ܾ��Է� 2.�ܾ�˻� 3.����"); 
			System.out.print(">>");
			input = sc.next();
						
			switch(input.charAt(0)) { //charAt(0):° ��ġ�� �ִ°��� �����Ͷ� // charAt(0)�ɷε� ����� ����
			case '1':
			
				System.out.print("�ܾ�/�� �Է�>>");				
				
				in = new BufferedReader(
						new InputStreamReader(System.in));
				str = in.readLine();// ���� �����ϵ��� ���� 
				
				out = new BufferedWriter(
						new FileWriter("c:\\sun\\voca.txt",true));//2����Ʈ¥�� ���ڽ�Ʈ���� �̿��ؼ� ������
				
				out.write(str);
				out.write("\r\n");//out.newLine();�� ����. //���͸� ģ�Ͱ� ���� ��?
				System.out.println();
				out.close();
				break; 				
				
			case '2': 
				System.out.print("�˻� �ܾ� �Է�>>"); 
				
				in = new BufferedReader(
						new InputStreamReader(System.in));
				str =in.readLine();
				
				in = new BufferedReader(
						new FileReader("c:\\sun\\voca.txt"));// 
				String line; 
				
				while ((line = in.readLine()) != null) { //apple/��� //readLine()���κ��� �а� ���� ���ε�
					flag=false;
					String[] tokens = line.split("/"); //split ���� ��: �迭
					//tokens[0]=apple, tokens[1]=���
					
					if(tokens[0].trim().compareToIgnoreCase(str.trim()) == 0){ //trim():��������� �޼ҵ� //compareToIgnoreCase:��ҹ��� ����
						System.out.println("�ܾ�>" + tokens[0].trim()); 
						System.out.println("�ܾ��� ��>" + tokens[1]);
						flag=true;
						break;
					} 
				} 
				if(!flag){
					System.out.println("ã�� �ܾ� ����");
				}
				System.out.println();
				
				break; 
				
			case '3': 
				System.out.println("���α׷� �����մϴ�.");
				in.close(); 
				System.exit(0); 
			} 
		} 
	} 
}




/*
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


