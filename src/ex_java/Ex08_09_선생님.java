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

public class Ex08_09_선생님 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		int[] my = new int[6];//int형 이므로 디폴트값 0 이 들어감
		Scanner sc = new Scanner(System.in);
		int count = 0;

		for(int i=0; i<my.length;i++){
			System.out.print("숫자"+(i+1)+":");
			my[i]=sc.nextInt();
			if(my[i]<1 || my[i]>45){
				System.out.println("다시입력하세요. 범위를 넘어갔습니다.");
				i--;
			}
		}
		// 랜덤값이랑 j=-1넣는게 제일 중요함...
		for(int i=0;i<6;i++){
			lotto[i]=(int)(Math.random()*45)+1;//1~45   // 뒤(45)-앞(1)+1 = 랜덤값곱할때 실수하면안됨

			for(int j=0;j<i;j++){
				
				if(lotto[i]==lotto[j]){
					lotto[i]=(int)(Math.random()*45)+1;//1~45   // 뒤(45)-앞(1)+1 = 랜덤값곱할때 실수하면안됨
					j=-1;// 이게 핵심... 이게 끝나고 i++로 이동하기때문에  
				}
			}
		}
		
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
}