package ex_java;

public class Ex03_04_������ {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		/*ch 
		M or m : Moring
		A or a : Afternoon
		E or e : Evening
		
		if()
		switch()
		*/
		
		
		if(ch=='M' || ch=='m'){
			
			System.out.println("Morning");
			
		}else if (ch=='A' || ch=='a'){
			
			System.out.println("Afternoon");
			
		}else if(ch=='E' || ch=='e'){
			
			System.out.println("Evening");
			
		}else{
			System.out.println("�߸��Է��߽��ϴ�.");
			
		}//if
		
		
		switch (ch) {
			case 'M': case 'm':
				System.out.println("Morning");
				break;
			
			case 'A': case 'a':
				System.out.println("Afternoon");
				break;
			
			case 'E': case 'e':
				System.out.println("Evening");
				break;
				
			default:
				System.out.println("�߸��Է��߽��ϴ�."); 
				break;
		}
		
	}

}
