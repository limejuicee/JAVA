package EE;

public class Op2 {
	public static void main(String[] args) {
		//논리 연산자 : true, false를 가지고 true, fasle를 계산하는 연산자
		// && :	~이고 ~이다, 앞과 뒤의 조건이 모두 true인 경우만 true
		// || : ~이거나 ~이다, 앞과 뒤의 조건 중 하나라도 true인 경우 true
		// & | 한개만 적으면 전혀 다른 연산자이니 주의 ***
		boolean result;
		result=true||true;
		System.out.println(result);
		/*
		 true	&&	true	true
		 true	&&	false	false
		 false	&&	true	false
		 false	&&	false	false
		 
		 true	||	true	true
		 true	||	false	true
		 false	||	true	true
		 false	||	false	false
		 */
	}
}
