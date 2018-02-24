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

public class Ex09_04_������ {
	public static void main(String[] args) {
		String retry="";
		String input_singer;
		String input_title;
		int input_price;
		Scanner sc =new Scanner(System.in);
		ArrayList<Music> list =new ArrayList<Music>();


		do{

			System.out.print("����:");
			input_singer = sc.next();

			System.out.print("����:");
			input_title = sc.next();

			System.out.print("����:");
			input_price = sc.nextInt();

			list.add(new Music(input_singer,input_title,input_price));

			System.out.print("y��������:");
			retry = sc.next();

		}while((retry.equals("y")));

		
		
		System.out.println(list);
		
		boolean flag =false;
		
		
		System.out.print("ã������:");
		input_title = sc.next();
		
		for(int i=0; i<list.size(); i++){
			
			if(list.get(i).getTitle().equals(input_title)){
				System.out.println(list.get(i).getTitle()+"�� ��������"+list.get(i).getSinger()+"�Դϴ�. ������ "+list.get(i).getPrice());
				flag =true;
				break;
			}
		}
		
		/******************************
		for each ���� �̿��ؼ��� ������...
		for(Music e : list ){
			System.out.println(e);
		}
		*******************************/
		
		if(flag==false){
			System.out.println("ã�� ������ �����ϴ�.");
		}
		

	}
}
/*
����:����𸣰ڴ�
����:���
����:1000
���?y
����:������
����:������
����:2000
���?y
����:������
����:����
����:3000
���?n
[����𸣰ڴ�/���/1000, ������/������/2000, ������/����/3000]

ã�� ���� �Է�:������
�������� �������� ������, ������ 2000

ã�� ���� �Է�:������
ã�� ������ �����ϴ�.

 */
