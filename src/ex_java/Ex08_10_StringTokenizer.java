package ex_java;
import java.util.StringTokenizer;

public class Ex08_10_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer은 특정한 문자열로 쪼개는 것
		StringTokenizer str = new StringTokenizer("2017/03/16,12:45",",/:"); // ,/:(구분자)를 기준으로 2017/03/16,12:45문자열을 나눈다.   ,/ : >> 이런식으로 빈칸도 구분자로 사용할수 있다.
		//StringTokenizer str = new StringTokenizer("201 7/0 3/16,12:45"); 뒤에 구분자를 지정하지 않는다면 빈칸을 기본 구분자로 생각함 
		int count;
		count= str.countTokens();
		System.out.println("파싱할 문자열의 수는 총"+count+"개");
		
		while(str.hasMoreTokens()){//hasMoreTokens() 더 나눌것이 있는지 boolean형으로 리턴
			//아직 파싱할 토큰이 더 있는 지 여부를 확인
			String s = str.nextToken();//nextToken()을 이용하여 쪼개기 
			System.out.println(s);//파싱해서 구한 다음 다음 토큰을 반환
		}
		System.out.println();
		
		
		
		
		
		String str1 = "2017/03/16,12:45";
		String[] sp =str1.split("/");// 구분자를 기분으로 나누어서 배열에 넣는다.
		//String클래스 안에split메소드가 있음 일반적으로 구분자가 1개일떄 사용됨 여러개이면 위에있는 스프링토큰을 쓰자
		for(int i=0; i<sp.length;i++){
			System.out.println(sp[i].toString());
		}
		
		System.out.println();
		
		
		
		//문자열을 특정한 구분자로 나누는것 자바util패키지에 들어가있음
		int sum = 0;
		StringTokenizer str2 = new StringTokenizer("2+3+19+31","+");
		while(str2.hasMoreTokens()){
			int i =Integer.parseInt(str2.nextToken());
			sum+=i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}
}