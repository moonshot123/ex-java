package ex_java;
import java.util.Scanner; 

public class Ex01_04_�Է¹� {
	
	public static void main(String [] args){
		String name,grade = null;
		int kor,eng,math,sum;
		double avg;
		
		Scanner sc = new Scanner(System.in); //���� �д� ��� // System.in�� Ű����� �Է��ϴ� ���� �Է¹���
		//Ű����� �Է¹޴� ���� ��ĳ�ʸ� ���� �Է¹޴� sc����
		
		System.out.print("�̸��� �Է��ϼ���:");
		name = sc.next(); //sc.next() : �Է��� ���ڿ��� �о�鿩�� name�� �ְڴ�.
		
		System.out.print("��������:");
		kor = sc.nextInt(); 
		//sc.nextDouble();
		//sc.nextFloat();
		System.out.print("��������:");
		eng = sc.nextInt(); //�������� �Է¹ްڴ�.

		System.out.print("��������:");
		math = sc.nextInt();
	
		System.out.println();
		
		System.out.println("�Է��� �̸�:"+name); 
		System.out.println("�Է��� ��������:"+kor); 
		System.out.println("�Է��� ��������:"+eng); 
		System.out.println("�Է��� ��������:"+math); 
		
		sum = kor+eng+math;
		avg = (double)sum/3;
		System.out.println("���� �հ�:"+sum);
		System.out.printf("���:%.2f\n",avg);
		/*
		else if �� if ������ 
		*/
		
		if(avg >= 90.0){
			System.out.println("A����");
			
		}else if(avg>=80.0 && avg<90.0){ //esle �� ����ϸ� ���� ������ �ϴ� ���󰡹Ƿ� && avg<90.0 �̰� �� �Է��� �ʿ�� ����.
			System.out.println("B����");
			
		}else if(avg>=70.0 && avg<80.0){
			System.out.println("C����");
			
		}else if(avg>=60.0 && avg<70.0){
			System.out.println("D����");
			
		}else {
			System.out.println("F����");
		}
		
		System.out.println("===========================================");
		
		
		
		if(avg>=90){
			grade ="A";
			if(avg>=95){
				grade =grade +"+";
			}else{
				grade =grade +"-";
			}
		}else if(avg>=80){
			grade ="B";
			if(avg>=85){
				grade = grade + "+";
			}else{
				grade = grade +"-";
			}
		}else if(avg>=70){
			grade ="C";
			if(avg>=75){
				grade = grade + "+";
			}else{
				grade = grade +"-";
			}
		}else if(avg>=60){
			grade ="D";
			if(avg>=65){
				grade = grade + "+";
			}else{
				grade = grade +"-";
			}
		}
		System.out.println("����:"+ grade);
		
		System.out.println("===========================================");
		
		switch ((int)avg/10) { //double���̶� int�� ��ȯ 10�����ִ°� �˾Ƽ�
		
		case 9: case 10: 
			System.out.println("A");
			break;
			
		case 8:  
			System.out.println("B");
			break;
			
		case 7:  
			System.out.println("C");
			break;
			
		case 6:  
			System.out.println("D");
			break;
			
		default:
			System.out.println("F");
			break;
		}
		
		System.out.println("����2:"+ grade);
		
	}
}
