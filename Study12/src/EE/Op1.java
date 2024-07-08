package EE;

public class Op1 {
	public static void main(String[] args) {
		//비교연산자
		//	>= : 왼쪽이 오른쪽보다 크거나 같은지 확인
		//	<= : 왼쪽이 오른쪽보다 작거나 같은지 확인
		//	== : 왼쪽과 오른쪽이 동일한지 확인, 조건작성시 =로 쓰지 않도록 주의 ***
		//	!= : 왼쪽과 오른쪽이 다른지 확인
		int a=10;
		int b=5;
		boolean result=a!=b;
		System.out.println(result);
		
		//a와 b를 더한 값이 a와 b를 곱한 값보다 큰지 확인하여 결과를 result에 저장하고
		//이를 출력하시오
		int c=a+b;
		int d=a*b;
		result=c>d;
		System.out.println(result);
		
		String id="admin";
		String pw="1111";
		
		result=(id=="admin")&&(pw=="111");
		System.out.println(result);
		
		int number=7;
		
		//number가 3보다 작거나 5보다 큰지 확인하여 결과를 result에 저장하고
		//이를 출력하시오
		//number가 3보다 크고 6보다 작거나 같은지 확인하도록 아래 코드를 바꾸시오
		
		result= (number>3) && (number<=6);
		System.out.println(result);
	}
}
