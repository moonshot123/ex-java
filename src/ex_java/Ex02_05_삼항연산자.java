package ex_java;

public class Ex02_05_���׿����� {

	public static void main(String[] args) {
/*
	���׿�����
	3+4 , - * / % && ||
	
	���׿�����
	! ++ --
	
	���׿�����
	?:
	
*/	
		
		
/*
	���� ? a:b
	������ ���̸� a �����̸� b	
		
*/
		int a=5;	
		boolean b;
		String result;
		
		result = a>1 ? "1���� ũ��" :"1���� �۴�"; 
		System.out.println(result);
		
		result = (a%2)==0 ? "¦��" :"Ȧ��"; 
		System.out.println(result);
		
		
		result = a/2 == 0 ? "a" : "b";
		System.out.println(result);
		
		
		
		
	}

}
