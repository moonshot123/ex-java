package ex_java;
import java.util.Scanner;

class Account{
	private int Accountno;// 계좌번호
	private String owner; // 계좌주
	private int balance; // 잔고

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

public class Ex05_19_선생님 {
	private static Account[] arr = new Account[2];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean retry = true;	
		
		while(retry) {
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

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
		System.out.println("프로그램 종료");
		//main메소드가 끝나면 어차피 프로그램이 끝남
	}

	//계좌생성하기
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
			System.out.println("더 이상 계좌 생성 불가합니다.");
			return;
		}
		
		System.out.println("<< 계좌생성 >>");

		System.out.print("계좌번호: "); 
		int Accountno = sc.nextInt();

		System.out.print("계좌주: "); 
		String owner = sc.next();

		System.out.print("초기입금액: ");
		int balance = sc.nextInt();

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Account(Accountno, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	//계좌목록보기
	private static void AccountList() {
		System.out.println();
		System.out.println("<< 계좌목록 >>");
		System.out.println("계좌번호\t계좌주\t예금액");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) { 
				System.out.print(arr[i].getAccountno()+"\t");
				System.out.print(arr[i].getOwner()+"\t");
				System.out.print(arr[i].getBalance());
				System.out.println();
			}
		}
	}

	//예금하기
	private static void deposit() {
		int i;
		System.out.println();
		System.out.println("<< 예금 >> ");
		System.out.print("계좌번호: "); 
		
		
		int Accountno = sc.nextInt();
		System.out.print("예금액: ");
		int money = sc.nextInt();

		boolean flag = findAccount(Accountno);

		if(flag == false) {
			System.out.println("결과: 계좌가 없습니다.");
			return;// 이런걸 잘써야 코드가 깔끔하고 쉽게 만들수 있음
		}
		
		for(i=0;i<arr.length;i++){
			if(arr[i].getAccountno()==Accountno){
				arr[i].setBalance(arr[i].getBalance() + money);
				break;// 이런걸 잘써야 코드가 깔끔하고 쉽게 만들수 있음
			}			
		}

		System.out.println("결과: 예금이 성공되었습니다.");
	}

	//출금하기
	private static void withdraw() {
		int i;
		System.out.println();
		System.out.println("<< 출금 >>");
		System.out.print("계좌번호: "); 
		int Accountno = sc.nextInt();
		System.out.print("출금액: ");
		int money = sc.nextInt();
		boolean flag = findAccount(Accountno);

		if(flag == false) {
			System.out.println("결과: 계좌가 없습니다.");
			return;// 이런걸 잘써야 코드가 깔끔하고 쉽게 만들수 있음
		}

		for(i=0;i<arr.length;i++){
			if(arr[i].getAccountno()==Accountno){
				arr[i].setBalance(arr[i].getBalance() - money);
				break;// 이런걸 잘써야 코드가 깔끔하고 쉽게 만들수 있음
			}			
		}

		System.out.println("결과: 출금이 성공되었습니다.");
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
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 1

<< 계좌생성 >>
계좌번호: 111
계좌주: 효리
초기입금액: 1000
결과: 계좌가 생성되었습니다.

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 1

<< 계좌생성 >>
계좌번호: 222
계좌주: 유리
초기입금액: 2000
결과: 계좌가 생성되었습니다.

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 2

<< 계좌목록 >>
계좌번호	계좌주	예금액
111	효리	1000
222	유리	2000

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 3

<< 예금 >> 
계좌번호: 333
예금액: 3000
결과: 계좌가 없습니다.

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 3

<< 예금 >> 
계좌번호: 111
예금액: 500
결과: 예금이 성공되었습니다.

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 2

<< 계좌목록 >>
계좌번호	계좌주	예금액
111	효리	1500
222	유리	2000

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 4

<< 출금 >>
계좌번호: 333
출금액: 200
결과: 계좌가 없습니다.

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 4

<< 출금 >>
계좌번호: 222
출금액: 300
결과: 출금이 성공되었습니다.

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 2

<< 계좌목록 >>
계좌번호	계좌주	예금액
111	효리	1500
222	유리	1700

----------------------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
----------------------------------------------------------
선택> 5
프로그램 종료

*/
