package ex_java;
import java.util.Calendar;

public class Ex08_11_Calendar {

	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();//Calendar��ü����� ���ؾȰ�????? 
		String[] week={"", "��","ȭ","��","��","��","��","��"};//0������ �ʿ���� ������ �ȳ���
		
		System.out.println("������ ��¥�� "+ cal.get(Calendar.YEAR)+"��");//YEAR�� ����ƽ�̹Ƿ� Calendar(Ŭ����)�̸����� ����
		System.out.println( cal.get(Calendar.MONTH)+1+"��");//0���� �����ϱ⶧����, ���� �׷��ٰ���
		System.out.println( cal.get(Calendar.DATE)+"��");
		
		System.out.println( cal.get(Calendar.DAY_OF_WEEK)+"����");//DAY_OF_WEEK �� �Ͽ���:1, ������:2, ȭ����:3, ������:4 ....    
		System.out.println( week[cal.get(Calendar.DAY_OF_WEEK)]+"����");//�迭�� �־ 
		
		//���ֻ���
		int hour =cal.get(Calendar.HOUR);
		int min =cal.get(Calendar.MINUTE);
		int sec =cal.get(Calendar.SECOND);
		
		int ampm = cal.get(Calendar.AM_PM);//AM_PM �����̳� ���ĳ�? ��? ��Ʈ������ �޳�? ����:0, ����:1 
		
		if(ampm == Calendar.AM){//0 == Calendar.AM�̴�. 0���ᵵ ������ �򰥸�������  
			System.out.println("����ð��� AM:");
		}else{
			System.out.println("����ð��� PM:");
		}		
		System.out.println(hour+"��"+ min+"��"+sec+"��");
	}

}
