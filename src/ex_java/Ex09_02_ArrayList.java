package ex_java;
//�÷����� �߿��ϴ� ������ �������� ...
import java.util.ArrayList;

public class Ex09_02_ArrayList {

	public static void main(String[] args) {
		
		String s ="����";
		System.out.println(s.toString());//String��toString()�� ���ڿ� ��±������ �������̵�
		
		//Class ArrayList<E> e�� ����ε� ����ڷ����� �����ϴٴ����� �ڽ��� ���� �ڷ����� �� 
		ArrayList <String> list =new ArrayList<String>(); //��� ��������� ����   
		//<String>�� ���ٸ� �Է��� ���������� ���� �����ҋ��� ������Ʈ������ ���ϵǹǷ� ������ ���ܼ� ���� ����ȯ�� ���� �������
		//ArrayList �ȿ��� ��ü�� ������ �ִ�.
		list.add("�¿�");//add�� ������ �Է�   0������ ���۵� 
		list.add("����");//1
		list.add("����");//2
		list.add("�¿�");//3
		
		System.out.println("����"+list.size());//������ ũ�⸦ (����)�� �˷��ִ¸޼ҵ�
		
		
		/***********************************************
		*length: �迭�� ���� ����(�迭)
		*length(): ���ڿ��� ����() (String Ŭ������ ������ ����)   
		*size(): �÷����� ������ ��� ���� (ArrayList�� ������ ����) 
		************************************************/
		
		
		for(int i =0; i<list.size();i++){
			System.out.print(list.get(i)+" ");//�迭�� ����Ʈ�� �߸����� Ʋ���� �ִ�.
		}
		
		System.out.println();
		
		
		
		System.out.println(list.toString());// ���⼭�� �ߵǴ°� list�� �ִ� String�� �ִ� toString ����Ǵ°� �׷��� �̷��� ���ڿ��� ���09_3������ person�̹Ƿ� �̹Ƿ� ������������ �Ǿ������ʾƼ� �׳� ���Ұ��� ����  
		System.out.println(list.get(2));//���ڿ� ����
		String s2 = list.get(0);//���
		System.out.println(s2);
		// ��������� 4ĭ 
		list.add(1, "����ī"); // 1����ġ�� ����ī�� �־�� �Ʒ��� �и�
		System.out.println(list.toString());
		
		list.remove(0); // 0���� ������ �Ʒ��ִ°� �ö��
		System.out.println(list.toString());
		
		int index = list.indexOf("����");
		System.out.println("index:"+index);// ã�� ������ ��ġ�� ����
		
		int index2 = list.indexOf("���");
		System.out.println("index:"+index);// ������ -1�� ����  // �׸��� �������� ��ϰ� �ִٸ� ���� ó���� ��ϸ� ����
		
		
		
		//��ü�ۿ� ���־ �⺻�����δ� ������µ�...
		ArrayList <Integer> list1 =new ArrayList<Integer>(); //��� ��������� ����
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1.toString());//ArrayList�� <���ʸ�>�� �������̵� ����� 
		System.out.println(list1.get(2));//Integer ����
	}

	
	
	//������ �����غ��� �������� �̵��ϴ°� ���� ���� �������� �Ѱ��� ���� ���� ��...() ���İ��, ���������� ������ �ڷΰ���
	//ť�� ������� ���� ���� ���� ���� ���� .... �μ��۾������ ���¼������ �ؾߵǴ��ϵ�, ����
	
}
