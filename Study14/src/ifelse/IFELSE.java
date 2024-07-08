package ifelse;

public class IFELSE {
	public static void main(String[] args) {
		/* if(조건1) {
		 	조건이 true일 경우 수행할 문장;
		  }else if(조건2){
		  	조건1이 false이고 조건2가 true일 경우 수행할 문장;
		  	}else {
		  		위쪽에 나온 모든 조건이 거짓일 경우 수행되는 문장;
		  	}
	  	*/
		//조건 : 계산의 결과가 true 또는 false로 나오는 것
		// *** if-else-if문의 조건은 위에서부터 순서대로 판단하고,
		// 하나라도 true가 나오는 순간 그 아래는 무시한다
		// 조건은 좁은 범위부터 차차 넓어지도록 작성하지 않으면 아래쪽이 실행되지 않는다 ***
		int score=93;
		if(score>95) {
			System.out.println("A+학점입니다");
		}else if(score>90) {
			System.out.println("A학점입니다");
		}else {
			System.out.println("F학점입니다");
		}
	}
}
