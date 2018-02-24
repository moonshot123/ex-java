package ex_java;
import java.util.Scanner;

/*
����1: 43
����2: 23
����3: 10
����4: 2
����5: 9
����6: 32
���� �߻���Ų �ζ� ��ȣ
28 16 4 10 30 37 

���� ������ �ζ� ��ȣ
43 23 10 2 9 32 

���� ���� : 1
��!!
*/

public class Ex08_09_������ {
	
	public static void main(String[] args) {
		int[] lotto =new int[6];
		int[] my =new int[6];
		Scanner sc =new Scanner(System.in);
		int count = 0;

		for(int i=0; i<my.length;i++){
			System.out.print("����"+(i+1)+":");
			my[i]=sc.nextInt();
			
			if(my[i]<1 || my[i]>45){
				System.out.println("�ٽ��Է��ϼ���. ������ �Ѿ���ϴ�.");
				i--;
			}
		}
		
		lotto=makeLotto();
		
		for(int i=0; i<lotto.length;i++){
			
			for(int j=0; j<lotto.length;j++){
				
				if(lotto[i]==my[j]){
					count++;
				}
			}
		}
		
		
		System.out.println("���� �߻���Ų �ζ� ��ȣ");
		for(int i=0; i<lotto.length;i++){
			
			System.out.print(lotto[i]+ " " );
		}
		System.out.println();

		
		System.out.println("���� ������ �ζ� ��ȣ");
		for(int i=0; i<lotto.length;i++){
			
			System.out.print(my[i]+ " " );
		}
		System.out.println();
		
		System.out.println("��������"+count);
		
		
		
		if(count<3){
			
			System.out.println("���Դϴ�. 0��");	
		}else if(count==4){
			System.out.println("3���Դϴ�. 5000��");	
		
		}else if(count==5){
			System.out.println("2���Դϴ�. 5000õ����");
			
		}else if(count==6){
			System.out.println("1���Դϴ�. 100��");
		}
		
		
	}
	
	
	
	
	// ��÷��ȣ �����
	public static int[] makeLotto(){
		int[] lotto =new int[6];
		
		for(int i=0;i<6;i++){
			lotto[i]=(int)(Math.random()*45)+1;//1~45
			
			for(int j=0;j<i;j++){
				if(lotto[i]==lotto[j]){
					lotto[i]=(int)(Math.random()*45)+1;
					j=-1; // �̰� �ſ� �߿�
				}
			}
		}
		return lotto;
	}
	
}
