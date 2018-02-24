package ex_java;
import java.util.Scanner;

class Book{
	private String title;
	private int price;

	
	public Book(){}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "�̸�:" + title + ", ����:" + price;
	}

}


public class Ex05_18_������ {

	public static void main(String[] args) {

		Book[] bk = new Book[10];
		int num=0;
		int i=0;
		Scanner sc =new Scanner(System.in);

		
		do{
			System.out.println("�Է�:1\t���2:\t����3:");
			System.out.print("��ȣ����:");
			num=sc.nextInt();

			switch (num) {

			case 1:
				if(i<bk.length){
					
				System.out.print("����:");
				String title = sc.next();
				System.out.print("����:");
				int price=sc.nextInt();	
				bk[i]=new Book(title,price);
				System.out.println();
				i++;
				break;
				
				}else{
					System.out.println("�迭�� ������ �Ѿ���");
					System.exit(0);
				}
				
			case 2:
				for(int j=0;j<bk.length;j++){ //for(int j=0;j<i;j++)
					if(bk[j]!=null){
						System.out.println(bk[j].toString());
					}
				}
				break;
				
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);

			default:
				System.out.println("�߸��Է��߽��ϴ�.");
				System.out.println();
			}

		}while(i<bk.length);



	}
}
