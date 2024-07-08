package inter;

public class Sample1 {
	public static void main(String[] args) {
		//익명클래스 : 일시적으로 클래스와 동일 기능을 수행할 수 있는 이름이 없는 클래스를 생성
		//통상적으로 인터페이스가 구현된 클래스를 대용하거나, 추상클래스가 상속된 클래스를 대용할 때 사용
		//존재할리 없는 인터페이스의 생성자를 똑같이 적어준 뒤, {}사이에 추상메서드의 몸통까지 구현
		ITF itf=new ITF() {
			public void run() {
				
			}
		};
		Test t=new Test() {
			
		};
		t.method();
	}
}
//인터페이스 : 사용설명서
//interface 이름{}
//인터페이스로 객체를 생성할 수 없다
//필드 가질 수 없다. 상수를 가질 수 있다 (상수는 값을 바꿀 수 없다)
//메서드 가질 수 없다. 추상메서드는 가질 수 있다 (구현한 클래스는 몸통을 구현하여야 한다)
//생성자 없음 
interface ITF {
	int a=10;
	//public static final int a=10; int 앞부분이 생략됨
	void run();
}
interface INTER {
	void run();
}
//클래스에 해당 용도를 구현해서 사용
class Parent {
	
}
//인터페이스가 추상메서드를 가진 경우 해당 인터페이스를 구현한 클래스는
//반드시 추상 메서드의 몸통을구현하여야 한다. 이 때 public을 붙여야 한다
//인터페이스의 추상메서드는 추상클래스가 구현할 경우에는 몸통을 만들지 않아도 된다
abstract class Child extends Parent implements ITF,INTER{
	public void run() {
		
	}
}
class Test {
	void method() {
		System.out.println("실행성공");
	}
}
