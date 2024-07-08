package IF;

import java.util.*; //Scanner를 포함한 편의기능들이 다 들어있는 묶음

public class IF1 {
	public static void main(String[] args) {
		//if문	:	조건의 true, false 여부에 따라 실행을 결정하는 제어문
		//if(조건){조건이 true일 경우 수행할 문장;}
		//if문에 {}을 지정하지 않으면 ()뒤로 나오는 첫번째 ;까지를 자기의 {}범위로 본다
		int a=-5;
		
		System.out.println("if앞에 나온 부분은 조건과 무관합니다");
		if(a==3) {
			System.out.println("조건이 참이므로 실행합니다");
			System.out.println("명령이 여러개여도 수행합니다");
			a=25;
		}//if 끝
		System.out.println(a);
		
		//if문을 제작하여 변수a 내부의 값이 0보다 작으면
		//음수입니다를 출력하도록 작성하시오
		
		Scanner b;
		b=new Scanner(System.in);
		System.out.println("음수를 포함해서 숫자를 입력해주세요. 문자금지");
		a=b.nextInt();
		
		if(a<0) {
			System.out.println("음수입니다");
		}
		if(a>0) {
			System.out.println("양수입니다");
		}
	}//main 끝
}//class 끝
