package ex_java;

public class Ex03_10_������ {

	public static void main(String[] args) {
		int sum=0;
		
		/*
		 * ����1
		 * for���� �Ѱ���
		1~10=
		1~20=
		...
		1~100=
		 */

		sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;

			if(i%10 == 0){				
				System.out.println("1~"+i+":"+sum);
			}
		}
		
		System.out.println();
		
		
		
		/*
		 * ����2
		 * for���� �Ѱ���
		1~10=
		11~20=
		21~30=
		..
		91~100=
		 */

		sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;

			if(i%10 == 0){				
				System.out.println((i-9)+"~"+i+":"+sum);
				sum=0;
			}

		}
		
	}
		
}
