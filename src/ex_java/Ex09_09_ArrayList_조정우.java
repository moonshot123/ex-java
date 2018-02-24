package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;
	public Card(){}
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String gettel(){
		return tel;
	}
	public String getName() {
		return name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString(){
		return name +"     " + tel;
	}
}


public class Ex09_09_ArrayList_������ {

	public static void main(String[] args) throws IOException {
		int input=0;
		String input_name="";
		String input_tel="";

		Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 

		ArrayList<Card> list =new ArrayList<Card>();

		Card c =new Card();

		do{
			boolean flag = true;
			System.out.print("1.�����߰� 2.���Ի��� 3.���Լ��� 4.���Ժ��� 5.����:");
			input = sc.nextInt();
			switch (input) {
			case 1:// �����߰�

				System.out.print("�̸��� �Է��ϼ���.:");
				input_name = br.readLine();
				System.out.print("��ȣ�� �Է��ϼ���:");
				input_tel = sc.next();
				list.add(new Card(input_name,input_tel));
				break;


			case 2://���Ի���

				System.out.print("�̸��� �Է��ϼ���.:");
				input_name = br.readLine();

				for(int i =0; i<list.size();i++){

					if(list.get(i).getName().equals(input_name)){
						list.remove(i);//i�Ӹ� �ƴ϶� ��ü �̸��� ������ ����� ����
						System.out.println("�����Ǿ����ϴ�");
						flag=false;
						break;
					}
				}

				if(flag ==true){
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
				}

				break;

			case 3://���Լ���

				System.out.print("�̸��� �Է��ϼ���.:");
				input_name = br.readLine();

				for(int i =0; i<list.size();i++){

					if(list.get(i).getName().equals(input_name)){

						System.out.print("�����Ͻ� ��ȣ�� �Է��ϼ���:");
						input_tel = sc.next();
						
						list.set(i,new Card(input_name,input_tel));
						System.out.println("�����Ǿ����ϴ�");
						flag=false;
						
						/*���͵� �Ẹ�� 
						list.get(i).setTel(input_tel);
						System.out.println("�����Ǿ����ϴ�");
						flag=false;
						*/
					}
				}
				if(flag ==true){
					System.out.println("�̸��� �߸��Է��ϼ̽��ϴ�.");
				}

				break;

			case 4://���Ժ���
				
				System.out.println("�̸�	��ȭ��ȣ");
				for(Card e :list){
					System.out.println(e);
				}
				/*
				 * ����������� ������
				for(int i=0;i<list.size();i++){
					Card x= list.get(i);
					System.out.println(x);
					//System.out.println(c.getName()+"\t"+c.gettel());
				}*/
				
				break;

			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է��ϼ���");
				break;
			}
			
			System.out.println();
		}while(true);

	}

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
