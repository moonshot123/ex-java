package ex_java;

public class Ex03_06_����for {

	public static void main(String[] args) {
		int i,j;
		
		for(i=1;i<=2;i++){
			for(j=7;j<=9;j++){
				System.out.println(i+","+j);
			}//���� for
			
			System.out.println("***");
			
		}//�ٱ��� for
		
		System.out.println("==================");
		
		
		
		
		for(i=1; i<=10; i=i+3){
			for(j=3;j>=1;j--){
				System.out.println(i+","+j);
			}
			System.out.println("***");
		}
		System.out.println("==================");
		
		
		
		//������
		for(i=2;i<=9;i++){
			System.out.println("***"+i+"��***");
			for(j=1;j<=9;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println("==================");
		
		
		
		
		
		
		
	}

}
