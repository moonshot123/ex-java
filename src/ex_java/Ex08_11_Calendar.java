package ex_java;
import java.util.Calendar;

public class Ex08_11_Calendar {

	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();//Calendar객체만들기 이해안감????? 
		String[] week={"", "월","화","수","목","금","토","일"};//0번방은 필요없음 어차피 안나옴
		
		System.out.println("오늘의 날짜는 "+ cal.get(Calendar.YEAR)+"년");//YEAR가 스태틱이므로 Calendar(클래스)이름으로 접근
		System.out.println( cal.get(Calendar.MONTH)+1+"월");//0부터 시작하기때문에, 월만 그렇다고함
		System.out.println( cal.get(Calendar.DATE)+"일");
		
		System.out.println( cal.get(Calendar.DAY_OF_WEEK)+"요일");//DAY_OF_WEEK 은 일요일:1, 월요일:2, 화요일:3, 수요일:4 ....    
		System.out.println( week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");//배열에 넣어서 
		
		//자주사용됨
		int hour =cal.get(Calendar.HOUR);
		int min =cal.get(Calendar.MINUTE);
		int sec =cal.get(Calendar.SECOND);
		
		int ampm = cal.get(Calendar.AM_PM);//AM_PM 오전이냐 오후냐? 왜? 인트형으로 받나? 오전:0, 오후:1 
		
		if(ampm == Calendar.AM){//0 == Calendar.AM이다. 0을써도 되지만 헷갈릴수있음  
			System.out.println("현재시간은 AM:");
		}else{
			System.out.println("현재시간은 PM:");
		}		
		System.out.println(hour+"시"+ min+"분"+sec+"초");
	}

}
