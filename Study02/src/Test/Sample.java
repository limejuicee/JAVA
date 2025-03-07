package Test;

public class Sample {
	public static void main(String[] args) {
		/*
		변수 : 데이터를 담을 수 있는 상자
		변수상자에는 데이터를 바꿔 담을 수 있다
		변수상자 내부에는 하나의 데이터만 들어갈 수 있다
		변수상자의 이름이 중요한데,
		중복되는 이름은 사용할 수 없다
		
		변수 제작법 :
		타입 이름;
		*/
		int a;
		a=1000;
		System.out.println(a);
		a=1500;
		System.out.println(a);
		int b;
		b=500;
		System.out.println(a-b);
		System.out.println(a*b);
		//변수 작명규칙
		//1. 변수의 이름은 숫자로 시작할 수 없다
		//		중간이나 끝에는 가능
		//2. 이름에는 띄어쓰기를 사용할 수 없다
		//3. 특수문자는 $_ 두가지만 이름에 사용할 수 있다
		//4. 사용중인 이름은 중복으로 사용할 수 없다
		//5. 대문자와 소문자를 엄격히 구분한다.
		
		//작명 권장사항
		//1. 파스칼표기법 : 모든단어의 첫문자를 대문자로 표기
		//				 JavaHtmlCss, 클래스명 표기시 사용
		//2. 카멜표기법 : 두번째 단어부터 첫문자를 대문자로 표기
		//				javaHtmlCss, 동작(메서드)이름 표기시 사용
		//3. 팟홀표기법 : 띄어쓰기 대신 _를 사용
		//				java_html_css, 변수이름 표기시 사용
	}

}
