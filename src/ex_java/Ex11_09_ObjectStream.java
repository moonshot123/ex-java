package ex_java;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable{//Serializable 인터페이스를 꼭 상속하도록 해야 객체를 질렬화하여 입출력가능?
	String name;
	int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {//printf로 하면 필요없음
		return   name + " ," + age ;
	}

}

public class Ex11_09_ObjectStream  {

	public static void main(String[] args) throws IOException {

		Human p1 =new Human("홍길동", 20);
		Human p2 =new Human("임꺽정", 30);
		Human p3 =new Human("정몽주", 40);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fos = new FileOutputStream("human.txt");//Output 입력
			oos = new ObjectOutputStream(fos);// 입력

			oos.writeObject(p1);//writeObject 객체단위로 저장
			oos.writeObject(p2);
			oos.writeObject(p3);

			fis = new FileInputStream("human.txt");
			ois = new ObjectInputStream(fis);

			Human h1= (Human) ois.readObject();//readObject()는 Object() 리턴받음 다운캐스팅해줘야됨
			Human h2= (Human) ois.readObject();//객체단위로 읽기때문에 readObject를 이렇게 만들 필요가 없다.(한개만 만들어도 됨)
			Human h3= (Human) ois.readObject();//ClassNotFoundException 없는 타입으로 다운캐스팅을 하면 오류생김

			System.out.println(h1);
			System.out.println(h2);
			System.out.println(h3);


			/*
			while (true){
				Human h= (Human) ois.readObject();
				System.out.printf("%s %d\n",h.name,h.age);
			}
			 */
			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(oos!=null){oos.close();}
			if(ois!=null){ois.close();}
		}
	}
}
