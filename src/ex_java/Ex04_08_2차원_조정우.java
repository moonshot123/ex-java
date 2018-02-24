package ex_java;

public class Ex04_08_2차원_조정우 {

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
		//간격은 탭으로 맞추면 금방할수 있음
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
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
		System.out.print("총점");
		
		//이렇게 간단히 해도 되지만 위에 있는 for문이 돌아갈떄 변수를 누적시켜서 만들면 아래 for문을 쓰지 않아도 됨 
		for(int j=0; j<score[0].length;j++){
			for(int i=0; i<score.length; i++){
				Tot+= score[i][j];
			}
			System.out.print("\t"+Tot);
			Tot=0;
		}
	}
}
