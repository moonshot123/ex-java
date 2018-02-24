package ex_java;
import java.io.File;
import java.io.IOException;

public class Ex11_03_File {

	public static void main(String[] args) {
		File f1 =new File("A");// 확장자가 없으면 폴더
		File f2 =new File("B");// 따로 위치를 지정하지 않으면 지금 작업위치에 생김
		File f3 =new File("C");
		File f4 =new File(f1,"aa.txt");//f1 이 없다면 현재작업공간에 바로 생성 //
		
		if(f1.exists()){
			f1.renameTo(f2);// 이름바꾸기f1> f2 이름으로
			System.out.println("폴더이름 바꾸기 완료");
		}else{
			f1.mkdir();// 폴더만들기:mkdir();
			System.out.println("폴더생성함");
			
			try {
				f4.createNewFile();	//파일만들기:createNewFile();  //예외처리를 해줘야됨
				System.out.println("화일생성함");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(f3.exists()){
			boolean bool = f3.delete();// 대소문자 상관없는듯   // 폴더안에 파일이 있으면 안지워짐
			System.out.println(bool);
			if(bool){ //bool == true
				System.out.println("삭제완료");
			}else{
				System.out.println("삭제실패");
			}
		}
	}
}