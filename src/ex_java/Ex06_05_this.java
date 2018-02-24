package ex_java;
class Human{
	
	private String jmId;
	private String gunId;
	private int year;
	private int month;
	private int day;
	
	public Human(){}
	


	public Human(String jmId, int year, int month, int day) {
		/*this.jmId = jmId;
		this.year = year;
		this.month = month;
		this.day = day;*/
		this(jmId,null,year, month, day); // 빈칸으로 하고 싪을떄는 null을 이용하면됨
	}
	
	public Human(String jmId, String gunId, int year, int month, int day) {
		this.jmId = jmId;
		this.gunId = gunId;
		this.year = year;
		this.month = month;
		this.day = day;
	}


	
	public void showIfo() {
		System.out.println("민번:"+jmId);
		System.out.println("생년월일:"+ year +"/"+ month+"/" + day );
		
		if(gunId!=null){
		System.out.println("군번:"+gunId);
		}else{
			System.out.println("군과 관계없음");
		}
		System.out.println();
	}
	
	 
}

public class Ex06_05_this {

	public static void main(String[] args) {
		
		Human man =new Human("951123","1234566",1995,11,23);
		
		Human woman =new Human("790127",1979,1,27);
				
		man.showIfo();
		woman.showIfo();
		
	}

}
