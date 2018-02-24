package ex_java;
import java.util.Scanner;

class Account2{
	private int account_num;//���¹�ȣ
	private String account_name;//������
	private int account_money;//���ݾ�
	
	public Account2(){}
	
	public Account2(int account_num, String account_name, int account_money) {
		this.account_num = account_num;
		this.account_name = account_name;
		this.account_money = account_money;
	}

	public int getAccount_num() {
		return account_num;
	}

	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public int getAccount_money() {
		return account_money;
	}

	public void setAccount_money(int account_money) {
		this.account_money = account_money;
	}

	@Override
	public String toString() {
		return "���¹�ȣ:" + account_num + ", ������:" + account_name + ", ���ݾ�:"+ account_money;
	}
	
}//Account




public class Ex05_19_���̸� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Account2[] a = new Account2[1000];
		int i=0;
		int num=0;
		int input=0;
		do{
				System.out.println("----------------------------------------");
				System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
				System.out.println("----------------------------------------");
				System.out.print("��ȣ����:");
				num=sc.nextInt();

				switch (num) {
				
				case 1:
					if(i<a.length){
						System.out.println("<< ���� >>");	
						System.out.print("���¹�ȣ:");
						int account_num = sc.nextInt();
						System.out.print("������:");
						String account_name=sc.next();	
						System.out.print("���ݾ�:");
						int account_money=sc.nextInt();
					
						a[i]=new Account2(account_num,account_name,account_money);
						System.out.println("���°� �����Ǿ����ϴ�.");
						System.out.println();
						i++;
					break;
					
					}else{
						System.out.println("������ �Ѿ���");
						System.exit(0);
					}
					
				case 2:
					System.out.println("<< ���¸�� >>");
					for(int j=0;j<i;j++){ 
						if(a[j]!=null){
							System.out.println(a[j].toString());
						}
					}
					break;
					
				case 3:
					System.out.println("<< ���� >>");
					
					System.out.print("���¹�ȣ:");
					input =sc.nextInt();
					
					for(int j=0;j<i;j++){ 
						if(input == a[j].getAccount_num()){
							System.out.print("���ݾ�:");
							int money =sc.nextInt();
							a[j].setAccount_money((a[j].getAccount_money()) + money);
							System.out.println("���: �Ա��� �Ϸ�Ǿ����ϴ�.");
							break;
							
						}else if(!(input == a[j].getAccount_num())){
							
							System.out.println("���: ���°� �����ϴ�.");
						}
					}
					
					break;
					
				case 4:
					System.out.println("<< ��� >>");
					
					System.out.print("���¹�ȣ:");
					input =sc.nextInt();
					
					for(int j=0;j<i;j++){ 
						if(input == a[j].getAccount_num()){
							System.out.print("���ݾ�:");
							int money =sc.nextInt();
							a[j].setAccount_money(a[j].getAccount_money() - money);
							System.out.println("���: ����� �Ϸ�Ǿ����ϴ�.");
							break;
						}else{
							System.out.println("���: ���°� �����ϴ�.");
						}
					}
				
					break;
					
				case 5:
					
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					
				default:
					System.out.println("�߸��Է��߽��ϴ�.");
					System.out.println();
				}
			
		}while(i<a.length);
	}
}
