package ex_java;
class Top<T>{
	private T data= null; 
	public void setData(T data){ // Integer data =10; // new�� �ȸ��� ����ڽ��� �Ǽ� ������� 
		this.data=data;
	}
	public T getData(){
		return this.getData();
	}
}


public class E09_01_userGeneric {

	public static void main(String[] args) {
			
		
		String str ="hello generic ���";
		Top<String> t = new Top<String>();
		t.setData(str);
		String str2 = t.getData();
		System.out.println(str2);

		
		Top<Integer> t1 = new Top<Integer>();//<Integer> �⺻������ Ÿ���� ���� ���� int,double���� �Ұ���  
		t1.setData(10);
		int i = t1.getData();
		System.out.println(i);
		
	}

}


//�迭�� ������ ������ ���⶧���� �޸𸮵� ������

//�÷����� �������� ������ ������ ���� > 
