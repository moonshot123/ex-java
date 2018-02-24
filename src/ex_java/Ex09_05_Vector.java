package ex_java;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex09_05_Vector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();//Vector�� ���c�� ���� Ŭ������� ��
		v.addElement(new String ("��"));
		v.addElement(new String ("����"));
		v.addElement(new String ("��"));
		v.addElement(new String ("�ܿ�"));
		
		System.out.println(v);
		
		Enumeration<String> en = v.elements();//elements�� ���
		//Enumeration �� �̿��� ������ ��� >> ���ŵ� �����͸� �����Ҽ� �ִ� �������̽�
		//Enumeration �����i �������̽��̴�. ���콺 �÷����鳪��
		
		// �÷��� �˻����3����
		
		//hasMoreElements ~ nextElement
		while(en.hasMoreElements()){//hasMoreElements �� �����ϴ� ��Ұ� �ֳ�?(���� 4���� ����) boolean��
			String temp = en.nextElement();//nextElement() ��Ҹ� �Ѱ� �������¸޼ҵ�
			System.out.println(temp);
		}
		System.out.println();
		
		//2.Iterator�� �̿��� ������ ���
		for(Iterator<String>i = v.iterator(); i.hasNext();){//for(�ʱⰪ;����;������(���⼭�� ����))���ο��� ������ ������ �������� for���� ���� �ʾƵ� ��
			String tmp =i.next();
			System.out.println(tmp);
		}
		System.out.println();
		
		//3.Ȯ��for���� �̿��� ������ ���
		for(String tmp: v){
			System.out.println(tmp);
		}
		
		
		int [] num = {10,20,30};
		int i;
		for(i=0; i<num.length; i++){
			
		}
		
		for(int e: num){//�迭�� ó������ ������ >>�迭�� �÷��ǿ��� ���̻���>> ��Ҹ� ������ �ö� ���� ����
			System.out.println(e); 
		}
		
	}

}
