package exam;

import java.util.Scanner;

public class exam {
	public static void main(String[] args) {
		//make()에 매개변수를 두어 num~ber까지 반복하도록 변경하시오 
		int i=0;
		int num=2;
		int ber=8;
		//new 설계도이름()
		Test m=new Test();
		m.make(num,ber);
		/*for(i=num; i<101; i++) {
			System.out.println(i);
			if(i==ber) {break;}
		}*/
		//리턴타입이 void인 메서드를 Test내부에 제작하여
		//2~9사이의 숫자를 받아 해당 구구단의 단수를 출력하도록 제작하시오
		m.gugu(8);
		Scanner n;
		n=new Scanner(System.in);
		System.out.println("출력할 단 수 입력");
		int ddf=n.nextInt();
		m.gugu(ddf);
	}
}
//메서드 제작법
//리턴타입 이름(){}
class Test{
	void gugu(int dan) {
		int i;
		for(i=1; i<10; i++) {
			System.out.println(dan+"X"+i+" = "+(dan*i));
		}
	}
	String make(int num, int ber) {
		int i;
		for(i=num; i<=ber; i++) {
			System.out.println(i);
		}
		return "a";
	}
}