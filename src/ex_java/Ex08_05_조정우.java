package ex_java;
import java.util.Scanner;

class Person{

	String id;
	String pw;
	String name;
	public Person(){}
	public Person(String id, String pw, String name) {
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
		int count=0;
		Scanner sc =new Scanner(System.in);
		Person[] p = {
				new Person("kim","1234","�迬��"),
				new Person("park","5678","�ں���"),
				new Person("lee","3333","�̽±�")
		};


		do{

			while(result){

				System.out.print("Id�Է�:");
				inputId=sc.next();

				if(inputId.length()>=3 && inputId.length()<=8){

					for(int i=0; i<p.length;i++){

						if(inputId.equals(p[i].id)){
							result=false;
							break;
						}else{
							count++;
						}
					}
					if(count==p.length){
					System.out.println("�ش� ���̵� �����ϴ�.");
					}
				}else{
					System.out.println("id�� 3����~8���� �Է��ؾ� �մϴ�.");
				}

			}
			
			
			count=0;
			result = true;
			while(result){

				System.out.print("pw�Է�:");
				inputPw=sc.next();

				for(int i=0; i<p.length;i++){

					if(inputPw.equals(p[i].pw)){
						System.out.println(p[i].name+"�� �ݰ����ϴ�.");
						result=false;
						break;
					}else{
						count++;
					}
					if(count==p.length){
						System.out.println("����� �ٸ��ϴ�.");
						
					}
				}
			}

			
			System.out.print("���:y?");
			yn=sc.next();
			if(yn.equalsIgnoreCase("y")){
				result=true;
			}else{
				result=false;
			}

		}while(result);


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
