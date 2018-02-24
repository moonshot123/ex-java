package ex_java;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *  ������   <<      Buffer(�ӽ������)     <<  a.txt
 * 
 * BufferedStream ������ �о�Ë� ������ �ִ� 2��Ŭ�����̴�.
 * ������ ����� ���� ������ ������ 8192byte ũ�⸦ ���Ե�
 *  
 * �����Ͱ� ũ�� ���۸� ���� �Ⱦ��Ŀ� ���� �ӵ����̰�ũ��.
 * 
 * */
public class Ex11_07_BufferedStream {

	
	public static void main(String[] args) throws IOException  {
		// ã���� ���� , Ȥ�� ������ �ʴ´ٴ� ���� �Ƹ��� ������ ������ �ȵǾ� �ִٴ¶��̴� ������ٸ� ���������� ������� ������......
		
		BufferedInputStream in = null;
		BufferedOutputStream out =null;
		
		try {
			int c ;
			FileOutputStream fos =new FileOutputStream("data.txt");//1����Ʈ��
			out = new BufferedOutputStream(fos,5);//(fos,5) ������ ũ�⸦ 5�� ���� 1���� �����°��� �ƴ϶� 5���� ���ۿ��� ��Ƽ� ������.

			for(int i =1; i<9; i++){//i=1 ~ 8
				out.write(i+48);//49~56      49,50,51,52,53���� ���ۿ� ���� 54�� ���ۿ� �������� �ϸ� �տ��ִ� 5���� �Ѿ��.//'0'�� �ƽ�Ű �ڵ� =48  '1'�� �ƽ�Ű �ڵ�=49
			}
			out.flush();//flush() :���ۿ� �����ִ°� �����γ�������
			// �۾��ϱ� ���� flush()�� �Ἥ �����������ͱ��� �޾Ƽ� �ؾ� ������ �����ʴ´�.

			in = new BufferedInputStream(new FileInputStream("data.txt"),5);//5���� �ѹ��� ��������.

			while((c= in.read())!= -1){//eof�� ������ ������ ���
				System.out.println(c+" ");//c�� ����0�� int���� ����
			}
		} catch (IOException e){
			e.printStackTrace();
		}finally{//finally�� �ص� �ǰ� ���ص� ��
			//throws �� �ݾ��ִ� �۾��� �ؾߵǴµ� Ȥ�ö� ������ ������ �ֱ� ������ ���������� ������ �ִ�.
			if(in!=null){//null �� �ƴ϶�� ���� ������ �Ǿ��ִٶ�� �� �׷��� �ٵ� ���⼭����
				in.close();}// 1,2�� ��Ʈ������ 2����Ʈ���� �ݾ��൵ 1���� �˾Ƽ� ����
			if(out!=null){//close()�� ����ó���� �ؾߵǴµ� �׷� �ʹ� �����ؼ� try catch�� ������ throws�� ���ش�. �׷�  
				out.close();}//close()�� �ϴ¼����� �������� ���� �������Ⱑ �ȴ�. flush() ��ɵ� �ִµ�
		}

		/*
		 * �ֿܼ����� 5���� �����µ� �ֳ��� ���� ������ �������� �ʾƼ� �׷��� close()�� ����ϸ� ���� �����鼭 ���������� ������ �������� ������ �ϼ��� 
		*/
		
	}//main
	
}
