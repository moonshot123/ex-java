package ex_java;
public class Ex04_02_1����_�ִ��ּ� {

	public static void main(String[] args) {
		int sum=0;
		int max = 0;
		int min = 0;
		int[] score ={71,82,98,47,59};
		// �迭�� ���� �ڷ����� ���������� 8����Ʈdouble�� �迭��  4����Ʈint�� ���� �־ �迭�� ũ�Ⱑ �� ũ�� ������ ���������� �̷��Դ� ��� ���� ����  
		
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		}
		System.out.println();
		

		
		//Ȯ�� for��
		for(int e :score){// ����:�˻��� �ڷ��� , ������:��ü ������ 
			System.out.print(e+" ");
		}
		
		
		for(int i =0; i<score.length;i++){
			sum +=score[i];
		}
		
		System.out.println();
		System.out.println("sum:"+sum);
		System.out.printf("avg:%.2f",(double)sum/score.length); 
		//(double)(sum/score.length) �̰� ����� 71.00 ���� ���� ������� ��ȣ������ ��ȣ���� ��� ����� ��Ʈ������ �����鼭 ��ȣ���� ���� ��Ʈ������ ��ȯ
		System.out.println();
		
		
		sum=0;
		for(int e:score){
			sum+=e;
		}
		System.out.println("sum:"+sum);
		System.out.println();
		
		max = score[0];
		for(int i=1; i<score.length;i++){
			if(max < score[i]){
				max = score[i];
			}
		}
		System.out.println("max:"+max);
		
		
		min = score[0];
		for(int i=1; i<score.length;i++){
			if(min > score[i]){
				min = score[i];
			}
		}
		System.out.println("min:"+min);
		
		
		
	}
}
