package ex_java;
class Tv2{
	private String color; // ��������� private���� �����color������ �ܺ� Ŭ�������� ����� �Ұ������� 
	private boolean power;
	private int ch;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getPower() {// �ڵ��ϼ�������� �ϸ� boolean���� get�� is�� �ٲ�� ������ 
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	

	void power(){
		power=!power; // ���� Ŭ���� �ȿ����� ���� ������ �Ʒ��ִ� Ŭ������ �ȵ�
	}
	
	
	/*
	void setColor(String c){//setter �޼ҵ�
		color=c;
	}
	String getColor(){//getter �޼ҵ�
		return color;
	}	
	
	void setCh(int i){//setter �޼ҵ�
		//setter�� getter�� ������ �־��־ �ʿ��Ѵ�� �ٲܼ��� ����
		ch=i;
	}
	
	int getCh(){//getter �޼ҵ�
		return ch;
	}
	
	void setPower(boolean t){//Ʈ������ �������� ������
		power = t;
	}
	
	boolean getPower(){//
		return power;
	}*/
}



public class Ex05_12_setter_getter {

	public static void main(String[] args) {
		
		Tv2 t= new Tv2();
		//t.color="red"; 
		t.setColor("red");
		System.out.println(t.getColor());
		
		//System.out.println(t.color);
		//System.out.println(t.power);//���� ���� ������ �ʾ����� �⺻���� ����
		//t.power();
		t.setPower(true);//set�Ŀ��� ���� true�� �ְڴ�. ��� ��
		//System.out.println(t.power);//power�޼ҵ带 ���� ���� �ٲ�
		System.out.println(t.getPower());
		//t.ch=11;
		t.setCh(11);
		//System.out.println(t.ch);
		System.out.println(t.getCh());
	}

}
