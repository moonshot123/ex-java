package ex_java;
import java.util.Scanner;

class Saram{
	
	private String name;
	private int age;
	
	Saram() {	
	}
	
	Saram(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	// �̰ɾȾ��� �迭 �ּҰ� ���´�.....
	public String toString(){
		return name+","+age;
	}
	
}


public class Ex05_17_��ü�迭 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//���� �ִ� ������ �� �������
		String name;
		int age;
		
		Saram[] sa= new Saram [3];
		sa[0]=new Saram("����",80);
		
		for(int i=1; i<sa.length;i++){

			System.out.print("�̸�:");
			name=sc.next();
			System.out.print("����:");
			age=sc.nextInt();
			
			sa[i]=new Saram(name,age);
			
		}
		
		
		//������Ʈ ���� > ���� ���µ� ����϶�� �ؼ� ����
		
		for(Saram s:sa){
			System.out.println(s.toString());//toString�� ���� �߿伺�� �˼� �ִ�.
		}
		
		
		for(int i=0; i<sa.length;i++){
			if(sa[i] != null){
			System.out.println(sa[i]);
			}
		}
		
		
		/*for(int i=0; i<sa.length;i++){
			System.out.println(sa[i]);
		}*/
		
	}

}
