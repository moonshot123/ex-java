package ex_java;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *  쓸공간   <<      Buffer(임시저장소)     <<  a.txt
 * 
 * BufferedStream 파일을 읽어올떄 도움을 주는 2차클래스이다.
 * 버퍼의 사이즈를 저장 해주지 않으면 8192byte 크기를 갖게됨
 *  
 * 데이터가 크면 버퍼를 쓰냐 안쓰냐에 따라서 속도차이가크다.
 * 
 * */
public class Ex11_07_BufferedStream {

	
	public static void main(String[] args) throws IOException  {
		// 찾을수 없다 , 혹은 보이지 않는다는 말은 아마도 변수가 지정이 안되어 있다는뜻이니 만들었다면 지역변수로 만들어져 있을것......
		
		BufferedInputStream in = null;
		BufferedOutputStream out =null;
		
		try {
			int c ;
			FileOutputStream fos =new FileOutputStream("data.txt");//1차스트림
			out = new BufferedOutputStream(fos,5);//(fos,5) 버퍼의 크기를 5로 만들어서 1개씩 보내는것이 아니라 5개씩 버퍼에서 모아서 보낸다.

			for(int i =1; i<9; i++){//i=1 ~ 8
				out.write(i+48);//49~56      49,50,51,52,53까지 버퍼에 들어가고 54가 버퍼에 들어오려고 하면 앞에있던 5개가 넘어간다.//'0'의 아스키 코드 =48  '1'의 아스키 코드=49
			}
			out.flush();//flush() :버퍼에 남아있는걸 강제로내보내기
			// 작업하기 전에 flush()를 써서 나머지데이터까지 받아서 해야 오류가 나지않는다.

			in = new BufferedInputStream(new FileInputStream("data.txt"),5);//5개를 한번에 내보낸다.

			while((c= in.read())!= -1){//eof를 만나기 전까지 계속
				System.out.println(c+" ");//c는 문자0의 int값이 나옴
			}
		} catch (IOException e){
			e.printStackTrace();
		}finally{//finally는 해도 되고 안해도 됨
			//throws 는 닫아주는 작업을 해야되는데 혹시라도 닫히지 않을수 있기 때문에 안정적이지 않을수 있다.
			if(in!=null){//null 이 아니라는 말은 연결이 되어있다라는 뜻 그래서 다디를 여기서했음
				in.close();}// 1,2차 스트림에서 2차스트림나 닫아줘도 1차는 알아서 닫힘
			if(out!=null){//close()도 예외처리를 해야되는데 그럼 너무 복잡해서 try catch를 했지만 throws도 해준다. 그래  
				out.close();}//close()를 하는순간에 나머지를 전부 내보내기가 된다. flush() 기능도 있는듯
		}

		/*
		 * 콘솔에서는 5개만 나오는데 왜나면 아직 남은걸 내보내지 않아서 그런데 close()를 사용하면 문을 닫으면서 나머지까지 파일을 내보내서 파일은 완성됨 
		*/
		
	}//main
	
}
