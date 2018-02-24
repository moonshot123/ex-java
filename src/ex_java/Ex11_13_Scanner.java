package ex_java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_13_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("data.txt")).useDelimiter(",");         //new File("data.txt") //"data.txt"파일을 읽겠다.
		int sum= 0, cnt=0, num;
		
		while(sc.hasNextInt()){//hasNextInt() 가지고 올 정수가 있냐? 현재 4개나 있음
			num= sc.nextInt();
			System.out.print(num+" ");
			sum += num;
			cnt++;// 텍스트 파일에서 가저오는 숫자개수를 저장하기위해서
		}
		
		System.out.println("\nsum="+sum);
		System.out.println("average="+(double)sum/cnt);
		sc.close();
	}

}
