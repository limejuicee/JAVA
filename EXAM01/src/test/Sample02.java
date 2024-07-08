package test;

public class Sample02 {
	public static void main(String[] args) {
		short a;
		int b;
		char c;
		boolean d;
		long e;
		float f;
		
		a=100;
		b=500000;
		c='A';
		d=false;
		e=21000000000L;
		f=3.123456f;

		//System.out.println(a+"\r"+b+"\r"+c+"\r"+d+"\r"+e+"\r"+f);
		
		System.out.println(a+" "+b+" "+c);
		
		/*System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);*/
		
		//System.out.println() <- 값 사이에 "," 사용 불가 "+" 써야함 
		
		//boolean	: true 또는 false
		//char		: 문자 하나
		//byte		: 아주작은수
		//short		: 작은수
		//int		: 일상적인 수
		//long		: 아주 큰 수
		//float		: 짧은 소수점
		//double	: 긴 소수점
		
		String g; //문자열을 저장할 수 있는 타입
		g="ABCDE";
		System.out.println(g);
	}
}
