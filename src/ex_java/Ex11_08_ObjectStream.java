package ex_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;;

//InputStream 바이트 단위로 파일을 전송

class Person implements Serializable{//한묶음으로 보낼 데이터(클래스)       Serializable이 있어야 객체직렬화가능 
	String name ="홍길동";
	transient int age =20;//객체 직렬화: 이러한 데이터를 바이트로 바꾸어서 보낸다. 
	//transient는 파일에 기록되는않았으면 하는 데이터에 입력하면 파일에 디폴드 값이 들어간다. 
}
public class Ex11_08_ObjectStream {

	public static void main(String[] args) {

		Person sp =new Person();

		try {
			FileOutputStream fos = new FileOutputStream("objectfile.txt");//1차스트림
			ObjectOutputStream oos =new ObjectOutputStream(fos);//2차스트림

			oos.writeObject(sp);
			oos.writeObject(new Date()); //날짜 클래스
			oos.close();

			FileInputStream fis =new FileInputStream("objectfile.txt");
			ObjectInputStream ois =new ObjectInputStream(fis);

			Person p = (Person) ois.readObject();//readObject(): 객체형태로 읽음    readObject()는 반환관이 Object() 형이라서 Person형으로 반드시 다운캐스팅 해주어야한다.
			System.out.printf("%s %d\n",p.name,p.age);
			Date d =(Date) ois.readObject();
			System.out.println(d);// 출력이 잘되는걸 보니 toString 오버라이딩이 잘 되어 있다는걸 알수 있다.
			System.out.println(ois.readObject());
			ois.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
