package TC;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		//try-catch : 오류 발생시 해당 오류를 특수처리하여 다른 기능이 동작하도록 하는 문법
		//try{오류가 발생할 수 있는 문장;}catch(매개변수){특수처리의 내용;}
		//Connection 처리에서 반드시 사용하여야 한다 ***
		//공부용으로는 배열의 index 범위오류 또는 Scanner의 데이터타입 오류에 사용된다 
		System.out.println("작업을 시작합니다");
		try {
		int[] arr=new int[3];
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("모든 작업이 오류없이 진행되었습니다");
		
		Scanner sc=new Scanner(System.in);
//		int i;
		String str;
		System.out.println("반드시 숫자를 입력해주세요");
		try {
//		i=sc.nextInt();
		str=sc.next();
		} catch (Exception e) {
			System.out.println ("문자 적으면 동작 안합니다! "+e);
		}
	}
}
