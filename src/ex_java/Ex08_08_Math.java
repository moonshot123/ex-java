package ex_java;

public class Ex08_08_Math {

	public static void main(String[] args) {
		
		for(int i=0;i<6;i++){
			System.out.println((int)(Math.random()*45)+1);//1~45
		}
		
		
		for(int i=0;i<5;i++){
			System.out.println((char)(Math.random()*26+'A'));
		}
		
		System.out.println(Math.round(1.78));//round:�ݿø� �ϴ� �޼ҵ� :2
		System.out.println(Math.ceil(1.28));//ceil:������ �ø��ϴ� �޼ҵ� :2.0
		System.out.println(Math.floor(1.78));//floor:������ ������ �޼ҵ� :1.0
		System.out.println(Math.pow(2, 4));//2*2*2*2 >>> 2�� 4��
		
		
		
	}

}
