package abs;

public class Sample3 {
	public static void main(String[] args) {
		ABS a=new Parent();
		a.number=15;
		a.test();
		ABS[] r=new ABS[3];
		r[0]=new Parent();
		r[1]=new Parent();
		r[2]=new Sample4();
		
		for(int i=0; i<r.length; i++) {
			r[i].plus();
		}
		
	}
}
//abstract class 이름{}
//추상클래스
//형태가 너무 추상적이라서 객체로 조립할 수 없는 '클래스'
//추상 클래스도 클래스 이므로 필드, 메서드, 생성자를 가질 수 있다
//상속을 통해 일반클래스에게 넘겨주기 위해 필드와 메서드를 가진다
//자식을 객체로 조립하면 부모의 생성자가 실행되는 기능을 구현하기 위해 생성자를 가진다
abstract class ABS{
	int number; //추상 클래스도 필드 가질 수 있다. 상속하지 않으면 사용 불가
	void test() {
		//추상 클래스도 메서드 가질 수 있다. 상속하지 않으면 사용 불가
		System.out.println("추상 클래스가 가진 일반 메서드");
	}
	ABS() {
		//추상 클래스도 생성자 가질 수 있다. 상속을 통해 자식을 객체로 조립하지 않으면 사용불가
		System.out.println("추상 클래스의 일반 생성자");
	}
	//추상 메서드
	//abstract 리턴타입 이름()
	//추상 클래스가 추상 메서드를 가진 경우 자식 클래스는 반드시 추상 메서드를 구체화 하여야 한다
	abstract void plus();
}
class Parent extends ABS{
	//추상 클래스는 객체로 조립될 수 없기 때문에 상속을 통해 자식클래스가 객체를 만들어서 이용한다
	void plus() {
		System.out.println("추상 메서드의 몸통을 구현한 일반 메서드");
	}
	
}
class Sample4 extends ABS {
	void plus() {
		System.out.println("Sample4 메서드");
	}
}