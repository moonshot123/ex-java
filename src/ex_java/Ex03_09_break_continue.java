package ex_java;

public class Ex03_09_break_continue {

	public static void main(String[] args) {

		//break,continue �Ѵ� if���� �����°� �ƴ϶� ������ �ݺ����� �����°�  
		for(int i=1; i<=10;i++){
			if(i==5){
				break; // �ݺ����� ���� ������.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
		

		
		for(int i=1; i<=10;i++){
			if(i==5){
				continue; //���� 
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
		System.out.println();
		
		
		for(int i =2; i<=9;i++){
			if(i%2==0){
				for(int j=1; j<=9;j++){
					if(i>=j){
						System.out.println(i+"*"+j+"="+i*j);
					}
				}
			}
			System.out.println();
		}
		
		
		System.out.println("=======================");
		
		int a = 0;
		
		while(a<10){
			if(a==7){
				break;
			}
			
			a++;
			System.out.println(a);
		}
		
		
		
		
	}

}
