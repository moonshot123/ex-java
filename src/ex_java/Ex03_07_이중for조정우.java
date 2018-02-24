package ex_java;

public class Ex03_07_이중for조정우 {

	public static void main(String[] args) {
		int i,j;
		
		/*  
		*
		**
		***
		****
		*****
		*/
		
		for(int a=1; a<=5; a++){
			for(int b=1; b<=a; b++){
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(i =1; i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		  /*
		    *
		   **
		  ***
		 ****
		*****
		*/
		
		
		for(i=0; i<5;i++){
			for(j=4;j>i;j--){
				System.out.print(" ");
			}
			
			for(j=0;j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		/*
		  
		*****
		****  
	    ***
	    **
	    *
	
		*/
		
		for(i=1;i<=5;i++){
			
			for(j=5;j>=i; j--){
				System.out.print("*");
			}
			for(j=0;j>=4; j++){
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/*
		 
		*****
		 ****  
	      ***
	       **
	        *
	
		*/
		
		for(i=1;i<=5;i++){
			
			for(j=1;j<i; j++){
				System.out.print(" ");
			}
			for(j=5;j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	
		
		
		
		
	}

}
