package ex_java;
class OverLoad{
	
	void add(int...num){//int[]num 같은뜻
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		System.out.println(sum);
	}
	
	void add(String data, int...num){//int[]num 같은뜻
		int sum=0;
		System.out.println(data);
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		System.out.println(sum);
	}
	
}


public class Ex06_03_오버로딩_비정형인자 {//메소드에서 서로 같은 매개변수를 여러개 선언할떄 사용되는데 그래서 배열모양이 사용되는듯 

	public static void main(String[] args) {
		OverLoad load =new OverLoad();
		load.add(10,20,30,40,50);
		load.add(2,5);
		load.add("아이유",9,2,9,8);
	}

}
