package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Card2{
	private String name;
	private String tel;
	public Card2(){}
	public Card2(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}

	public String toString(){
		return name +"       " + tel;
	}
}


public class Ex09_09_�޼ҵ�θ����  {

	int input=0;
	String input_name="";
	String input_tel="";
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 
	ArrayList<Card2> list =new ArrayList<Card2>();
	

	public static void main(String[] args) throws IOException {
		Ex09_09_�޼ҵ�θ���� st = new Ex09_09_�޼ҵ�θ����();

		do{

			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");
			st.input = st.sc.nextInt();
			switch (st.input) {
				case 1:st.addNameCard();
					break;
				case 2:st.removeNameCard();
					break;
				case 3:st.reNameCard();
					break;
				case 4:st.allView();
					break;
				case 5:System.exit(0);
					break;
				default:System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է��ϼ���");
			}//switch

			System.out.println();
		}while(true);

	}//main


	
	//�����߰�
	public void addNameCard() throws IOException {
		System.out.print("�̸��� �Է��ϼ���.:");
		input_name = br.readLine();
		System.out.print("��ȣ�� �Է��ϼ���:");
		input_tel = sc.next();
		list.add(new Card2(input_name,input_tel));
	}//addNameCard

	

	//���Ի���
	public void removeNameCard() throws IOException{
		boolean flag = true;
		System.out.print("�̸��� �Է��ϼ���.:");
		input_name = br.readLine();

		for(int i =0; i<list.size();i++){

			if(list.get(i).getName().equals(input_name)){
				list.remove(i);
				System.out.println("�����Ǿ����ϴ�");
				flag=false;
			}
		}

		if(flag ==true){
			System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
		}
	}//removeNameCard


	
	//���Լ���
	public void reNameCard() throws IOException{
		boolean flag = true;
		System.out.print("�̸��� �Է��ϼ���.:");
		input_name = br.readLine();

		for(int i =0; i<list.size();i++){

			if(list.get(i).getName().equals(input_name)){

				System.out.print("�����Ͻ� ��ȣ�� �Է��ϼ���:");
				input_tel = sc.next();

				list.set(i,new Card2(input_name,input_tel));
				System.out.println("�����Ǿ����ϴ�");
				flag=false;
			}
		}
		if(flag ==true){
			System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
		}
	}//reNameCard()

	
	
	//���Ժ���
	public void allView(){

		System.out.println("�̸�	��ȭ��ȣ");
		for(Card2 e :list){
			System.out.println(e);
		}
	}//allView()



}


/* ���۵帮�������
String name;
System.out.print("�̸�:");
//name =sc.next();			// ���������� �ȳ���
//System.out.println(name);

name = br.readLine(); // ����ó�������� �ؾߵ� throws Ȥ�� ����ó�� �ؾߵ�, �ΰ��� ����� ���غ���....
//�ϴ� ���͸� ġ�������� ���������ؼ� ���� 
System.out.println(name);
 */



/*
1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
�̸��� �Է��ϼ��� : ȫ �浿
��ȭ��ȣ�� �Է��ϼ��� : 111

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:1
�̸��� �Է��ϼ��� : �� ����
��ȭ��ȣ�� �Է��ϼ��� : 222

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
�̸�		��ȭ��ȣ
ȫ �浿		111
�� ����		222

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
�̸��� �Է��ϼ��� : ������
�̸��� �߸��Է��ϼ̽��ϴ�.

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:3
�̸��� �Է��ϼ��� : �� ����
�����Ͻ� ��ȭ��ȣ�� : 333
�����Ǿ����ϴ�. 

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
�̸�		��ȭ��ȣ
ȫ �浿		111
�� ����		333

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
�̸��� �Է��ϼ��� : ������
�̸��� �߸��Է��ϼ̽��ϴ�.

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:2
�̸��� �Է��ϼ��� : �� ����
�����Ǿ����ϴ�. 

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:4
�̸�		��ȭ��ȣ
ȫ �浿		111

1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:5
���α׷��� �����մϴ�.
 */
