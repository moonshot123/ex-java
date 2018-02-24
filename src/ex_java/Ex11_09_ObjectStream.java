package ex_java;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable{//Serializable �������̽��� �� ����ϵ��� �ؾ� ��ü�� ����ȭ�Ͽ� ����°���?
	String name;
	int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {//printf�� �ϸ� �ʿ����
		return   name + " ," + age ;
	}

}

public class Ex11_09_ObjectStream  {

	public static void main(String[] args) throws IOException {

		Human p1 =new Human("ȫ�浿", 20);
		Human p2 =new Human("�Ӳ���", 30);
		Human p3 =new Human("������", 40);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fos = new FileOutputStream("human.txt");//Output �Է�
			oos = new ObjectOutputStream(fos);// �Է�

			oos.writeObject(p1);//writeObject ��ü������ ����
			oos.writeObject(p2);
			oos.writeObject(p3);

			fis = new FileInputStream("human.txt");
			ois = new ObjectInputStream(fis);

			Human h1= (Human) ois.readObject();//readObject()�� Object() ���Ϲ��� �ٿ�ĳ��������ߵ�
			Human h2= (Human) ois.readObject();//��ü������ �б⶧���� readObject�� �̷��� ���� �ʿ䰡 ����.(�Ѱ��� ���� ��)
			Human h3= (Human) ois.readObject();//ClassNotFoundException ���� Ÿ������ �ٿ�ĳ������ �ϸ� ��������

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
