package ex_java;
abstract class Shape { // 추상클래스 // 추상클래스로는 객체를 만들수 없다.
	public Shape() {
		System.out.println("모양");
	}
	public void make(){
		System.out.println("도형 그리기");
	}
	public abstract void draw(); //추상메서드 
	public abstract void delete(); //추상메서드
}
// 추상메서드는 상속받은 클래스에서 재정의하여 완성시켜야한다.
// 추상메소드나 클래스를 만드는것은 자식에서 무조건 오버라이딩을 하게할 목적으로 추상메소드를 만든다. 그래야만 실수를 하지 않을 수 있기떄문에 그런거 같다.
// 추상메소드는 내용적은 부분은 자식클래스에서 만들수 있게 각자 정의 해서 쓸수 있도록 정의만 해두는것이다.
// 전체적인 통일성을 주기 위해서 사용되는것 


class Circle extends Shape {
	//생성자
	//클래스와 이름이 같은것 
	//객체를 만들면 자동으로 호출된다.
	//생성자에는 맨처음에 매개변수가 없는 super()가 호출된다. >> super: 부모의 생성자를 호출해라.
	public Circle() {
		System.out.println("원");
	}
	public void draw() {// 부모의 미완성 메소드를 자식클래스에서 완성한다.
		System.out.println("원을 그립니다");
	}
	public void delete() {// 부모의 미완성 메소드를 자식클래스에서 완성한다.
		System.out.println("원을 지웁니다");
	}
	
}



class Triangle extends Shape {
	public Triangle(){
		
	}
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	public void delete() {
		System.out.println("삼각형을 지웁니다");
	}
}



public class Ex06_12_추상메소드 {

	public static void main(String[] args) {
		
		//Shape s =new Shape(); 미완성메소드가 있는 객체이므로 객체를 못만든다. 
		Circle c =new Circle();
		Triangle t =new Triangle();
		
		c.make(); c.draw(); c.delete();
		t.make(); t.draw(); t.delete();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Shape[] s= {
					new Circle(), // 업캐스팅(자동형변환)
					new Triangle()
					};
		
		for(int i=0; i<s.length;i++){
			s[i].make();
			s[i].draw();
			s[i].delete();
		}
	}
}
