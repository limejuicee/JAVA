package test;

public class Test1 {
	public static void main(String[] args) {
		//for문을 이용해서 1~10까지 순서대로 출력하시오
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
	
		/*
		 
		 * 
		 **
		 ***
		 ****
		 *****
		 위 모양을 for문을 이용하여 제작하시오
		 */
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		String star="*";
		for(int a=0; a<5; a++) {
			System.out.println(star);
			star+="*";
		}
		//for문을 구구단을 만들어 봅시다
		//2~9단까지 반복을 해야함
		for(int i=1; i<10; i++) {
			System.out.println(i+"단");
			for(int k=1; k<10; k++) {
				System.out.println((i+1)+"X"+k+"="+i*k);
			}
		}
		int i=1;
		int k=1;
		for(i=2; i<10; i++) {
			System.out.print("["+i+"단]"+"\t");
		}
		System.out.println("");
		for(i=1; i<10; i++) {
			for(k=2; k<10; k++) {
				System.out.print(k+"*"+i+"="+i*k+"\t");
			}
			System.out.println("");
		}
	}
}
