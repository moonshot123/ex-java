package ex_java;

public class Ex03_03_switchcase {

	public static void main(String[] args) {
		
		int num = 2;
		
		switch (num) {//����ġ ��ȣ �ȿ��� ����, ���ڿ� ���� ����(O)    �Ǽ����� �ȵ�(X)			
			case 1:System.out.println("1�Դϴ�.");
				break;
			
			case 2:System.out.println("2�Դϴ�.");
				break;//�극��ũ�� ������ ����ġ�������� ��
		
			case 3:System.out.println("3�Դϴ�.");
				break;
							
			default:System.out.println("1~3���ƴ�");
				
		}//switch
		
		
		switch (num%2) {
			case 0:System.out.println("¦��");
				break;

			case 1:System.out.println("Ȧ��");
				break;
		}//switch
		
		
		
		String fruit ="banana";
		
		switch (fruit) {
		case "apple":System.out.println("���");
			break;
			
		case "banana":System.out.println("�ٳ���");
			break;
			
		case "grape":System.out.println("����");
			break;
			
		default:
			break;
		}
		
		
		System.out.println("swhitch ������");
		
		
		
		
		
	}

}
