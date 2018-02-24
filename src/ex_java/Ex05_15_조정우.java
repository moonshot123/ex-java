package ex_java;
class Member{
	private String id;
	private String passwd;
	private static String company;//����Ǵ� �κ� static �� �̿��Ͽ� �������� ���� �����̺����� ���� ���� ���� ������ ���氡���� 
	// static �� ������ Ŭ���� �̸����� �� ȣ���� ���� �ϱ� ������ Ŭ���� �����ϰ��� ex) Member.company = ��� Ŭ������ ����ƽ�� ���۴� ������ ȣ��
	
	static String getCompany(){//static �� �ִ� ������ static�� ���ϼ� ����
		return company;// Member.company ����?
	}
	
	
	
	/*
	==================================================================================================================
	*/	
	//this�� member���̸� ���ظ���
	
	static void setCompany(String company){// �������� ����Ҽ� �ֵ��� Ŭ���� �̸����� �����Ҽ��ֵ��� ����ƽ���   //���� �Ϲ������� this �� �ٴµ�
		Member.company=company;//���� �Ϲ������� ��������� ��Ÿ���� this�� �ٴµ� static�� ������ this�� ���� ����. �״�� Ŭ���� �̸��� ����. 
	}
	
	/*
	==================================================================================================================
	*/
	
	
	
	
	
	void setId(String id){
		this.id=id;
	}
	String getId(){
		return id;
	}
	
	void setPasswd(String passwd){
		this.passwd=passwd;
	}
	String getPasswd(){
		return passwd;
	}
	
	Member() {
		this.id="choi";
		this.passwd="9876";
		//company ="�߾�";
	}
	
	Member(String id, String passwd) {
		this.id=id;
		this.passwd=passwd;
	}
	
}

public class Ex05_15_������ {

	public static void main(String[] args) {

		Member m1 = new Member();//setter ���� �ڵ�����(kim,1234)  
		Member m2 = new Member();//������ ���� ����(choi,9876)
		Member m3 = new Member("park","5678");//������ ���� ����
		
		m1.setId("kim");//m1�ּҰ� �Ѿ
		m1.setPasswd("1234");
		System.out.println("m1���̵�:"+m1.getId());
		System.out.println("m1�н�����:"+m1.getPasswd());
		System.out.println();
		
		System.out.println("m2���̵�:"+m2.getId());//m2�� �ּҰ� �Ѿ 
		System.out.println("m2�н�����:"+m2.getPasswd());
		System.out.println();
		
		System.out.println("m3���̵�:"+m3.getId());
		System.out.println("m3�н�����:"+m3.getPasswd());
		
		System.out.println(m1.getCompany());
		System.out.println(m2.getCompany());
		System.out.println(m3.getCompany());
		System.out.println(Member.getCompany());
		
		m1.setCompany("����");
		System.out.println(m1.getCompany());
		System.out.println(m2.getCompany());
		
		Member.getCompany();
		
	}

}
