package ex_java;
//����Ŭ������ langŬ������ �����Ƿ� ���� import�� ���� �ʾƵ� �ȴ�. 
public class Ex08_06_Wrapper {

	public static void main(String[] args) {
		//Integer it1=new Integer(11);
		Integer it1 =11;//autoboxing(�ڵ����� wrapper Ŭ������ ��ȯ)
		Integer it2 =12;
		System.out.println(it1+it2);
		
		//Integer data=new Integer(21);
		//int it3 = data.intValue();
		Integer it3 =new Integer(21);
		Integer it4 =new Integer(22);
		//unboxing(�ڵ����� wrapper �ڷ����� �⺻ �ڷ������� ��ȯ)
		System.out.println(it3+it4);
		
		
		// �̰� �� ���� ����? INT������ ��κ� ����(double, float...)�� ������ 
		//���ڿ� >> �⺻������ ��ȯ
		int i =Integer.parseInt("100");//���ڿ�100�� ����(int��)100���� �ٲ��� 
		int j =Integer.parseInt("200");//int�� ���������� Integer�� ���� ����ڽ��� �ϱ⶧���� ������ ������ �ظ��ϸ� ���缭�ϴ°� ������  
		System.out.println(i+j);
		
		Integer ii =Integer.valueOf("300");
		Integer jj =Integer.valueOf("400");//Integer�� ���������� int�� �ٲپ �� �׷��� �ظ��ϸ� ���缭�ϴ°� ����
		System.out.println(ii+jj);
		
		
		//�⺻���� ���ڿ��� ��ȯ 
		String s1 = String.valueOf(1000);//static�޼ҵ��̹Ƿ� Ŭ�����̸�(String)���� ȣ�� 
		String s2 = String.valueOf(2000);
		System.out.println(s1+s2);
		
	}
}
