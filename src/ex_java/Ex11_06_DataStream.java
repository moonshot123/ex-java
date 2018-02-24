package ex_java;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11_06_DataStream {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("data.txt"); //파일과 직접연결할 수 있는 스트림을 1차 스트림이라고 함
		//data.txt에 데이터를 저장 하기위한 fis연결다리를 만든다. //폴더의 경로가 다를때나 폴더가 없을떄 예외처리되고 
		DataOutputStream dos = new DataOutputStream(fos);//(fos)자리에 데이터 결로를 직접 지정 할 수 없음 : 2차스트림 // 1차스트림을 통해 만들수 있도록 도움을 주는것
		
		// 아래의 여러가지방법으로 사용하려면 메소드를 가지고 있는 DataOutputStream 을 만들어야한다.
		dos.write(100);
		dos.writeInt(100);// 숫자를 한개씩는게 아니고 한번에 저장
		dos.write(2000);// 범위가 넘어가기 떄문에 숫자가 오류가 남
		dos.writeInt(2000);//2000은 int 로 가능 하기떄문에
		dos.writeFloat(3.14f);
		dos.writeChar('A');
		dos.writeUTF("안녕");
		dos.close();//fos를 닫는게 아니라 dos를 닫음
		//dos >> fos >> data.txt 로 이동함 
		//dos  >> data.txt 이건 안됨 
		//파일을 저장 한뒤에 확인 해보면 입력된 숫자를 아스키코드값으로 바꾸어서 저장됨 
		
		
		
		FileInputStream fis =new FileInputStream("data.txt");//1스트림
		DataInputStream dis = new DataInputStream(fis);//2차스트림은 1차스트림과 꼭 같이 써야된다.
		
		//데이터를 타입별로 읽거나 쓸떄 사용되는 스트림
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
DataInputStream이나 DataOutputStream은 바이트 기반의 2차 스트림이다.

*/