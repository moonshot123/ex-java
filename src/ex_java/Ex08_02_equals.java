package ex_java;
class Fruit{
	String name;
	int price;
	
	public Fruit(){}
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//원래매개변수에 들어가는 값은 fruit인데 들어가면서 오브젝트로 바뀌는것
	public boolean equals(Object obj){//Object obj = (Object) f3 형태로 들어감 f3이 Object형태인 obj로 업캐스팅이 되어 들어감 
		if(obj instanceof Fruit){ // obj 를 Fruit로 다운캐스팅할수 있냐? //매개변수에서 들어올떄 업캐스팅이 되었기떄문에 다운캐스팅이 가능
			Fruit fff = (Fruit) obj;
			return fff.price==this.price && fff.name.equals(this.name);//왼쪽은 가격비교, 오른쪽은 이름비교
		}else{
			return false;
		}
	}
	
}


public class Ex08_02_equals {

	public static void main(String[] args) {
		Fruit f1 = new Fruit("apple",1000); // 객체를 생성할때는 String name, int price 를 매개변수로 갖는 생성자르 만들어야한다.
		Fruit f2 = new Fruit("orange",2000);
		Fruit f3 = new Fruit("grape",1000);
		
		System.out.println(f1==f2);//f1==f2 뜻은 f1은참조변수로써 참조값을 가지고 있다. 그래서 f1, f2의 주소가 같은지 물어보는 것 당연히 다르다.
		System.out.println(f1.equals(f3));//f1.equals(f3)도 f1과 f3의 주소값이 같은지 비교 하는것 == 과 같다.
		System.out.println(f1.price==f3.price);//이것도 가능 
		
		
		
		
	}

}
