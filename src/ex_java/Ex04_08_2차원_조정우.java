package ex_java;

public class Ex04_08_2����_������ {

	public static void main(String[] args) {
		
		int[][] score ={
							{80, 92, 72},
							{91, 87, 40},
							{43, 76, 98},
							{87, 65, 98},
							{80, 90, 50}
		};
		
		int sum=0, avg =0;
		int korTot=0, engTot, mathTot = 0, Tot=0;
		//������ ������ ���߸� �ݹ��Ҽ� ����
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("============================================");
		
		
		for(int i=0; i<score.length;i++){
			System.out.print(""+(i+1));
			for(int j=0; j<score[i].length;j++){
				System.out.print("\t"+score[i][j]);
				sum+=score[i][j];
			}
			System.out.print("\t"+sum);
			System.out.printf("\t%.2f",(double)sum/score[i].length);
			sum=0;
			System.out.println();
		}
		System.out.println("============================================");
		System.out.print("����");
		
		//�̷��� ������ �ص� ������ ���� �ִ� for���� ���ư��� ������ �������Ѽ� ����� �Ʒ� for���� ���� �ʾƵ� �� 
		for(int j=0; j<score[0].length;j++){
			for(int i=0; i<score.length; i++){
				Tot+= score[i][j];
			}
			System.out.print("\t"+Tot);
			Tot=0;
		}
	}
}
