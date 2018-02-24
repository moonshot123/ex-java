package ex_java;
import java.util.Scanner;

public class Ex04_07_2차원입력 {

	public static void main(String[] args) {
		
		int arr[][] = new int [3][2];
		Scanner sc =new Scanner(System.in);
		/*
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(i+"행, " + j+"열 값을 입력하세요:");
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
				System.out.print("숫자를 입력하세요:");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		
		
		int sum=0;
		for(i=0; i<3;i++){
			for(j=0; j<2;j++){
				
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
				//안에서 계산해서 sum만 뺴주는 방식으로해야됨 배열이라서 밖에서 계산하려고 하면 무조건 걸림
			}
			System.out.println(sum);
			sum=0;
			System.out.println();
		}
		
		
		
		
		
	}

}
