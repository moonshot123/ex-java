package ex_java;
import java.util.Scanner;

public class EX03_02_if_else {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է�:");
		num = sc.nextInt();
		
		System.out.println("num:" + num);
		
		if(num<=10 && num>=1){
			System.out.println("1~10������ ��");
		
		}else if(num>=11 && num<=20){
			System.out.println("11~20������ ��");
			
		}else{
			System.out.println("20�̻� ��");
			
		}
		
		
		if(num%10 == 0){
			System.out.println("10����Դϴ�.");
			
		}else if(num%5 ==0){ //else�� ������� ���� ���ǿ��� �ɸ��� �ڿ��� �ȳ��� 5�� ��������� �ȳ��� 
			System.out.println("5����Դϴ�.");			
		}
		
		
		if(num%10 == 0){
			System.out.println("10����Դϴ�.");
			
		}if(num%5 ==0){ //if�Ѱ��� ���� Ȯ�� �� (��� ���� Ȯ��) 
			System.out.println("5����Դϴ�.");			
		}
		
		
			System.out.println("�ڹ� �����ϴ� ��");
			
	}

}
