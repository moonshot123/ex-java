package ex_java;
import java.util.HashMap;
import java.util.Map;

public class Ex09_07_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();// Map�� �������̽��� ��ӹ޴� HashMap���� ��ü�� ����� ����// ���ʸ��� ���� �˾Ƽ� ������ߵ�
		map.put("�뼺", new Integer(32));	// HashMap�� ������ �߰�(("�뼺", 32)) �̷��� �ᵵ �� �˾Ƽ� ����ڽ̵�
		map.put("ž", new Integer(22));	// ����key�� �ڰ� value��
		map.put("�¸�", new Integer(53));	// �ڷ���� ������ ����
		map.put("����", new Integer(32));	// Ű�� �ߺ�������, ���� ����  
		map.put("ž", new Integer(75));	// Ű���� �ߺ��Ǹ�տ� �ִ� ž�� �ڿ� ���°ſ� ��� >> �������� ������ �����
		
		System.out.println(map);
		System.out.println(map.get("ž")); 	//get(Ű��) Ű���� ������ �ְ� ���� ������ ���� ������
		System.out.println(map.get("�¾�"));	//Ű���� ���ٸ� null�� ���´�.
		
		// ���� ������ ������ ���� ������ 
		// �� �����Ϳ� �ش��ϴ� ��ü�� ����� ��ϸ� �پ��� �����͵��� ���� � �� �� ����
		
		
		
	}

}
