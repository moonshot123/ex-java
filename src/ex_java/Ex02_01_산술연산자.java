package ex_java;
import java.util.Scanner;

public class Ex02_01_��������� {
	public static void main (String [] args){
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		num1 = sc.nextInt();
		System.out.print("����2 : ");
		num2 = sc.nextInt();
		
		/**
		 * println�� printf ��
		*/
		System.out.println("ù��°����:" + num1 +"�ι�°����:" + num2);
		
		System.out.println("���ϱ�:" + (num1 + num2));
		System.out.println("���ϱ�:" + (num1 * num2));
		System.out.println("����:" + (num1 - num2));
		System.out.println("������:" + (num1 / num2)); //3.0
		System.out.println("������:" + ((double) num1 / num2)); //3.33333
		System.out.println("������:" + (double)( num1 / num2)); //3.0
		System.out.println("������:" + ( num1 % num2)); //1
		
		System.out.println();
		
			
		System.out.printf("num1:%d  �̰� num2:%d �Դϴ�.%n",num1,num2);  
		System.out.printf("num1:%5d �̰� num2:%-3d �Դϴ�.%n",num1,num2);  //���ڸ� ���ָ� ������ ����
		System.out.printf("%d / %d = %7.2f ",num1,num2,(double)num1/num2);  // ��ü�� 7�ڸ�, �Ҽ��� �ؿ� 2�ڸ� �׷��� �Ҽ��� ���� 5�ڸ�

		String name ="����";
		System.out.printf("���� �̸��� %5s�Դϴ�.%n" , name);
		
		System.out.printf("%d / %d = %7.2f ",num1,num2,(double)num1/num2);  // ��ü�� 7�ڸ�, �Ҽ��� �ؿ� 2�ڸ� �׷��� �Ҽ��� ���� 5�ڸ�
		
		
		/*
		printf���� ����
		int : %d   
		double, float : %f
		char : %c
		String : %s
		�ٳѾ�� : %n
		*/
		
	}
}
