package ex_java;
import java.util.Scanner;

public class Ex03_11_while {

	public static void main(String[] args) {
		int i =1,num=-1;
		int sum =0;

		while(true){//while ������ true�� �شٸ� �߰��� ���� ������ �ְ� if���� break�� ����ؼ� ������ �ɾ��ش�.
			System.out.println(i);
			if(i == 5){break;}
			i++;
		} 
		System.out.println();



		Scanner sc =new Scanner(System.in);

		while(num!=0){//�׳� ������ �ɾ��ָ� �� �ƴϸ� ���� ó�� �ϴ°͵� �ʿ��� �ΰ��� �����ϸ��
			System.out.print("���Է�:"); 
			num = sc.nextInt();
			if(num == 0){
				break;
			}
			sum += num;
		}
		System.out.println("sum:"+sum);
	}

}
