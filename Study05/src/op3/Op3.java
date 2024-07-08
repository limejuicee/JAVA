package op3;

public class Op3 {
	public static void main(String[] args) {
		//비교연산자
		//값이 크고 작음을 비교, 계산의 결과는 true또는 false로 나온다
		
		// < : 왼쪽이 오른쪽보다 작은지 확인
		// > : 왼쪽이 오른쪽보다 큰지 확인
		// <= : 왼쪽이 오른쪽보다 작거나 같은지 확인
		// >= : 왼쪽이 오른쪽보다 크거나 같은지 확인
		// == : 둘이 같은지 확인
		// != : 둘이 다른지 확인
		int a;
		int b;
		boolean result;
		boolean c;
		boolean result1;
		boolean result2;
		/**/boolean result3;
		
		a=5;
		b=3;
		result= a>b;
		c=a>b+b;
		result1=a*3==b*5;
		result2=a*3!=b*5;
		/**/result3=3<a&&a<7;
		System.out.println(result);
		System.out.println(c);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//논리연산자 : 논리적인 판단을 진행하는 연산자
		// && : ~이고 ~이다
		// || : ~이거나 ~이다
	}//main 끝

}//class 끝
