package ex_java;
import java.util.Scanner;

public class Ex01_01_���� {
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		int ex_01;
		double ex_02;
		
		System.out.println("�����Է�:"); 
		ex_01 = input.nextInt();
		
		System.out.println("�Ҽ����Է�:"); 
		ex_02 = input.nextDouble();
		
		
		System.out.println("�Է¹��� ����"+ex_01);
		System.out.println("�Է¹��� �Ҽ�"+ex_02);
		
		System.out.println("�μ��� ���ϸ�:"+ (ex_02 + ex_01));
		
	}
		
}
