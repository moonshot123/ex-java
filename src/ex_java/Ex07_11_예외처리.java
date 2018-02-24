package ex_java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_11_예외처리 {

	public static void main(String[] args) {
		
		int answer= (int)(Math.random()*100)+1;// 마우스 위에 올려보면 알수 있는데 double형의 랜덤값을 만들어내는데 int로 강제 형변환을 해서 소수점 날려버림ㄴ
		//0<= <1 사이의 값을 랜덤으로 만들어줌 1~100까지고 만들기 위해 100곱하고 +1더해줌
		
		//30~87 : (int)(Math.random()*58)+30
		
		int input= 0;
		int count= 0;
		
		do{
			count++;
			System.out.println("1과 100사이값을 넣으세요");
			
			try{
				input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e){
				System.out.println("유효하지 않은 값입니다.");
				continue; // for에서 continue를 만나면 증감식위치로으로 이동   while()은 continue를 만나면 조건식으로 이동 
			}
			
			
			if(answer > input){
				System.out.println("더 큰수를 입력하세요");
			}else if(answer > input){
				System.out.println("더 작은수를 입력하세요");
			}else{
				System.out.println("정답입니다.");
				System.out.println("시도횟수는 "+count+"번 입니다.");
				break;//완전히빠져나감
			}
			
		}while(true);
		
	}

}
