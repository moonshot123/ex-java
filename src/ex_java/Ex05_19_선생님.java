package ex_java;
import java.util.Scanner;

class Account{
	private int Accountno;// ���¹�ȣ
	private String owner; // ������
	private int balance; // �ܰ�

	public Account(int Account2no, String owner, int balance) {
		super();
		this.Accountno = Accountno;
		this.owner = owner;
		this.balance = balance;
	}

	public int getAccountno() {
		return Accountno;
	}

	public void setAccountno(int Accountno) {
		this.Accountno = Accountno;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class Ex05_19_������ {
	private static Account[] arr = new Account[2];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean retry = true;	
		
		while(retry) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------------------------------------");
			System.out.print("����> ");

			int selectNo = sc.nextInt();

			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				AccountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				retry = false;
			}
		}
		System.out.println("���α׷� ����");
		//main�޼ҵ尡 ������ ������ ���α׷��� ����
	}

	//���»����ϱ�
	private static void createAccount() {
		System.out.println();
		boolean flag = false;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==null){
				flag = true;
				break;
			}
		}
		if(flag == false){
			System.out.println("�� �̻� ���� ���� �Ұ��մϴ�.");
			return;
		}
		
		System.out.println("<< ���»��� >>");

		System.out.print("���¹�ȣ: "); 
		int Accountno = sc.nextInt();

		System.out.print("������: "); 
		String owner = sc.next();

		System.out.print("�ʱ��Աݾ�: ");
		int balance = sc.nextInt();

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Account(Accountno, owner, balance);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	//���¸�Ϻ���
	private static void AccountList() {
		System.out.println();
		System.out.println("<< ���¸�� >>");
		System.out.println("���¹�ȣ\t������\t���ݾ�");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) { 
				System.out.print(arr[i].getAccountno()+"\t");
				System.out.print(arr[i].getOwner()+"\t");
				System.out.print(arr[i].getBalance());
				System.out.println();
			}
		}
	}

	//�����ϱ�
	private static void deposit() {
		int i;
		System.out.println();
		System.out.println("<< ���� >> ");
		System.out.print("���¹�ȣ: "); 
		
		
		int Accountno = sc.nextInt();
		System.out.print("���ݾ�: ");
		int money = sc.nextInt();

		boolean flag = findAccount(Accountno);

		if(flag == false) {
			System.out.println("���: ���°� �����ϴ�.");
			return;// �̷��� �߽�� �ڵ尡 ����ϰ� ���� ����� ����
		}
		
		for(i=0;i<arr.length;i++){
			if(arr[i].getAccountno()==Accountno){
				arr[i].setBalance(arr[i].getBalance() + money);
				break;// �̷��� �߽�� �ڵ尡 ����ϰ� ���� ����� ����
			}			
		}

		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}

	//����ϱ�
	private static void withdraw() {
		int i;
		System.out.println();
		System.out.println("<< ��� >>");
		System.out.print("���¹�ȣ: "); 
		int Accountno = sc.nextInt();
		System.out.print("��ݾ�: ");
		int money = sc.nextInt();
		boolean flag = findAccount(Accountno);

		if(flag == false) {
			System.out.println("���: ���°� �����ϴ�.");
			return;// �̷��� �߽�� �ڵ尡 ����ϰ� ���� ����� ����
		}

		for(i=0;i<arr.length;i++){
			if(arr[i].getAccountno()==Accountno){
				arr[i].setBalance(arr[i].getBalance() - money);
				break;// �̷��� �߽�� �ڵ尡 ����ϰ� ���� ����� ����
			}			
		}

		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}	

	private static boolean findAccount(int Accountno) {
		Account Account = null;
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				int dbAccountno = arr[i].getAccountno();
				if(dbAccountno==Accountno) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}
}




/*
----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 1

<< ���»��� >>
���¹�ȣ: 111
������: ȿ��
�ʱ��Աݾ�: 1000
���: ���°� �����Ǿ����ϴ�.

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 1

<< ���»��� >>
���¹�ȣ: 222
������: ����
�ʱ��Աݾ�: 2000
���: ���°� �����Ǿ����ϴ�.

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 2

<< ���¸�� >>
���¹�ȣ	������	���ݾ�
111	ȿ��	1000
222	����	2000

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 3

<< ���� >> 
���¹�ȣ: 333
���ݾ�: 3000
���: ���°� �����ϴ�.

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 3

<< ���� >> 
���¹�ȣ: 111
���ݾ�: 500
���: ������ �����Ǿ����ϴ�.

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 2

<< ���¸�� >>
���¹�ȣ	������	���ݾ�
111	ȿ��	1500
222	����	2000

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 4

<< ��� >>
���¹�ȣ: 333
��ݾ�: 200
���: ���°� �����ϴ�.

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 4

<< ��� >>
���¹�ȣ: 222
��ݾ�: 300
���: ����� �����Ǿ����ϴ�.

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 2

<< ���¸�� >>
���¹�ȣ	������	���ݾ�
111	ȿ��	1500
222	����	1700

----------------------------------------------------------
1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����
----------------------------------------------------------
����> 5
���α׷� ����

*/
