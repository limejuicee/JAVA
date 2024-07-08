package SWITCH;

public class SWITCH1 {
	public static void main(String[] args) {
		//switch문 : 변수의 값에 따라 실행위치를 결정하는 제어문
		//switch(변수이름){case 값:실행할문장;}
		//switch문은 실행위치만 결정하지 선별기능이 없으므로 아래로 쭉 읽어 내려가지만
		//break를 이용하여 유사선별기능을 구현할 수 있다
		
		int score=90;
		switch(score) {
			case 50 :System.out.println("50점이세요");
			case 90 :break;
			case 100:System.out.println("100점이세요");
					 System.out.println("100점이 만점이 아닙니다");break;
			case 150:System.out.println("150점이세요");
			default : System.out.println("해당하는 값이 없습니다");
		}
		System.out.println("스위치 밖에서는 break의 영향을 받지 않는다");
	}
}
