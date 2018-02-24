package ex_java;
public class Ex06_11_다형성 {

	public static void action(Robot r){ //Robot r는 
		//r.dance()를 쓸수 없는 이유가 부모클래스에 dance가 없기도 하고 자신의 공간에 있는 자기자신타입을 먼저 지정해줘야 적어도 접근이 됨 
		
	if(r instanceof DanceRobot){//r을 DanceRobot 으로 바꿀수 있냐??? 라는의미 arr[0](예시주소값:100)에서는 DanceRobot로 업캐스팅을 하기때문에 이게 실행됨
		DanceRobot dr =(DanceRobot)r;
		dr.dance();
	}else if(r instanceof SingRobot){// r을 SingRobot 으로 바꿀수 있냐??? 라는의미 arr[0](예시주소값:200)에서는 SingRobot로 업캐스팅을 하기때문에 이게 실행됨
		SingRobot sr =(SingRobot)r;  // r을 사용하기 위해서 다시 SingRobot으로 다운캐스팅 해주고 ???????그런데 왜 어차피 주소값이 들어가 있는데 바로 안하고 다운캐스팅을 하고 호출을 할까???
		sr.sing();					 // 다시sing메소드를 실행함    바로위의 코드를 안쓰고 r.sing();를 안쓰고 이렇게 쓸까?
	}else if(r instanceof DrawRobot){
		DrawRobot dr =(DrawRobot)r;
		dr.draw();
	}
	
	//(부모 instanceof 자식)  관계가 맞는지 확인하는것 상속관계를 확인하는 것으로 생각하자.
	
}	
	
	public static void main(String[] args) {
		
		Robot[] arr ={//Robot타입으로 묶어 주어서 다른 3가지 객체를 묶어 줄수 있다.
						(Robot)new DanceRobot(),
						new SingRobot(),//Robot 생략
						new DrawRobot()};//Robot 생략
		
		for(int i =0; i<arr.length;i++){
			action(arr[i]);//arr[i]는 각각의 주소값을 나타냄  >>>  객체의 주소값이 action()에 넘어가는거임
			//각각의 객체에 action을 해주기 위해서는 이전에는 각각 만들었어야 하지만 다형성을 이용하면 action()한개만을 이용해서 만들수 있기 떄문에 기존보다 간단하게 코딩을 할 수 있는것 같다. 
		}
		
	}

}


class Robot{}//아무런 내용도 없는 클래스는 왜만들었나?
//아래 클래스들을 상속해줌 물려주는건 없지만 상속해주기 떄문에 부모 자식관계
class DanceRobot extends Robot{
	void dance(){
		System.out.println("춤을 춥니다.");
	}
}




class SingRobot extends Robot{
	void sing(){
		System.out.println("노래를 합니다.");
	}
}




class DrawRobot extends Robot{
	void draw(){
		System.out.println("그림을 그립니다.");
	}
}
