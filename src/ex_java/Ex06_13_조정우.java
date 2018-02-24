package ex_java;
abstract class Employee2{//추상메소드가 있으면 추상클래스로 바꿔줘야한다. 
	private String empno;//사번
	private String name;//이름
	private int pay;//급여
	
	public Employee2(){}
	public Employee2(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public int getPay() {
		return pay;
	}
	public abstract double getMonthPay();// 추상메소드는 자식클래스에서 꼭 오버라이딩하라고 만드는것 
	
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


public class Ex06_13_조정우 {

	public static void main(String[] args) {
		
		Employee2[] e ={
						new PartRime("P001","이효리",300,7),
						new Contract("C001","옥주현",400,3),
						new FullTime("F001","성유리",500,30)
		};
		
		
		for(int i =0; i<e.length;i++){
			System.out.println(e[i]);
			System.out.println(e[i].getMonthPay());
			System.out.println();
			
		}
		
		
	}

}//main
