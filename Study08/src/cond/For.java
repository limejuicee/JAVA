package cond;

public class For {
	public static void main(String[] args) { 
		//***반복문 for : 특정 동작을 반복해서 수행하도록 하는 문법
		//for(시작점; 조건; 증감식){반복 수행할 문장;}
		//반시계방향 반식이 방향ㅋㅋ
		//반복 기준점을 잡고 기준점에 변화를 줘서 특정값이 될 때까지 반복해라
		//컴퓨터는 조건까지만 보고 실행후 반복시 증감식 적용후 반복
		System.out.println("반복 시작 전");
		int i;
		for(i=2140000000; i>=3; i++) {
			System.out.println("반복중..."+i);
		}
		System.out.println("반복 종료"+i);
	}//main 끝
}//class 끝