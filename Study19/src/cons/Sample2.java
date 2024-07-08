package cons;

public class Sample2 {
	public static void main(String[] args) {
	Test a;
	a=new Test(1);
	System.out.println(a.name);
	}
}
//클래스는 필드, 메서드, 생성자를 가질 수 있다 ***
class Test {
	//생성자 : 객체를 생성하는 동작
	//생성자는 따로 제작하지 않아도 클래스 내부에 자동으로 만들어져 있다 (눈에 보이지 않는다)
	//생성자를 통해 다른 동작을 수행하고자 한다면 별도로 생성자를 만들어줘야 한다
	//클래스이름() {객체 생성시 수행할 동작;}
	//생성자는 객체 생성시 무조건 단 한번 실행된다 ***
	//생성자 오버로드가 중요함 ***
	String name;
	Test(String str) {
		System.out.println("나무 책상 조립");
		name=str;
	}
	Test(int num) {
		System.out.println("철 책상 조립");
		name="하이퍼 데스크";
	}
}