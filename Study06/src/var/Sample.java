package var;

public class Sample {
	public static void main(String[] args) {
		//변수 제작법
		//타입 이름;
		int a;
		//int a; 이미 사용중인 이름은 사용할 수 없다
		//int 123a; 이름은 숫자로 시작할 수 없다
		//int a 123; 이름에는 띄어쓰기를 사용할 수 없다
		//int a_123; 이름에 특수문자는 $ _ 둘 중 하나만 사용 가능하다
		//int int; 이름에 예약어를 사용할 수 없다
		//int A; 대소문자는 엄격하게 구분한다
		//int 한글; 한글을 이름으로 쓸 수 있지만 가급적 사용하지 마세요
		
		//변수의 초기화
		int b=10;
		System.out.println(b);
		
		//상수의 사용 : 한번 값이 정해지면 변경할 수 없는 공간
		//final 타입 이름=초기값;
		//상수는 한번 값이 입력되면 변경할 수 없다
		final int c=10;
		System.out.println(c);
		// c=20; 상수는 값을 변경하면 오류남
		System.out.println(c);
	}
}