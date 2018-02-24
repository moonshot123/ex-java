package ex_java;
import java.util.Scanner; 

public class Ex01_04_입력문 {
	
	public static void main(String [] args){
		String name,grade = null;
		int kor,eng,math,sum;
		double avg;
		
		Scanner sc = new Scanner(System.in); //무언가 읽는 기능 // System.in은 키보드로 입력하는 것을 입력받음
		//키보드로 입력받는 값을 스캐너를 통해 입력받는 sc생성
		
		System.out.print("이름을 입력하세요:");
		name = sc.next(); //sc.next() : 입력한 문자열을 읽어들여서 name에 넣겠다.
		
		System.out.print("국어점수:");
		kor = sc.nextInt(); 
		//sc.nextDouble();
		//sc.nextFloat();
		System.out.print("영어점수:");
		eng = sc.nextInt(); //정수형을 입력받겠다.

		System.out.print("수학점수:");
		math = sc.nextInt();
	
		System.out.println();
		
		System.out.println("입력한 이름:"+name); 
		System.out.println("입력한 국어점수:"+kor); 
		System.out.println("입력한 영어점수:"+eng); 
		System.out.println("입력한 수학점수:"+math); 
		
		sum = kor+eng+math;
		avg = (double)sum/3;
		System.out.println("점수 합계:"+sum);
		System.out.printf("평균:%.2f\n",avg);
		/*
		else if 와 if 차이점 
		*/
		
		if(avg >= 90.0){
			System.out.println("A학점");
			
		}else if(avg>=80.0 && avg<90.0){ //esle 를 사용하면 앞의 기준을 일단 따라가므로 && avg<90.0 이걸 꼭 입력할 필요는 없다.
			System.out.println("B학점");
			
		}else if(avg>=70.0 && avg<80.0){
			System.out.println("C학점");
			
		}else if(avg>=60.0 && avg<70.0){
			System.out.println("D학점");
			
		}else {
			System.out.println("F학점");
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
		System.out.println("학점:"+ grade);
		
		System.out.println("===========================================");
		
		switch ((int)avg/10) { //double형이라서 int로 변환 10나눠주는건 알아서
		
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
		
		System.out.println("학점2:"+ grade);
		
	}
}
