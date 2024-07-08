package cond;

public class SWITHCH {
	public static void main(String[] args) {
		//분기문 switch
		//변수의 값에 따라 코드를 *수행할 지점*을 결정하는 문법
		//switch(변수){case 값 : 수행할 문장;break;}
		//switch는 위치만 지정할 뿐 아래로 쭉 읽어 내려가려는 성질이 남아 있어서
		//선별작업에 사용하고자 한다면 break; 명령을 통해 해당 성질을 막아야한다
		//case값이 중복되면 오류난다
		int i=10;
		switch(i) {
			case 200 : System.out.println("200일 때 수행 확인!");break;
			case 100 : System.out.println("100일 때 수행 확인!");
			case 50 : System.out.println("50일 때 수행 확인!");
			default : System.out.println("해당하는 값이 없습니다!");
		}
		System.out.println("스위치문 종료 후 실행");
	}
}
