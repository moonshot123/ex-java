package ex_java;
import java.io.FileReader;
import java.util.Scanner;

public class Ex07_09_����ó�� {

	public static void main(String[] args) {
		System.out.print("�ΰ��� �����Է�:");
		Scanner input = new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
		
		boolean div = divider(num1, num2);
		
		if(div){
			System.out.println("���꼺��");
			
		}else{
			System.out.println("�������");
			
		}
	}	
		public static boolean divider(int num1, int num2){
			
			try{
				//FileReader fr = new FileReader("a.text"); RuntimeException�̿��� Ŭ������ ������ ����ó���� ����� �Ѵ�. 
				int result = num1/num2;//���ܰ� ����� new ArithmeticException
				System.out.println("������ ����� "+ result);
				return true; 
				
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());// ���ܻ�Ȳ�� �߻��� ����
				System.out.println(e.toString()); //e.toString() �� ������ Ŭ���� �̸����� ���´�. 
				return false;
				
			}finally{
				System.out.println("finally ��������");
			}
			
		}
}
