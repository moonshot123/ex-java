package ex_java;
import java.util.Date;

import com.javastudy.Car;// �ٸ� ��Ű���� �޼ҵ带 ���� �ʿ���




public class Ex06_08_import {

	public static void main(String[] args) {

		Car c =new Car("���",2010);
		c.prn();
		String str ="������";
		System.out.println(str);
		
		Date d=new Date(); // ��Ʈ�� + ����Ʈ + O // ���� ��¥�� �������� ��
		System.out.println(d);
		//String�� java.lang�� �ִ� Ŭ������ �ϳ�
		System.out.println(Math.PI);
	}

	
	//final Ŭ����
	//�ڽ�Ŭ������ ����� ����. ����� ������ �ʴ´�. 
	
	//final �޼ҵ�
	//�ڽ��� �θ��� �޼ҵ带 �������̵��Ҽ� ����
	
	
	//final ���� (���� ���� ����)
	//���� �ٲܼ� ����. 
	
	
}
