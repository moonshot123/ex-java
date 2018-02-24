package ex_java;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08_12_Date {

	public static void main(String[] args) {
		//date public �̱⋚���� �Ϲ����λ����������
		
		Date d =new Date();
		System.out.println(d.toString());
		System.out.println(d.getYear());//1900dl �� �����̶� 1900 ���ؾߵ�
		System.out.println(d.getMonth()+1);//���� ����� �� ���� �Ⱦ��ٴ� ����..�׷��� �ѱ����� ���� ���ȴٰ���
		
		
		// �̰� �˾Ƶ��� 
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");//���� �빮�� M
		sdf2 = new SimpleDateFormat("yy-MM-E����");
		sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a"); //���� �ҹ���m
		sdf4 = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss a");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		
	}

}
