package ex_java;

public class Ex03_09_break_continue {

	public static void main(String[] args) {

		//break,continue 둘다 if문을 나가는게 아니라 그위의 반복문을 나가는거  
		for(int i=1; i<=10;i++){
			if(i==5){
				break; // 반복문을 빠져 나간다.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=======================");
		

		
		for(int i=1; i<=10;i++){
			if(i==5){
				continue; //복습 
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
