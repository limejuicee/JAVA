package test;

public class Test {
	public static void main(String[] args) {
		//구구단 가로쓰기
		//모양에 신경쓰지 말고 한줄씩 만들어 본다
		for(int a=0; a<10; a++) {
			for(int i=2; i<10; i++) {
				if(a==0) {
					System.out.print("["+i+"단]"+"\t");
				}else {
					System.out.print(i+"*"+a+"="+i*a+"\t");
				}
			}
			System.out.println();
		}
	}
}
