package dan;

public class Start {
	public static void main(String[] args) {
		//단항연산자 : 항이 단독으로 사용 가능한 연산자
		// !항 : true는 false로 false는 true로 값을 반전
		boolean B=false;
		boolean C=!B;
		System.out.println(C);
		
		//증감연산자 : 단항의 데이터를 한단위 증가 또는 감소시키는 효과
		// ++ : 항의 값을 한단위 증가
		// -- : 항의 값을 한단위 감소
		//***증감연사자는 전위증감과 후위증감이 약간 다르게 동작한다
		//"=" 대입연산자와 함께 쓰일때 다르게 동작한다
		int a=5;
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		
		// A=A+B   A+=B
		// A=A-B   A-=B
		// A=A*B   A*=B
		int i=5;
		i*=2;
		System.out.println(i);
		
		//컴퓨터가 문자를 해석할 수 없으니 문자표 번호로 기억을 한다
		char c='뗿';
		int number=c;
		c=(char)number;
		System.out.println(number);
		System.out.println(c);
		
		//강제 형변환(캐스팅) : 다른 타입의 자료를 저장하기 위해 타입을 강제변경
		//(변환할 타입)자료;
		//캐스팅시 어느정도의 자료의 유실 또는 변조는 각오해야 한다
		float f=1.234f;
		int g;
		g=(int)f;
		System.out.println(g);
	}//main 끝
}//class 끝
