package ex_java;
import java.util.Scanner;

class Account2{
	private int account_num;//계좌번호
	private String account_name;//계좌주
	private int account_money;//예금액
	
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
		return "계좌번호:" + account_num + ", 계좌주:" + account_name + ", 예금액:"+ account_money;
	}
	
}//Account




public class Ex05_19_조이름 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Account2[] a = new Account2[1000];
		int i=0;
		int num=0;
		int input=0;
		do{
				System.out.println("----------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("----------------------------------------");
				System.out.print("번호선택:");
				num=sc.nextInt();

				switch (num) {
				
				case 1:
					if(i<a.length){
						System.out.println("<< 예금 >>");	
						System.out.print("계좌번호:");
						int account_num = sc.nextInt();
						System.out.print("계좌주:");
						String account_name=sc.next();	
						System.out.print("예금액:");
						int account_money=sc.nextInt();
					
						a[i]=new Account2(account_num,account_name,account_money);
						System.out.println("계좌가 생성되었습니다.");
						System.out.println();
						i++;
					break;
					
					}else{
						System.out.println("범위를 넘었음");
						System.exit(0);
					}
					
				case 2:
					System.out.println("<< 계좌목록 >>");
					for(int j=0;j<i;j++){ 
						if(a[j]!=null){
							System.out.println(a[j].toString());
						}
					}
					break;
					
				case 3:
					System.out.println("<< 예금 >>");
					
					System.out.print("계좌번호:");
					input =sc.nextInt();
					
					for(int j=0;j<i;j++){ 
						if(input == a[j].getAccount_num()){
							System.out.print("예금액:");
							int money =sc.nextInt();
							a[j].setAccount_money((a[j].getAccount_money()) + money);
							System.out.println("결과: 입금이 완료되었습니다.");
							break;
							
						}else if(!(input == a[j].getAccount_num())){
							
							System.out.println("결과: 계좌가 없습니다.");
						}
					}
					
					break;
					
				case 4:
					System.out.println("<< 출금 >>");
					
					System.out.print("계좌번호:");
					input =sc.nextInt();
					
					for(int j=0;j<i;j++){ 
						if(input == a[j].getAccount_num()){
							System.out.print("예금액:");
							int money =sc.nextInt();
							a[j].setAccount_money(a[j].getAccount_money() - money);
							System.out.println("결과: 출금이 완료되었습니다.");
							break;
						}else{
							System.out.println("결과: 계좌가 없습니다.");
						}
					}
				
					break;
					
				case 5:
					
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
				default:
					System.out.println("잘못입력했습니다.");
					System.out.println();
				}
			
		}while(i<a.length);
	}
}
