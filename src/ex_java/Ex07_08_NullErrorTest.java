package ex_java;

public class Ex07_08_NullErrorTest {

	public static void main(String[] args) {
		/*
		String str ="ABC";
		System.out.println(str.length()); //3���  : String ������ ���� ���̸� ���϶�
		System.out.println("���α׷� ����");
		*/
		
		try{
			
			String str ="abc";
			System.out.println(str.length());// �ƹ��͵� ���µ� ��� ���̸� ���ϳ�? �����߻�
			// ���ܰ� �߻��ϸ� ���ܰ�ü�� �ڵ����� ���������.
			//NullPointerException np = new NullPointerException();
			//NullPointerException : ������ ���� ���ٴ� ��
			//���⼭ ������ ����Ƿ�catch�� �� ���Ŀ� �ٽ� ����� ���°��� �ƴ϶�  catch �Ʒ��� ��� �����
			
			
			
			int [] arr = new int[3];
			arr[0]=3;
			arr[2]=6;//�����߻�
			// ArrayIndexOutOfBoundsException ai =new ArrayIndexOutOfBoundsException();
			// ���ܰ� �߻��ϸ� ���ܰ�ü�� �ڵ����� ���������.
			// ArrayIndexOutOfBoundsException : ���� ���°����� �Է��ҋ� ���� ����
			// �̷��͵鵵 Ŭ�����̴�. �ڹ� api���� ������
			
			int a=3/0;// 0���� �������� �ҋ�
			//ArithmeticException ae= new ArithmeticException();
			
			
		}catch(NullPointerException e ){//Exception e = new NullPointerException e()������  
										//�ֳĸ� Exception �� �θ��̱⋚���� (NullPointerException e)�� (Exception e)�� �ᵵ �������
			System.out.println(e /*.toString*/ + " ������ �߻��߽��ϴ�.");
			System.out.println("����ó����ƾ ����");
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println(e /*.toString*/ + " ������ �߻��߽��ϴ�.");
			System.out.println("�迭�� ������ �Ѿ����ϴ�.");
		}catch(ArithmeticException e ){ //e ���������̹Ƿ� �Ȱ��� ���� �������.
			System.out.println(e /*.toString*/ + " ������ �߻��߽��ϴ�.");
			System.out.println("0���� ������ ����");
		}finally{
			System.out.println("finally ����");
		}
		System.out.println("���α׷� ����");
		
		//catch�� �ѹ��� ���൵�ϴٰ� ����ȴ�.
		
		//Exception�� ����ó�������� ���� ���ٰ� ��������.
		
	}

}
