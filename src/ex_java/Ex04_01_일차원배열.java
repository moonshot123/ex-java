package ex_java;

public class Ex04_01_일차원배열 {

	public static void main(String[] args) {
		//int 4바이트
		//각각의 변수는 메모리에 각각 별개의 주소를 가지고 있고 따로 값을 저장 한다.
		//같은 형태의 값을 쉽게 저장 하기 위해 배열을 사용함
		int a=10; //예를 들어 a주소 14
		int b=20; // b의 주소 320
		int c=30; // c의 주소 802 이런식으로 다른 주소값을 갖게됨
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		int [] arr1 = {10,20,30}; //배열을 예를들면 a의 주소값(참조값)은 100이라고 하면 b는 104 c는 108로 순서대로 만들어짐   
		//선언과 초기화를 동시에 하는 방법  
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		
		
		int arr2[] =new int []{10,20,30,40,50};//배열선언과 초기화 방법2 많이 사용되지는 않음
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		System.out.println(arr2[4]);  // arr2[5]라고 잘못 입력한다면 java.lang.ArrayIndexOutOfBoundsException 배열범위를 넘어서서 잘못했다고 에러나옴
		
		
		
		int [] arr3 = new int [4]; //방법3 먼저 배열 크기를 지정하고 선언   
		//int 형 값을 가지고 있는 배열을 4칸 만들어라
		System.out.println(arr3[0]);//int형 디폴트값 0이 출력 
		
		arr3[0]=100;
		arr3[1]=200;
		arr3[2]=300;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
		
		
		
		int [] x = {1,2,3,4,5};
			for(int i=0;i<x.length;i++){
				System.out.print(x[i]);
			}
			System.out.println();
			
		int [] y = new int []{1,2,3,4,5};
			for(int i=0;i<x.length;i++){
				System.out.print(y[i]);
			}
			System.out.println();
	
		int [] z = new int[5];
			z[0]=1;
			z[1]=2;
			z[2]=3;
			z[3]=4;
			z[4]=5;
			
			for(int i=0;i<x.length;i++){
				System.out.print(z[i]);
			}
			System.out.println();
			
		System.out.println("x의 길이:"+x.length); //방의 개수를 구할수 있음	
		System.out.println("arr1의 길이:"+arr1.length);	
			
		
		
		char[]x1 ={'a','b','c'};
		char[]y1 =new char[]{'b','b','c'};
		char[]z1 =new char[3];
		z1[0]='a';
		z1[1]='b';
		z1[2]='c';
		
		for(int i=0;i<y1.length;i++){
			System.out.println("y1:"+y1[i]); 	
		}
		
		
		
		
		
		
	}

}
