package ex_java;

public class Ex03_08_while {

	public static void main(String[] args) {
		int i ; 
		
		for(i=1; i<=5; i++){
			System.out.println("apple"+i);
		}
		
		System.out.println("===================");
		i=1;
		while(i<=5){
			System.out.println("apple"+i);
			i++;
		}
		
		System.out.println("===================");
		
		i=2;
		while(i<=9){
			System.out.println(3+"*"+i+"="+3*i);
			i++;
		}
		
		System.out.println("===================");
		
		
		i=1;
		int sum=0;
		while(i<=10){			
			sum+=i;			
			i++;
		} 
		System.out.println(sum);
		
		System.out.println("===================");
		
		
		
		i=1;
		do{
			System.out.println("i="+i);
			i++;
		}while(i<=10);
		
		System.out.println("===================");
		
		
		
		int j;
		i=1;
		j=5;
		while(i<3){
			j=5;
			while(j<8){
			
				System.out.println(i+","+j);
				j++;
				
			}//inner
			i++;
		}//outer
		
		System.out.println("===================");
		
		
		
	}
	
	
}
