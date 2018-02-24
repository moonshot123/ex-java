package ex_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;;

//InputStream ����Ʈ ������ ������ ����

class Person implements Serializable{//�ѹ������� ���� ������(Ŭ����)       Serializable�� �־�� ��ü����ȭ���� 
	String name ="ȫ�浿";
	transient int age =20;//��ü ����ȭ: �̷��� �����͸� ����Ʈ�� �ٲپ ������. 
	//transient�� ���Ͽ� ��ϵǴ¾ʾ����� �ϴ� �����Ϳ� �Է��ϸ� ���Ͽ� ������ ���� ����. 
}
public class Ex11_08_ObjectStream {

	public static void main(String[] args) {

		Person sp =new Person();

		try {
			FileOutputStream fos = new FileOutputStream("objectfile.txt");//1����Ʈ��
			ObjectOutputStream oos =new ObjectOutputStream(fos);//2����Ʈ��

			oos.writeObject(sp);
			oos.writeObject(new Date()); //��¥ Ŭ����
			oos.close();

			FileInputStream fis =new FileInputStream("objectfile.txt");
			ObjectInputStream ois =new ObjectInputStream(fis);

			Person p = (Person) ois.readObject();//readObject(): ��ü���·� ����    readObject()�� ��ȯ���� Object() ���̶� Person������ �ݵ�� �ٿ�ĳ���� ���־���Ѵ�.
			System.out.printf("%s %d\n",p.name,p.age);
			Date d =(Date) ois.readObject();
			System.out.println(d);// ����� �ߵǴ°� ���� toString �������̵��� �� �Ǿ� �ִٴ°� �˼� �ִ�.
			System.out.println(ois.readObject());
			ois.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
