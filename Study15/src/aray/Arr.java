package aray;

public class Arr {
	public static void main(String[] args) {
		//배열 : array, 여러개의 값을 저장할 수 있는 규격
		//타입[] 이름=new 타입[칸수];
		//배열은 몇칸으로 만들지 먼저 지정해 주어야 한다
		//***배열의 번호(index)는 0번부터 시작하기 때문에 칸수-1 까지만 있다
		//배열 칸수는 배열이름.length를 통해 확인할 수 있다 
		int[] a;
		a=new int[5];
		a[0]=12;
		a[1]=25;
		a[2]=30;
		a[3]=99;
		a[4]=50;
		int[] b= {100,80,60,10,50,25}; //값이 특정된 상태로 배열을 바로 초기화하는 방법
		
		System.out.println("a배열칸수는 "+a.length);
		System.out.println("b열칸수는 "+b.length);
		
		//*** 배열 내부의 데이터를 전부 출력하는 반복문
		
		/*
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]); 
		}
		*/
		
		for(int i=0; i<b.length; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		System.out.println(a);
	}
}
