package ex_java;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11_06_DataStream {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("data.txt"); //���ϰ� ���������� �� �ִ� ��Ʈ���� 1�� ��Ʈ���̶�� ��
		//data.txt�� �����͸� ���� �ϱ����� fis����ٸ��� �����. //������ ��ΰ� �ٸ����� ������ ������ ����ó���ǰ� 
		DataOutputStream dos = new DataOutputStream(fos);//(fos)�ڸ��� ������ ��θ� ���� ���� �� �� ���� : 2����Ʈ�� // 1����Ʈ���� ���� ����� �ֵ��� ������ �ִ°�
		
		// �Ʒ��� ��������������� ����Ϸ��� �޼ҵ带 ������ �ִ� DataOutputStream �� �������Ѵ�.
		dos.write(100);
		dos.writeInt(100);// ���ڸ� �Ѱ����°� �ƴϰ� �ѹ��� ����
		dos.write(2000);// ������ �Ѿ�� ������ ���ڰ� ������ ��
		dos.writeInt(2000);//2000�� int �� ���� �ϱ⋚����
		dos.writeFloat(3.14f);
		dos.writeChar('A');
		dos.writeUTF("�ȳ�");
		dos.close();//fos�� �ݴ°� �ƴ϶� dos�� ����
		//dos >> fos >> data.txt �� �̵��� 
		//dos  >> data.txt �̰� �ȵ� 
		//������ ���� �ѵڿ� Ȯ�� �غ��� �Էµ� ���ڸ� �ƽ�Ű�ڵ尪���� �ٲپ ����� 
		
		
		
		FileInputStream fis =new FileInputStream("data.txt");//1��Ʈ��
		DataInputStream dis = new DataInputStream(fis);//2����Ʈ���� 1����Ʈ���� �� ���� ��ߵȴ�.
		
		//�����͸� Ÿ�Ժ��� �аų� ���� ���Ǵ� ��Ʈ��
		int i =dis.read();
		int i2 =dis.readInt();
		int i3 =dis.read();
		int i4 =dis.readInt();
		float f =dis.readFloat();
		char c =dis.readChar();
		String s = dis.readUTF();
		
		System.out.println(i+","+i2+","+ i3+","+","+i4+","+f+","+c);
		
		System.out.println(s);
		
		dis.close();
		
	}

}

/*
DataInputStream�̳� DataOutputStream�� ����Ʈ ����� 2�� ��Ʈ���̴�.

*/