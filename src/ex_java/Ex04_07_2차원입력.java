package ex_java;
import java.util.Scanner;

public class Ex04_07_2�����Է� {

	public static void main(String[] args) {
		
		int arr[][] = new int [3][2];
		Scanner sc =new Scanner(System.in);
		/*
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(i+"��, " + j+"�� ���� �Է��ϼ���:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		
		
		int i,j;
		for(j=0; j<arr[0].length;j++){
			for(i=0; i<3;i++){
				System.out.print("���ڸ� �Է��ϼ���:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		
		
		int sum=0;
		for(i=0; i<3;i++){
			for(j=0; j<2;j++){
				
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
				//�ȿ��� ����ؼ� sum�� ���ִ� ��������ؾߵ� �迭�̶� �ۿ��� ����Ϸ��� �ϸ� ������ �ɸ�
			}
			System.out.println(sum);
			sum=0;
			System.out.println();
		}
		
		
		
		
		
	}

}
