package ex_java;
public class Ex04_02_1차원_최대최소 {

	public static void main(String[] args) {
		int sum=0;
		int max = 0;
		int min = 0;
		int[] score ={71,82,98,47,59};
		// 배열은 같은 자료형의 집합이지만 8바이트double형 배열에  4바이트int형 값을 넣어도 배열의 크기가 더 크기 때문에 가능하지만 이렇게는 사용 거의 안함  
		
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		}
		System.out.println();
		

		
		//확장 for문
		for(int e :score){// 왼쪽:검색할 자료형 , 오른쪽:전체 데이터 
			System.out.print(e+" ");
		}
		
		
		for(int i =0; i<score.length;i++){
			sum +=score[i];
		}
		
		System.out.println();
		System.out.println("sum:"+sum);
		System.out.printf("avg:%.2f",(double)sum/score.length); 
		//(double)(sum/score.length) 이건 결과가 71.00 으로 나옴 계산결과가 괄호때문에 괄호안의 계산 결과가 인트형으로 나오면서 괄호안의 값이 인트형으로 변환
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
