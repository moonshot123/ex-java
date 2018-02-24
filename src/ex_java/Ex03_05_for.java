package ex_java;
import java.util.Scanner;

public class Ex03_05_for {

	public static void main(String[] args) {
		int i;
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		for(/*1*/i=0;/*2*/i<5;/*4*/i++){
			
			/*3*/System.out.println("apple"+i);
			
		}
		
		System.out.println("for문밖"+i);
		System.out.println("=====================================================");
		
		
		for(i=5;i>0;i--){
			System.out.println("apple"+i);
		}
		System.out.println("for문밖"+i);
		
		
		for(i=0;i<5;i=i+2){ //2씩 증가
			System.out.println("apple"+i);
		}
		System.out.println("for문밖"+i);
		System.out.println("=====================================================");
		
		
		
		
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("sum:"+sum);
		
		
		sum=0;		
		for(int j=1; j<=100; j++){
			sum +=j;
		}
		System.out.println("sum2:"+sum);
		
		
		sum=0;
		for(i=0; i<=10; i++){
			if(0==i%2){
				sum+=i;
			}
		}
		System.out.println("짝수합:"+sum);
		
		
		for(i=1; i<=100;i++){
			if(i%5==0 && i%7==0){
			}else{
				System.out.println("i:"+i);
			}
		}
		System.out.println("=====================================================");
		
		
		for(i=1; i<=100;i++){
			if(!(i%5==0 && i%7==0)){
				System.out.println("i:"+i);
			}
		}
		System.out.println("=====================================================");
		
		
		for(i=1;i<=9;i++){			
			System.out.println(3+"*"+i+"="+3*i);
		}
		
		for(i=9;i>=1;i--){			
			System.out.println(3+"*"+i+"="+3*i);
		}
		
		
		System.out.print("숫자를 입력하세요:");
		num = sc.nextInt();
		
		for(i=1;i<=9;i++){			
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		
		
		
		
		
	}
}
