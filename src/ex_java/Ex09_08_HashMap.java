package ex_java;
import java.util.*;//*�� Ŭ���������� ������

public class Ex09_08_HashMap {

	public static void main(String[] args) {
		Map <String, String> dic = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		String word;
		dic.put("pencil", "����");
		dic.put("car", "�ڵ���");
		dic.put("sky", "�ϴ�");
		dic.put("water", "��");
		dic.put("apple", "���");

		
		do{
			System.out.print("ã�� �ܾ�?:");
			word = sc.next();
			if(word.equals("q")){
				break;
			}
			
			if(dic.get(word)==null){
			// dic.get(word) �̰� Ű���� �Է��ؼ� ���� value��   //word�� Ű��....
				System.out.println("ã�� �ܾ� ����");
			}else{
				System.out.println(dic.get(word));
			}
			
					
		}while(true);
		
		System.out.println("���α׷� ����");
		
		
		//ã�� �ܾ��? face
		//��: ��
		
		//ã�� �ܾ��? milk
		//�߸�������
				
		//ã�� �ܾ��?q
		//���α׷��� �����մϴ�.
		
		
		
	}

}
