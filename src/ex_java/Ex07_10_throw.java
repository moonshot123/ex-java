package ex_java;
public class Ex07_10_throw {
	
	static void call() throws Exception{ // ������ �߻��Ǿ��ٴ� ������ �Ʒ� ���� �޼ҵ忡 �ִ� call()�� ������ ���ٰ� �˷��� //  
		int i=1/0;
		
		/*try{
			int i=1/0;
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println("call ���� �����߻� ");
		}*/
		
	}
	
	
	public static void main(String[] args) {
		
		try{
			call();//���� �޼ҵ忡�� ������ ����� �˼��� ���⶧���� ����ó���ȴ�.
			System.out.println("����ó�� �Ǿ����ϴ�");
		}catch(Exception e){
			System.out.println(e.toString());
			System.out.println("ó���߿����߻�");
		}
		
	}

}
