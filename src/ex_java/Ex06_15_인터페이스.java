package ex_java;
interface Camera{
	void takePhoto();
}

interface MP3{
	void playMp3();
}

interface DMB{
  	void viewTv();
}


class Shape2{
	private int size;
	private String color;
	
	public Shape2(){}
	public Shape2(int size, String color) {
		this.size = size;
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}


class Phone extends Shape2 implements Camera,MP3,DMB {
	
	public Phone(){}
	
	public Phone(int size, String color) {
		super(size,color);
		
	}
	
	public void viewTv() {
		System.out.println("tv시청");
	}

	public void playMp3() {
		System.out.println("음악감상");
	}

	public void takePhoto() {
		System.out.println("사진찍기");
	}
	
	
}


public class Ex06_15_인터페이스 {

	public static void main(String[] args) {
		
		Phone p = new Phone(7,"blue");
		
		p.viewTv();
		p.playMp3();
		p.takePhoto();
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		
	}

}
