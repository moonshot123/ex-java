package ex_java;
import java.util.Scanner;

class Person5{

	String id;
	String pw;
	String name;
	public Person5(){}
	public Person5(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

}

public class Ex08_05_������ {
	public static void main(String[] args) {
		boolean result=true;
		String inputId="";
		String inputPw="";
		String yn="";
		boolean flag=false;
		Scanner sc =new Scanner(System.in);
		Person5[] p = {
				new Person5("kim","1234","�迬��"),
				new Person5("park","5678","�ں���"),
				new Person5("lee","3333","�̽±�")
		};

		do{
			flag=false;
			System.out.print("Id�Է�:");
			inputId=sc.next();

			if(inputId.length()<3 || inputId.length()>8){
				System.out.println("id�� 3����~8���� �Է��ؾ� �մϴ�.");
				continue;// while do~while�� ���ǹ����� �̵� 
			}            // for : ������ 
						 // �̰� �������� Ȱ���� ����(�����ʿ�)

			for(int i=0; i<p.length;i++){
				if(inputId.equals(p[i].id)){
					System.out.print("pw�Է�:");
					inputPw=sc.next();
					//flag=true; ����ٰ����� ����
					if(inputPw.equals(p[i].pw)){
						System.out.println(p[i].name+"�� �ݰ����ϴ�.");
						flag=true;
						break;//�ݺ����� ����������. if���� ���������°��� �ƴ�, �� ���� for���� �������� ���尡��� �ݺ����� ��������
					}else{
						System.out.println("����� �ٸ��ϴ�.");
						flag=true;
						break;
					}
				}
			}//1.break ����Ǹ� ��������  2.���� �������� : ��ã������
			
			//�̷������ϴ� ������ for���� ���� ���� ���;ߵ� ������ for���� ���鼭�� ���¸� �������ִ�flag�� ����ؼ� �ش���̵� ���θ� Ȯ���� ���ֵ��� ���������Ѵ�.
			//�ϴ� �ظ��ϸ� for���� ���� ������ �սô�...
			if(flag==false){
				System.out.println("�ش� ���̵� �����ϴ�.");
			}

			System.out.print("���:y?");
			yn=sc.next();

		}while(yn.equalsIgnoreCase("y"));
		System.out.println("���α׷��� �����մϴ�.");
	}
}


	/*
		id�Է�:as
		id�� 3����~8���� �Է��ؾ� �մϴ�.
		id�Է�:sdfsfsdfsdfsf
		id�� 3����~8���� �Է��ؾ� �մϴ�.
		id�Է�:choi
		�ش� ���̵� �����ϴ�.
		���?y
		id�Է�:kim
		pw�Է�:1234
		�迬�ƴ� �ݰ����ϴ�.
		���?y
		id�Է�:park
		pw�Է�:4334
		����� ���� �ʽ��ϴ�.
		���?y
		id�Է�:pa
		id�� 3����~8���� �Է��ؾ� �մϴ�.
		id�Է�:park
		pw�Է�:5678
		�ں��˴� �ݰ����ϴ�.
		���?n
		���α׷��� �����մϴ�.
	 */