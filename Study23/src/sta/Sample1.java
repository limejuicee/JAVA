package sta;

public class Sample1 {
	public static void main(String[] args) {
		Sample2 A=new Sample2();
		Sample2 B=new Sample2();
		Sample2 C=new Sample2();
		A.s_field=30;
		B.s_field=20;
		C.s_field=10;
		System.out.println(A.s_field);
		System.out.println(B.s_field);
		System.out.println(C.s_field);

		/*
		Sample2.s_field=30;
		Sample2.s_field=20;
		Sample2.s_field=10;
		System.out.println(Sampl2.s_field);
		System.out.println(Sampl2.s_field);
		System.out.println(Sampl2.s_field);
		*/
	}
	static void test() {
		System.out.println("test 실행");
	}
}

class Sample2 {
	//static이 붙어있으면 객체없이 설계도만 가지고 뭔가 하는거다
	int n_field;
	static int s_field;
	//static으로 선언된 변수는 객체 없이 클래스만으로 동작 가능하며
	//객체를 통해 접근하더라도 객체와는 아무 상관이 없다
	
	//static으로 선언된 메서드는 객체 없이 클래스만으로 동작 가능하다
	//설계도가 수행하는 동작으로 객체와는 아무 상관이 없다
	static void test() {
		System.out.println("다른 클래스 안의 test실행");
	}
}