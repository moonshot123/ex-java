package ex_java;
public class Ex08_04_StringBuffer {

	public static void main(String[] args) {
		
		//String Ŭ������ ������ �Ұ�����(Immutable) Ŭ����
		String str1 = "Have "; //str1.append("b "); �̷������� ���� �ȵ�,������ // �ּҰ�:100
		String str2 = "a ";	//�ּҰ�:200
		String str3 = "nice day";//�ּҰ�: 300
		String str4 = str1 + str2 + str3;//�ּҰ� 400
		System.out.println(str4);//�ּҰ�400
		String str5 = str4.replace("nice", "good");//replace�� �����϶�� �޼ҵ� �ε� ���� ������ �ϰ� ������ �ٽ� str5�� ���� �־���� �Ѵ�.
		System.out.println(str5);// �̷��� �ٽ� ���� �־������// �ּҰ� 500
		
		//StringBuffer Ŭ������ ������ ������ Ŭ����
		StringBuffer sb = new StringBuffer("Have "); //100����
		sb.append("a "); // String���� append�� ����. //append�� �߰��ϴ� �޼ҵ� >>>�������ص� ���Ӱ� ���� �ʿ�� ����
		sb.append("nice day");//100���� >> �������ص� ���Ӱ� ���� �ʿ�� ����
		sb.replace(7, 11, "good");//100���� >> �������ص� ���Ӱ� ���� �ʿ�� ����
		String str = sb.toString();
		System.out.println(str);
		//�ӵ����̰� ������ ���ڿ��� ������ ���� ���� �ʴ´ٸ� �׷��� ���� ������ ����.
		
	}

}