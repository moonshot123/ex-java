package ex_java;
import java.util.StringTokenizer;

public class Ex08_10_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer�� Ư���� ���ڿ��� �ɰ��� ��
		StringTokenizer str = new StringTokenizer("2017/03/16,12:45",",/:"); // ,/:(������)�� �������� 2017/03/16,12:45���ڿ��� ������.   ,/ : >> �̷������� ��ĭ�� �����ڷ� ����Ҽ� �ִ�.
		//StringTokenizer str = new StringTokenizer("201 7/0 3/16,12:45"); �ڿ� �����ڸ� �������� �ʴ´ٸ� ��ĭ�� �⺻ �����ڷ� ������ 
		int count;
		count= str.countTokens();
		System.out.println("�Ľ��� ���ڿ��� ���� ��"+count+"��");
		
		while(str.hasMoreTokens()){//hasMoreTokens() �� �������� �ִ��� boolean������ ����
			//���� �Ľ��� ��ū�� �� �ִ� �� ���θ� Ȯ��
			String s = str.nextToken();//nextToken()�� �̿��Ͽ� �ɰ��� 
			System.out.println(s);//�Ľ��ؼ� ���� ���� ���� ��ū�� ��ȯ
		}
		System.out.println();
		
		
		
		
		
		String str1 = "2017/03/16,12:45";
		String[] sp =str1.split("/");// �����ڸ� ������� ����� �迭�� �ִ´�.
		//StringŬ���� �ȿ�split�޼ҵ尡 ���� �Ϲ������� �����ڰ� 1���ϋ� ���� �������̸� �����ִ� ��������ū�� ����
		for(int i=0; i<sp.length;i++){
			System.out.println(sp[i].toString());
		}
		
		System.out.println();
		
		
		
		//���ڿ��� Ư���� �����ڷ� �����°� �ڹ�util��Ű���� ������
		int sum = 0;
		StringTokenizer str2 = new StringTokenizer("2+3+19+31","+");
		while(str2.hasMoreTokens()){
			int i =Integer.parseInt(str2.nextToken());
			sum+=i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}
}