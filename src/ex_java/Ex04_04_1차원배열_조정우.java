package ex_java;
import java.util.Scanner;

public class Ex04_04_1�����迭_������ {

	public static void main(String[] args) {
		String sub[] = {"����", "����", "����"};
		int jumsu[] = new int[3]; 
		
		int max=0;
		int min=0;
		int sum =0;
		double avg =0.0;
		
		Scanner sc =new Scanner(System.in);
		
		for(int i =0; i<sub.length;i++){
			System.out.print(sub[i]+":");
			jumsu[i]=sc.nextInt();
			sum+=jumsu[i];
		}
		
		for(int i =0; i<sub.length;i++){
			System.out.print(sub[i]+":"+jumsu[i]);
			System.out.println();
		}
		
		
		/*�ִ��ּҰ��� ���̳־ ����°͵� ������ ����
		 * for(){
		 * 	if(){
		 * 	}
		 * 	
		 * 	if(){
		 * 	}
		 * }		
		*/
		max=jumsu[0];
		for(int i =1; i<jumsu.length;i++){
			if(max<jumsu[i]){
				max=jumsu[i];
			}
		}
		
		min=jumsu[0];
		for(int i =1; i<jumsu.length;i++){
			if(min>jumsu[i]){
				min=jumsu[i];
			}
		}
		
		
		System.out.println("�հ�:"+sum);
		System.out.printf("���:%.1f\n",(double)sum/sub.length);
		System.out.println("���������:"+max);
		System.out.println("���峷����:"+min);
		
	}

}
