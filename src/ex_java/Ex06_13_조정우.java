package ex_java;
abstract class Employee2{//�߻�޼ҵ尡 ������ �߻�Ŭ������ �ٲ�����Ѵ�. 
	private String empno;//���
	private String name;//�̸�
	private int pay;//�޿�
	
	public Employee2(){}
	public Employee2(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public int getPay() {
		return pay;
	}
	public abstract double getMonthPay();// �߻�޼ҵ�� �ڽ�Ŭ�������� �� �������̵��϶�� ����°� 
	
	public String toString() {
		return  empno + ", " + name + ", " + pay;
	}
	
	
	
}//Employee2

class PartRime extends Employee2{
	private int workDay;
	
	public PartRime(){}
	public PartRime(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay = workDay;
	}

	public double getMonthPay(){
				
		return getPay()*workDay;
	} 
	public String toString() {
		return  super.toString();
	}
	
}//PartRime



class Contract extends Employee2{
	private int hireYear;
	
	public Contract(){}
	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno,name,pay);
		this.hireYear = hireYear;
	}

	public double getMonthPay(){
		
		return getPay()*hireYear/(double)12;
	} 
	
	public String toString() {
		return  super.toString();
	}
	
}//Contract


class FullTime extends Employee2{
	private int bonus;
	
	public FullTime() {}
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus=bonus;
	}

	public double getMonthPay(){
		
		return (getPay()/(double)12) + (bonus/(double)12);
	} 
	
	public String toString() {
		return  super.toString();
	}
	
}//FullTime


public class Ex06_13_������ {

	public static void main(String[] args) {
		
		Employee2[] e ={
						new PartRime("P001","��ȿ��",300,7),
						new Contract("C001","������",400,3),
						new FullTime("F001","������",500,30)
		};
		
		
		for(int i =0; i<e.length;i++){
			System.out.println(e[i]);
			System.out.println(e[i].getMonthPay());
			System.out.println();
			
		}
		
		
	}

}//main
