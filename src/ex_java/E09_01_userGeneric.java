package ex_java;
class Top<T>{
	private T data= null; 
	public void setData(T data){ // Integer data =10; // new로 안만들어도 오토박싱이 되서 만들어짐 
		this.data=data;
	}
	public T getData(){
		return this.getData();
	}
}


public class E09_01_userGeneric {

	public static void main(String[] args) {
			
		
		String str ="hello generic 방식";
		Top<String> t = new Top<String>();
		t.setData(str);
		String str2 = t.getData();
		System.out.println(str2);

		
		Top<Integer> t1 = new Top<Integer>();//<Integer> 기본데이터 타입은 쓸수 없고 int,double등은 불가능  
		t1.setData(10);
		int i = t1.getData();
		System.out.println(i);
		
	}

}


//배열은 고정된 공간을 갖기때문에 메모리도 고정됨

//컬렉션은 동적으로 공간을 갖을수 있음 > 
