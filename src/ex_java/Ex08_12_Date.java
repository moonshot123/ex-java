package ex_java;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_12_Date {

	public static void main(String[] args) {
		//date public 이기떄문에 일반적인생성방법가능
		
		Date d =new Date();
		System.out.println(d.toString());
		System.out.println(d.getYear());//1900dl 이 기준이라서 1900 더해야됨
		System.out.println(d.getMonth()+1);//줄이 생기는 건 요즘 안쓴다는 뜻임..그래도 한국에서 많이 사용된다고함
		
		
		// 이건 알아두자 
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");//월은 대문자 M
		sdf2 = new SimpleDateFormat("yy-MM-E요일");
		sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a"); //분은 소문자m
		sdf4 = new SimpleDateFormat("yyyy년MM월dd일 hh:mm:ss a");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		
	}

}
