package ex_java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_11_����ó�� {

	public static void main(String[] args) {
		
		int answer= (int)(Math.random()*100)+1;// ���콺 ���� �÷����� �˼� �ִµ� double���� �������� �����µ� int�� ���� ����ȯ�� �ؼ� �Ҽ��� ����������
		//0<= <1 ������ ���� �������� ������� 1~100������ ����� ���� 100���ϰ� +1������
		
		//30~87 : (int)(Math.random()*58)+30
		
		int input= 0;
		int count= 0;
		
		do{
			count++;
			System.out.println("1�� 100���̰��� ��������");
			
			try{
				input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e){
				System.out.println("��ȿ���� ���� ���Դϴ�.");
				continue; // for���� continue�� ������ ��������ġ������ �̵�   while()�� continue�� ������ ���ǽ����� �̵� 
			}
			
			
			if(answer > input){
				System.out.println("�� ū���� �Է��ϼ���");
			}else if(answer > input){
				System.out.println("�� �������� �Է��ϼ���");
			}else{
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");
				break;//��������������
			}
			
		}while(true);
		
	}

}
