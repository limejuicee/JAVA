package singleton;

public class Start {
	public static void main(String[] args) {
		//singleton, 싱글톤 : 객체는 무조건 하나, 여러개가 생성되서는 안되고, 내용물은 고정, 변경불가
		//객체는 단 하나 변수 내부의 값은 무조건 3306로 고정
		A a1=new A();
		A a2=new A();	//이미 객체가 두개이상 생성 가능해졌으므로 싱글톤 실패
		a1.num=12345;	//변수 값을 변동 가능해졌으므로 싱글톤 실패
	
		//B b=new B();	생성자가 private이라 한개도 생성불가 == 프로그래밍 실패
		//System.out.println(B.num);	객체가 없으므로 필드의 내용물 고정할 뿐만 아니라 사용도 불가
		
		C c1=new C();
		C c2=new C();	//객체가 여러개가 생겨버리므로 싱글톤 불가
		C c3=new C();	//static으로 만든 변수를 사용하면 클래스 자체(class C)를 사용하는것으로 간주(?)
		c1.num=3308;
		System.out.println(c3.num);	//static 필드 이용시 내용물 일관성 확보 성공
		
//		D d=new D(); 생성자를 막았으므로 객체 생성 불가
		D d1=D.instance;	//객체를 단 하나만 만들어서 모두 균일하게 사용하게 만드는거 성공
		D d2=D.instance;
		System.out.println(d1);
		System.out.println(d2);
		D.instance=null;	//객체의 값을 마음대로 변경해버리는 문제는 유지, 싱글톤 실패
		System.out.println(D.instance);
		
//		E e1=new E(); 		생성자를 막았으므로 객체 생성 불가
//		E e=E.instance;		private으로 필드를 막았으므로 필드 사용불가
		E e=E.getInstance();
//		E.instance=null;	개발자가 setter를 제작해주지 않는 이상 값 변경 불가
	}
}
class A{
	int num=3306;
}

class B{
	int num=3306;
	private B() {
		
	}
}

class C{
	static int num=3306;
	
}

class D{
	int num=3306;
	static D instance=new D();
	private D() {
		
	}
}
class E{
	int num=3306;
	private static E instance=new E();
	private E() {
		
	}
	public static E getInstance() {
		return instance;
	}
}