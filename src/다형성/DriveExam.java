package ������;

public class DriveExam {

	public static void main(String[] args) {
		Bus b1 =new Bus();
		Taxi t1 =new Taxi();
		Bicicle bi1 = new Bicicle();
		
		b1.drive();
		t1.drive();
		bi1.drive();
		System.out.println("++++++++++++++++++++++++++++++++++++");

		Vechicle ve1 =new Bus();
		Vechicle ve2 =new Taxi();
		Vechicle ve3 =new Bicicle();
		
		ve1.drive();// �ڽ��� ����̺갡 ȣ��� ������ �θ� drive�� ������ ������ ����
		ve2.drive();
		ve3.drive();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Vechicle[] v ={
						new Bus(),
						new Taxi(),
						new Bicicle()
		};
		
		for(int i=0; i<v.length;i++){
			v[i].drive();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Driver d= new Driver();
		d.drive(b1);
		d.drive(t1);
		d.drive(bi1);
	}

}
