package ex_java;
import java.util.Scanner;

/*
숫자1: 43
숫자2: 23
숫자3: 10
숫자4: 2
숫자5: 9
숫자6: 32
컴이 발생시킨 로또 번호
28 16 4 10 30 37 

내가 선택한 로또 번호
43 23 10 2 9 32 

맞은 갯수 : 1
꽝!!
*/

public class Ex08_09_조정우 {
	
	public static void main(String[] args) {
		int[] lotto =new int[6];
		int[] my =new int[6];
		Scanner sc =new Scanner(System.in);
		int count = 0;

		for(int i=0; i<my.length;i++){
			System.out.print("숫자"+(i+1)+":");
			my[i]=sc.nextInt();
			
			if(my[i]<1 || my[i]>45){
				System.out.println("다시입력하세요. 범위를 넘어갔습니다.");
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
		
		
		System.out.println("컴이 발생시킨 로또 번호");
		for(int i=0; i<lotto.length;i++){
			
			System.out.print(lotto[i]+ " " );
		}
		System.out.println();

		
		System.out.println("내가 선택한 로또 번호");
		for(int i=0; i<lotto.length;i++){
			
			System.out.print(my[i]+ " " );
		}
		System.out.println();
		
		System.out.println("맞은개수"+count);
		
		
		
		if(count<3){
			
			System.out.println("꽝입니다. 0원");	
		}else if(count==4){
			System.out.println("3등입니다. 5000원");	
		
		}else if(count==5){
			System.out.println("2등입니다. 5000천만원");
			
		}else if(count==6){
			System.out.println("1등입니다. 100억");
		}
		
		
	}
	
	
	
	
	// 추첨번호 만들기
	public static int[] makeLotto(){
		int[] lotto =new int[6];
		
		for(int i=0;i<6;i++){
			lotto[i]=(int)(Math.random()*45)+1;//1~45
			
			for(int j=0;j<i;j++){
				if(lotto[i]==lotto[j]){
					lotto[i]=(int)(Math.random()*45)+1;
					j=-1; // 이게 매우 중요
				}
			}
		}
		return lotto;
	}
	
}
