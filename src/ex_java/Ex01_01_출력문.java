package ex_java;
// 클래스이름바꾸기 f2키 누르면 이름 바꿀수 있음
// 폰트바꾸기 윈도우 > 프리퍼런스 > font > 에디트
// run 컨트롤 + f11
// 윈도우 > 쇼뷰 들어가면 사라진 버튼 찾을수 있음
public class Ex01_01_출력문 { 
	public static void main(String[] args){
		
		System.out.print("println 과 print차이");			
		System.out.println(1);
		System.out.println(1+2);
		
		System.out.print(1);
		System.out.print(1+2);
		System.out.println();
		System.out.print("==================================");
		
		//	한줄주석 : 컨트롤 + / 
		
		/*
			여러줄 주석  
			컨트롤 + 쉬프트 + /
		*/
		
		//  줄정리하기 : 전체선택 > 컨트롤 + i
		//	바로 복사 붙여넣기 : 컨트롤 + 알트 + 방향키
		//	라인이동하기 : 알트 + 방향키
		//	되돌리기 : 컨트롤 + d 
		//	줄삭제 : 컨트롤 + d
		
		System.out.println(1);
		System.out.println(1+2);
		System.out.println("1" + "2"); // 여기서 + 는 연결의 의미
		System.out.println("1+2");
		System.out.println("1+2=" + 1+2);
		System.out.println("1+2=" + (1+2));
		// ''로둘러싼것 : 문자,문자 상수
		// ""로둘러싼것 : 문자열
		
		//System.out.println자동완성기능  syso 입력  컨트롤 + 스페이스 
		
		System.out.println();
		System.out.println("abc"); // 전부입력 가능
		System.out.println('x'); //한글자만 빈칸안됨 두글자안됨
		System.out.println('하');
		
		
		System.out.println("1+2=3");
		int a1 = 10;
		int a2 = 20;
		System.out.println(a1 + "+" + a2 + "="+ (a1+a2));
		System.out.println(a1 + "-" + a2 + "="+ (a1-a2));
		System.out.println(a1 + "*" + a2 + "="+ (a1*a2));	
		
		//텍스트 문서(소스코드)를 jdk로 컴파일을 해서 기계어(바이트코드)로 바꾸고  
		
		// 워크스페이스 바꾸기 : file > switch workspace 누르면 바꿀수 있음
	}
}
