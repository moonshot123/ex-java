package ex_java;
class OverLoad{
	
	void add(int...num){//int[]num ������
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		System.out.println(sum);
	}
	
	void add(String data, int...num){//int[]num ������
		int sum=0;
		System.out.println(data);
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		System.out.println(sum);
	}
	
}


public class Ex06_03_�����ε�_���������� {//�޼ҵ忡�� ���� ���� �Ű������� ������ �����ҋ� ���Ǵµ� �׷��� �迭����� ���Ǵµ� 

	public static void main(String[] args) {
		OverLoad load =new OverLoad();
		load.add(10,20,30,40,50);
		load.add(2,5);
		load.add("������",9,2,9,8);
	}

}
