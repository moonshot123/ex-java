package ex_java;

public class Ex04_09_정렬 {

	public static void main(String[] args) {
		//선택정렬을 이용한 정렬
		int arr[] ={8,3,5,2,9};
		int i ,j,temp;
		
		for(i=0;i<arr.length-1; i++){
			for(j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
