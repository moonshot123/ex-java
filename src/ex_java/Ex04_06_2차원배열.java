package ex_java;

public class Ex04_06_2차원배열 {

	public static void main(String[] args) {

		int [][] arr1 = {
							{10,20,30,31},
							{40,50},
							{60,70,80}
						}; 
		int [][] arr2 =new int[][] {{10,20,30},{40,50,60}}; 
		int [][] arr3 =new int[2][3]; 
		arr3[0][0] =10;
		arr3[0][1] =20;
		arr3[0][2] =30;
		arr3[1][0] =40;
		arr3[1][1] =50;
		arr3[1][2] =60;
		
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[0][0]);
		System.out.println();
		
		int i, j;
		
		for(i =0; i<arr1.length;i++){
			
			for(j=0; j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
				
			}
			System.out.println();
		}	
		
		System.out.println();
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println();
		
		
		for(int[] e:arr3){
			for(int t : e){
				System.out.println(t+"");
			}
			System.out.println();
		}
		
		
		
	}

}
