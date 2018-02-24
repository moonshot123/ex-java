package ex_java;
import java.util.Scanner;

public class Ex03_11_while {

	public static void main(String[] args) {
		int i =1,num=-1;
		int sum =0;

		while(true){//while 조건을 true로 준다면 중간에 빠져 나갈수 있게 if문에 break를 사용해서 조건을 걸어준다.
			System.out.println(i);
			if(i == 5){break;}
			i++;
		} 
		System.out.println();



		Scanner sc =new Scanner(System.in);

		while(num!=0){//그냥 조건을 걸어주면 됨 아니면 위에 처럼 하는것도 필요함 두가지 선택하면됨
			System.out.print("수입력:"); 
			num = sc.nextInt();
			if(num == 0){
				break;
			}
			sum += num;
		}
		System.out.println("sum:"+sum);
	}

}
