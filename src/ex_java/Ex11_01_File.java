package ex_java;
import java.io.File;

public class Ex11_01_File {

	public static void main(String[] args) {
		
		String s = File.separator; //���ϰ��� String �̶� s�� ������ ����
		//separator������ static�̱⶧���� File.separator ��밡�� ���ڿ� ����
		//separator ������ (/ or \)
		System.out.println(s);
		//c:\imsi\a.txt >>>>  �����쿡���� \(��������) 
		//c:/imsi/a.txt >>>>  ������������ /�̷��Ե�
		//�ٸ��� ������ �������� ������ separator�� �־��ָ� �˾Ƽ� �°� ������� �̷��� Ʋ��������....
		
		
		//File�� ��ü�� ������ִ¹�� 
		//File f1 =new File();//new File() ���Ͽ��� �̷� �����ڰ� ��� ��ü�� ������
		//1�����//File f1 =new File("c:\\sun\\abc.txt"); //  \\2���� ����ߵȴٰ���
		//2�����//File f1 =new File("c:\\sun","abc.txt");// ���ڿ� �ΰ�¥�� ������
		
		//File dir =new File("c:\\sun");// 3�����
		//File f1 =new File(dir,"abc.txt");// ���ڿ� �ΰ�¥�� ������
		
		File f1 =new File("c:" + File.separator+"sun" + File.separator + "abc.txt"); 
		
		
		System.out.println(f1.exists());//exists() ���� ���θ� ����°� // ��ȯ���� boolean��
		System.out.println(f1.length());//f1������ ���� hello�ε� 5����+����(2ĭ�����ν�) // ���ʹ� �Ǿ����� ���� ��ɰ� �Ʒ�ĭ���� �������� ���� ����
		
	}

}
