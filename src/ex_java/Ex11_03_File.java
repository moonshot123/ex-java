package ex_java;
import java.io.File;
import java.io.IOException;

public class Ex11_03_File {

	public static void main(String[] args) {
		File f1 =new File("A");// Ȯ���ڰ� ������ ����
		File f2 =new File("B");// ���� ��ġ�� �������� ������ ���� �۾���ġ�� ����
		File f3 =new File("C");
		File f4 =new File(f1,"aa.txt");//f1 �� ���ٸ� �����۾������� �ٷ� ���� //
		
		if(f1.exists()){
			f1.renameTo(f2);// �̸��ٲٱ�f1> f2 �̸�����
			System.out.println("�����̸� �ٲٱ� �Ϸ�");
		}else{
			f1.mkdir();// ���������:mkdir();
			System.out.println("����������");
			
			try {
				f4.createNewFile();	//���ϸ����:createNewFile();  //����ó���� ����ߵ�
				System.out.println("ȭ�ϻ�����");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(f3.exists()){
			boolean bool = f3.delete();// ��ҹ��� ������µ�   // �����ȿ� ������ ������ ��������
			System.out.println(bool);
			if(bool){ //bool == true
				System.out.println("�����Ϸ�");
			}else{
				System.out.println("��������");
			}
		}
	}
}