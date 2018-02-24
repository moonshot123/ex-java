package ex_java;

public class Ex05_08_재귀호출 {

	public static void main(String[] args) {
		
		System.out.println("4팩토리알:" + factorial(4));
		//호출과 반환위치에 대해서 확실히 해야 틀리지 않게 만들수 있을듯
		//생각하면 간단하지만 생각을 못하면 완전 틀릴듯, 재귀호출에 대한 예제 몇개 풀어 보자.
	}

	private static int factorial(int n) {
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
			//factorial(n-1)에서 사용 되는 부분에서 다시 메소드를 호출함으로서 1이 될때까지 계속 줄어들어 계산이 입력값의 팩토리알과 같은 계산값을 반환하게 된다. 
		}
		
	}

}