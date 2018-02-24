package ex_java;
import java.util.Scanner;

public class Ex08_03_String {

	public static void main(String[] args) {
		
		String a1="nice";
		String b1="nice";
		System.out.println(a1==b1);//���� �ּҰ��� ���� �ȴ�. �����ϳ��� �ּҸ� ������
		
		String c1=new String("nice");
		String d1=new String("nice");
		System.out.println(c1==d1);// �ּҰ� ����� false�� ���� ��ü�� ���� ����⋚����
		
		
		String s1 ="     abc      DE   Fg   "; // ���ڿ��� �ڸ��ڷ������� �ٸ��� �ּҰ��� ������ �ִµ� 
		String msg;
		
		
		msg=s1.toUpperCase();// StringŬ������ ������ �ִ� �޼ҵ�� �ҹ��ڸ� �빮�ڷ� �ٲ���
		System.out.println("s1�빮��: "+msg);
		
		System.out.println("s1�ҹ���: "+s1.toLowerCase());// �ҹ��ڷ� �ٲ���
 		
		msg= s1.trim();
		//trim(): ù���ھ�, ���������ڵ��� ��������
		System.out.println("trim()��:"+msg);
		
		
		String s2 ="apple";
		System.out.println("��ҹ��ڱ��� ��:"+ s2.equals("Apple")); // ��ҹ��ڱ��� ������ ��
		System.out.println("��ҹ��� ����:"+ s2.equalsIgnoreCase("Apple")); // ��ҹ��� �����ϰ���ϴ� �޼ҵ�
		//System.out.println(s2=="apple"); �̷��� �������� ���ڿ��� ���Ҷ��� equals�� �������
		
		System.out.println("compareTo(s2):"+s2.compareTo("apple"));//String s2 ="apple"; �� �Ű������� ���ؼ� ������ 0 ����
		// ������ 0
		// ������ ũ�� ���
		// �񱳴��(�Ű�����)�� ũ�� ����
		// �Ϲ������� 0�̳� 0�� �ƴϳ�?�� ���
		
		
		char at = s2.charAt(3);// 0���ͽ����ؼ� �Ű��������� ���ڿ� ��ġ�� ���ڸ� ����
		System.out.println("4���� ��ġ�� ����"+at);
		
		String str1 = "Have a nice day";
		System.out.println(str1.indexOf("nice"));// ������ �ε����� �˷��� ������ -1�� ��������
		System.out.println(str1.lastIndexOf("a"));// ������ a�� ã��
		System.out.println(str1.indexOf("good"));// ������ �ε����� �˷��� ������ -1�� ��������
		
		System.out.println(str1.length());//���̴� 1����  ��ġ�� 0���� ������
		//length; �迭�� ����(���� ����)
		//length(); ���ڿ��� ���̸�
		
		System.out.println(str1.substring(7, 11));//7~(11-1)������ ���ڿ��� ���� 
		System.out.println(str1.substring(7));//7~�������� ���ڿ��� ���� 
		
		
		String fullName ="hello.java";
		String fileName = "",ext="";
		
		int x=fullName.indexOf("."); //������
		fileName=fullName.substring(0, x);
		ext=fullName.substring(x+1);
		System.out.println(fullName+"�� Ȯ���ڸ� ������ �̸���"+fileName);
		System.out.println(fullName+"�� Ȯ���ڴ�"+ext);
		
		Scanner sc =new Scanner(System.in);//��Ʈ��+����Ʈ +���ĺ�O: �ڵ�����Ʈ
		
		String id="kim "; //�ڿ� ������� ���� ���� �����������// ���̵�� ����� ��������
		String pw="1234"; //String pw =new String("1234");  
		
		System.out.print("ID:");
		String inputId =sc.next();
		
		System.out.print("PW:");
		String inputPw =sc.next();
		
		if(id.trim().equals(inputId) && pw.equals(inputPw)){//���ڿ��� == ���� ����������  // ���ڳ�char�������� ���ҋ��� ==�� ����ؾ���
			System.out.println("�α��� ����");
		}else{
			System.out.println("�α��� �Ұ���");
		}
		
		System.out.println(id);
		System.out.println(id.toString());//���Ʒ� ������
		//String�� toString �� �������̵��س��µ� �׷��� ��Ʈ�������� ���ڿ��� �������� �������̵��ص���
		//String�� equals�� ���ڿ��� ���ϴ� �޼ҵ�� �������̵��ص��� �׷��� ��Ʈ�������� �ٷ� ���ڿ��� �񱳰� ������
		
		
		
	}

}
