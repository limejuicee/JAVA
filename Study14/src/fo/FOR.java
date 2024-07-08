package fo;

public class FOR {
	public static void main(String[] args) {
		//for문 : {}내부의 내용을 반복해서 수행해 주는 문법
		/*
		 for(시작점; 조건; 증감식) {
		 	반복해서 수행할 문장;
		 }
		 */
		// *** 반시계 방향으로 수행 (검증-수행-증감-검증-수행-증감-검증)
		// 전역에 기준점이 마련된 경우 for문 내부에서 변수를 똑같은 이름으로 만들면 안된다
		int i=5;
		for(i=0; i<3; i++) {
			i=1;
			System.out.println("반복수행중..."+i);
		}
		System.out.println("반복이 종료된 시점의 i값 : "+i);
	}
}
