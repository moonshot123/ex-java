package ex_java;

public class Ex03_10_조정우 {

	public static void main(String[] args) {
		int sum=0;
		
		/*
		 * 문제1
		 * for문은 한개만
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
		 * 문제2
		 * for문은 한개만
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
