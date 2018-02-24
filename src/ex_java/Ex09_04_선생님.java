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
	public String toString(){// ���� ����� Ŭ������ �ظ��ϸ� �������̵��� ����ߵ� 
		return  title+"/"+ singer +"/"+ price;
	}
}

public class Ex09_04_������ {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner sc =new Scanner(System.in);
		ArrayList<Music2> list = new ArrayList<Music2>();
		String input_singer;
		String input_title;
		int input_price;
		String retry="";
		
		while(true){
			
			System.out.print("����:");
			input_singer = sc.next();
			
			System.out.print("����:");
			input_title = sc.next();
			
			System.out.print("����:");
			input_price = sc.nextInt();
			
			list.add(new Music2(input_title, input_singer, input_price));
			System.out.println("���?");
			if(!(retry.equals("y"))){break;}
		}//while
		
		System.out.println(list.toString());//Music2�� ���ڿ��ּ� ���� //�������̵������ ������ 
		System.out.println("ã������ :");
		input_title=sc.next();
		flag=false;
		
		System.out.println();// �Ʒ� ����� ��������� ��������...
		for(int i=0;i<list.size();i++){//i<=list.size() �̷����ϸ� �ȵ�
			if(list.get(i).getTitle().equals(input_title)){
				System.out.println(list.get(i).getTitle()+"�� ��������"+list.get(i).getSinger()+"�Դϴ�. ������ "+list.get(i).getPrice());
				flag = true;
				break;
			}
			
		}//ã����������ϴ� �� for���� �� ������ Ȯ���� ����� �׷��� ������ ����
		
		if(flag == false){
			System.out.println("ã�� �������");
		}
		
		//list �� �ߺ��� ����ϰ� ������ �ִ�.
	}

}
