package ex_java;
import java.util.Scanner;

public class Ex04_03_1�����Է� {

	public static void main(String[] args) {
		
		int x,y;
		
		Scanner sc =new Scanner(System.in);
		/*
		System.out.print("���ڸ� �Է��ϼ���:");
		x =sc.nextInt();
		
		System.out.print("�ѹ��� ���ڸ� �Է��ϼ���:");
		y =sc.nextInt();
		
		
		System.out.println("1��:"+x +", 2��:"+y);
		*/
		
		int num []= new int[5];
		
		for(int e:num){
			System.out.print("���ڸ� �Է��ϼ���:");
			e=sc.nextInt();
		}
		
		for(int e:num){
			System.out.print("����:"+ e + " ");
		}
		System.out.println();
		
		
		
		/*
		for(int i=0; i<num.length; i++){
			System.out.println();
			System.out.println("����"+(i+1)+":");
			num[i] =sc.nextInt();
		}
		System.out.println();
		
		
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		
		String s = "������";
		String str[] ={"����","�ϴ�","��¡��"};
		
		for(int i =0; i<str.length;i++){
			System.out.println(str[i]);
		}
		*/
		
		
		
	}

}
