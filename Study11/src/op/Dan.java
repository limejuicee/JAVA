package op;

public class Dan {
	public static void main(String[] args) {
		//단항연산자
		//	부정연산자 	!	: 값을 반전시키는 용도로 사용
		//	증감연산자 ++, --	: 값을 한단위 증감시킬때 사용
		boolean b=!true;
		System.out.println(b);
		
		//증감연산자는 전위증감이냐 후위증감이냐에 따라 계산 우선순위에 차이가 있다
		int i=3;
		int k=i++;
		System.out.println("k값 : "+k);
		System.out.println("i값 : "+i);
		
		//상수는 변수제작과 동일하지만 앞에 final이 붙는다
		//상수는 연산이 불가
		final int a=15;
		//a++; 값을 바꿀 수 없어서 증감 불가
	}
}
