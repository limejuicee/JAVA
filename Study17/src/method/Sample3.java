package method;

public class Sample3 {
	public static void main(String[] args) {
		//아래 Car 클래스를 객체로 조립
		Car c=new Car();
		Car d=new Car();
		int d_num;
		c.number=1234;
		d.number=5678;
		Data c_num=c.check();
		System.out.println("c차량 번호는 "+c_num);
		c.run();
		//new Car().run(); 객체를 변수에 담지 않고 바로 메서드를 실행하는 방법
		
	}
}
//method 메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작 ***
//	반드시 미리 클래스 내부에 작성되어 있어야 동작이 가능하다
//	제어문들은 메서드 내부에 작성되어 있어야 동작이 가능하다
//리턴타입 동작이름(){동작호출시 수행할 문장;}
//리턴타입 : 동작을 수행한 이후에 돌려주는 데이터의 형태
//	- 리턴타입이 void인 경우 : 동작의 실행결과 아무것도 반환하지 않는 경우
//	- 리턴타입이 void가 아닌 경우 : 동작의 실행결과 리턴타입에 해당하는 데이터를 반환하는 경우
//		==제작시 return 뒤에 반환할 데이터를 특정해서 알려줘야 한다
//		==리턴타입과 리턴되는 데이터의 타입과 해당 데이터를 저장할 변수의 타입이 일치해야 한다
//		==리턴되는 값을 반드시 사용해야 하는건 아니다
//		==리턴이 이루어지면 그 이후로는 다른 명령을 시킬 수 없다
class Car{
	int number; //차량번호
	void run() {
		System.out.println(number+"번 자동차가 움직입니다");
	}
	Data check() {
		System.out.println("차량번호를 검색합니다...");
		System.out.println("asdf");
		int[] arr= {number,100};
		return x;
		//System.out.println("return이 이루어지면 다른 명령은 시킬 수 없다");
	}
}
class Data{
	int a;
}