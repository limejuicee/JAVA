package method;

public class Method {
	public static void main(String[] args) {
		Car c=new Car();
		int number=c.data(10, 20);
		System.out.println("받아온 데이터 "+number);
	}//main 끝
}//class Method 끝
class Car{
	//메서드 : 설계도에 작성되어 객체가 수행하는 동작
	//리턴타입 동작명(){수행할 동작;}
	//리턴타입이 void가 아닌 모든 동작은 return 뒤에 해당 데이터를 적어서 특정해줘야함
	void run() {
		System.out.println("동작 확인!");
	}//method run 끝
	int data(int a, int b) {
		return a+b;
	}//int data 끝
}//class car 끝