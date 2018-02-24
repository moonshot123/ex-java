package ex_java;
import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	public Music(){}
	public Music(String title, String singer, int price) {
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
	public String toString(){
		return  title+"/"+ singer +"/"+ price;
	}


}

public class Ex09_04_조정우 {
	public static void main(String[] args) {
		String retry="";
		String input_singer;
		String input_title;
		int input_price;
		Scanner sc =new Scanner(System.in);
		ArrayList<Music> list =new ArrayList<Music>();


		do{

			System.out.print("제목:");
			input_singer = sc.next();

			System.out.print("가수:");
			input_title = sc.next();

			System.out.print("가격:");
			input_price = sc.nextInt();

			list.add(new Music(input_singer,input_title,input_price));

			System.out.print("y누르면계속:");
			retry = sc.next();

		}while((retry.equals("y")));

		
		
		System.out.println(list);
		
		boolean flag =false;
		
		
		System.out.print("찾을제목:");
		input_title = sc.next();
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i).getTitle().equals(input_title)){
				System.out.println(list.get(i).getTitle()+"의 가수명은"+list.get(i).getSinger()+"입니다. 가격은 "+list.get(i).getPrice());
				flag =true;
				break;
			}
		}
		
		/******************************
		for each 문을 이용해서도 만들어보자...
		for(Music e : list ){
			System.out.println(e);
		}
		*******************************/
		
		if(flag==false){
			System.out.println("찾는 제목은 없습니다.");
		}
		

	}
}
/*
제목:에라모르겠다
가수:빅뱅
가격:1000
계속?y
제목:좋은날
가수:아이유
가격:2000
계속?y
제목:으르렁
가수:엑소
가격:3000
계속?n
[에라모르겠다/빅뱅/1000, 좋은날/아이유/2000, 으르렁/엑소/3000]

찾는 제목 입력:좋은날
좋은날의 가수명은 아이유, 가격은 2000

찾는 제목 입력:하하하
찾는 제목은 없습니다.

 */
