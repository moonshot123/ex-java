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
		return "이름:" + title + ", 가격:" + price;
	}

}


public class Ex05_18_조정우 {

	public static void main(String[] args) {

		Book[] bk = new Book[10];
		int num=0;
		int i=0;
		Scanner sc =new Scanner(System.in);

		
		do{
			System.out.println("입력:1\t출력2:\t종료3:");
			System.out.print("번호선택:");
			num=sc.nextInt();

			switch (num) {

			case 1:
				if(i<bk.length){
					
				System.out.print("제목:");
				String title = sc.next();
				System.out.print("가격:");
				int price=sc.nextInt();	
				bk[i]=new Book(title,price);
				System.out.println();
				i++;
				break;
				
				}else{
					System.out.println("배열의 범위를 넘었음");
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못입력했습니다.");
				System.out.println();
			}

		}while(i<bk.length);



	}
}
