package ex_java;
import java.util.Scanner;

class Calculator{
	/*
	���� ��ȯ sum

	ū���� ��ȯ max

	���� ���� ��ȯ min*/
	
	int sum(int a, int b){
		//des[2]=100; des�� �����迭�̹Ƿ� sub������ ��밡�� ��
		return a+b;
		
	}
	
	
	int max(int a, int b){ //�������� ���������� ����.= �־���ߵ�
		if(a<=b){
			return b;
		}
		return a;
	}
	
	
	int min(int a, int b){
		if(a<b){
			return a;
		}
		return b;
	}
	
	void sub(int des[]){
		int i;
		for(i=0; i<des.length;i++){
			System.out.println(des[i]+" ");
			
		}
		des[1]=100;
	}
	
	

}


public class Ex05_05_�޼ҵ�_������ {

	public static void main(String[] args) {
		//�ڹٰ���ӽſ��� main�޼ҵ� ��ŭ�� �ڵ����� ȣ������, 
		//���� �޼ҵ忡 static�� �ֱ� ������ �ڹٰ���ӽſ��� ��ü�� ������ �ʾƵ� �ٷ� ������ �� �ִ�.     


		
		Scanner sc=new Scanner(System.in);
		int x,y;

		Calculator cal =new Calculator();

		System.out.print("ù��°���� �Է��ϼ���:");
		x=sc.nextInt();
		System.out.print("�ι�°���� �Է��ϼ���:");
		y=sc.nextInt();

		System.out.println("�μ��� ��:"+cal.sum(x,y));
		System.out.println("ū��:"+cal.max(x,y));
		System.out.println("������:"+cal.min(x,y));

		/*		
		�μ��� ���� ����  30
		ū���� ���� 20
		���� ���� ����
		 */	
		
		int arr [] ={10,20,30};
		cal.sub(arr); //�迭�� �ѱ�ٴ°� �迭�� �ּҰ� (������)�� �ѱ�� ��...
		System.out.println(arr[1]);
		//des[2]=100; �����迭�̱⶧���� ���� �޼ҵ忡���� ����� �ȵ� ���� sub������ ��� ����
		
	}
}
