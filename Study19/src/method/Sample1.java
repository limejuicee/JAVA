package method;

public class Sample1 {
	public static void main(String[] args) {
		//객체 조립 방법
		//new 클래스명();
		Test a;
		a=new Test();
		a.run(true);
		
	}
}
//메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작 ***
//같은 이름을 가진 동작이 여러개이면 오류의 원인이 된다
//메서드 오버로드 : 매개변수에 차이를 두어 같은 이름을 가진 동작을 여러개 사용하는 방법
//	매개변수의 명칭으로는 오버로드가 성립하지 않고, 타입과 수에 영향을 받는다
class Test{
	//리턴타입 이름(){호출시 수행할 동작}
	void run() {
		System.out.println("run()동작 실행");
	}//void run 끝
	void run(int a, String b) {
		System.out.println("두번째 메서드 동작 실행");
	}//void start 끝
	void run(String a) {
		System.out.println("세번째 메서드 동작 실행");
	}
	void run(String b, int c) {
		System.out.println("마지막 메서드 동작 실행");
	}
	void run(boolean a) {
		System.out.println("이 메서드가 실행될 수 있도록 매개변수를 적으시오");
	}
}//class Test 끝