package ex_java;
class Sports extends Object{// �θ�� �ڽİ��� ����Ҽ� ���� ta, goal�� ������ �������� //object�޼ҵ�� ��� �޼ҵ���� �θ�Ŭ�����̴�.// �޼ҵ帶�� ������Ʈ�� �θ�� ������ �Ƚ��൵ �ȴ�.
	String name;
	int inwon;
	
	Sports(){}

	public Sports(String name, int inwon) {
		this.name=name;
		this.inwon=inwon;
	}

	

	void display() {
		System.out.println("�̸�:"+name);
		System.out.println("�ο���:"+inwon);
	}
}//Sports



class Baseball extends Sports{//�θ��� �ڷḦ �޾ƿ´�.  
	// calss �ڽ� extends �θ�  
	
	/*String name;
	int inwon;*/
	double ta;
	public Baseball(){
		
	}
	
	public Baseball(String name, int inwon, double ta) {
		super(name,inwon);
		//this.name=name;
		//this.inwon=inwon;
		this.ta=ta;
	}
/*
�����ε��� �������̵�	

	ex)�����ε�:   
				println()
			    println(int u)
				println(double d)
				println(boolean b)
				
				�ϳ��� Ŭ������ ���� �̸��� �޼ҵ尡 ������ �ִ°�
				�Ű������� ������ Ÿ���� �޶����
				����Ÿ���� ����� ����
				�Ű����� �����̸��� �������
				�Ű����� ������ ���� ���� ��
				
				 
	ex)�������̵�: 
				��Ӱ��迡�� �θ� �����ִ� �޼ҵ带 �ڽ��� �������ϴ°�
				�����ִ� �޼ҵ�� ���� �����ϴ� �޼ҵ� �̸��� ���ƾ��Ѵ�.
				�Ű������� ���ƾ��Ѵ�.
				����Ÿ�Ե� ���ƾ��Ѵ�. 
				 
				
*/
	void display() {//�������̵�: ��ӿ��� ���Ӱ� �����ϴ°����μ� �θ��� �޼ҵ带 �����ϴ°� 
		//System.out.println("�̸�:"+name);
		//System.out.println("�ο���:"+inwon);
		super.display();// �θ��� display() ȣ����   
		// display()�� ������ �ڽ��� display()�� ��� ���� ����Լ��� �� : �켱������ �ڱ��ڽ��� �޼ҵ尡 ������ ���⶧����    
		System.out.println("Ÿ��:"+ta);
	}
	
	
	/*void display() {
		System.out.println("�̸�:"+name);
		System.out.println("�ο���:"+inwon);
	}*/

}//Baseball 



class Football extends Sports{//football�� sports�� ��ӹ޴�.

	/*String name;
	int inwon;*/
	int goal;
	public Football(){}
	
	public Football(String name, int inwon, int goal) {
		this.name=name;//this�� ���� Ŭ������¶� ���⿡�� ������ �θ𿡰� ��ӹ޾Ƽ� �ִٰ� ������
		this.inwon=inwon;
		this.goal=goal;
	}
	void display() {
		//System.out.println("�̸�:"+name);
		//System.out.println("�ο���:"+inwon);
		super.display();//�θ��� �޼ҵ忡 �����Ҷ� ���Ǵ� Ű����super
		System.out.println("��:"+goal);
	}
}//Football



public class Ex06_01_��� {

	public static void main(String[] args) {
		
		Baseball bb = new Baseball(); // bb�� ���� ������ �ִ°� �ƴϰ� ���� ������ �ִ� ���� ����Ű�� �ּҰ��������� �ִ°�
		bb.name="�߱�";
		bb.inwon=9;
		bb.ta=0.456;
		
		Football fb= new Football();
		fb.name="�౸";
		fb.inwon=11;
		fb.goal=7;
		
		Baseball bb1 =new Baseball("�߱�",9,0.456);// ��ü�� �����ҋ� �����ڰ� �ʿ��ѵ� ���⶧���� ������ �� �������ߵ�
		Football fb1 = new Football("�౸", 11,7);
		// �ڽ�Ŭ������ �����
		bb1.display();
		fb1.display();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Sports s1 =(Sports)new Baseball("�߱�",9,0.456); // ��ĳ����
		Sports s2 = new Football("�౸", 11,7); //
		// �θ� �ֱ⶧���� ���� ��
		s1.display();
		s2.display();
		
		System.out.println("-----------------------------------------------------");
		/*
		 * 
		 * 
		 * �����ϴ� �����ڰ� Sports�̱⶧���̴�.
		 * �� ���� �����غ��� �Ƹ��� �ٸ������� Baseball, Football �� ���������� �����ϱ� ���ؼ� Sports�� ���� ���� �ϱ� ���ؼ� ����ϴ°� ����.
		 * ���������信�� �̷������� ���ؼ� �ʿ��ұ� �����غ��� ���������������������� 
		 * 
		 * 
		 * 
		*/  
		Sports [] s= {
					new Baseball("�߱�",9,0.456), 
					new Football("�౸", 11,7)				
		};
		
		for(int i =0; i<2;i++){
			s[i].display();
		}
		
		
	}

}
