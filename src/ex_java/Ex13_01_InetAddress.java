package ex_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
// 도메인 주소를 통해 ip주소를 알아내는방법
public class Ex13_01_InetAddress {

	public static void main(String[] args) {
		
		BufferedReader br ;
		String url=null ;
		InetAddress[] addresses;//ip주소는 InetAddress 타입으로 만들어야됨 그리고 복수 일수 있기때문에 배열로 만들어놓음
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("웹사이트 주소를 입력하세요");
		
		try {
			url = br.readLine();
			
			addresses = InetAddress.getAllByName(url);//getAllByName은 도메인을 ip주소로 바꿔줌
			// 해당 도메인과 매핑 되어있는 모든 주소를 알려줌
			for(int i=0; i<addresses.length;i++){
				System.out.println(addresses[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
