package ex_java;

public class Ex04_01_�������迭 {

	public static void main(String[] args) {
		//int 4����Ʈ
		//������ ������ �޸𸮿� ���� ������ �ּҸ� ������ �ְ� ���� ���� ���� �Ѵ�.
		//���� ������ ���� ���� ���� �ϱ� ���� �迭�� �����
		int a=10; //���� ��� a�ּ� 14
		int b=20; // b�� �ּ� 320
		int c=30; // c�� �ּ� 802 �̷������� �ٸ� �ּҰ��� ���Ե�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		int [] arr1 = {10,20,30}; //�迭�� ������� a�� �ּҰ�(������)�� 100�̶�� �ϸ� b�� 104 c�� 108�� ������� �������   
		//����� �ʱ�ȭ�� ���ÿ� �ϴ� ���  
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		
		
		int arr2[] =new int []{10,20,30,40,50};//�迭����� �ʱ�ȭ ���2 ���� �������� ����
		System.out.println(arr2[0]);
		System.out.println(arr2[2]);
		System.out.println(arr2[4]);  // arr2[5]��� �߸� �Է��Ѵٸ� java.lang.ArrayIndexOutOfBoundsException �迭������ �Ѿ�� �߸��ߴٰ� ��������
		
		
		
		int [] arr3 = new int [4]; //���3 ���� �迭 ũ�⸦ �����ϰ� ����   
		//int �� ���� ������ �ִ� �迭�� 4ĭ ������
		System.out.println(arr3[0]);//int�� ����Ʈ�� 0�� ��� 
		
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
			
		System.out.println("x�� ����:"+x.length); //���� ������ ���Ҽ� ����	
		System.out.println("arr1�� ����:"+arr1.length);	
			
		
		
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
