package ex_java;
import java.util.ArrayList;
import java.util.Scanner;

class Music2{
	private String title;
	private String singer;
	private int price;
	public Music2(){}
	public Music2(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getPrice() {
		return price;
	}
	public String toString(){// 내가 만드는 클래스는 왠만하면 오버라이딩은 해줘야됨 
		return  title+"/"+ singer +"/"+ price;
	}
}

public class Ex09_04_선생님 {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner sc =new Scanner(System.in);
		ArrayList<Music2> list = new ArrayList<Music2>();
		String input_singer;
		String input_title;
		int input_price;
		String retry="";
		
		while(true){
			
			System.out.print("제목:");
			input_singer = sc.next();
			
			System.out.print("가수:");
			input_title = sc.next();
			
			System.out.print("가격:");
			input_price = sc.nextInt();
			
			list.add(new Music2(input_title, input_singer, input_price));
			System.out.println("계속?");
			if(!(retry.equals("y"))){break;}
		}//while
		
		System.out.println(list.toString());//Music2의 문자열주소 리턴 //오버라이딩해줘야 값나옴 
		System.out.println("찾는제목 :");
		input_title=sc.next();
		flag=false;
		
		System.out.println();// 아래 방식은 까먹지말고 생각하자...
		for(int i=0;i<list.size();i++){//i<=list.size() 이렇게하면 안됨
			if(list.get(i).getTitle().equals(input_title)){
				System.out.println(list.get(i).getTitle()+"의 가수명은"+list.get(i).getSinger()+"입니다. 가격은 "+list.get(i).getPrice());
				flag = true;
				break;
			}
			
		}//찾는제목없습니다 는 for문이 꼭 끝난뒤 확인후 만들기 그래야 오류가 없음
		
		if(flag == false){
			System.out.println("찾는 제목없음");
		}
		
		//list 는 중복을 허용하고 순서가 있다.
	}

}
