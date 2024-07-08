package cls;

public class Sample2 {
	public static void main(String[] args) {
		goods p1=new goods();
		goods p2=new goods();
		p1.name="의자";
		System.out.println(p1.name);
		System.out.println(p2.sale);
		
		//클래스는 설계도다
		//클래스는 필드, 메서드, 생성자를 가질 수 있다
		//필드는 클래스 내부에 작성되어 조립된 객체가 가지는 속성을 저장할 수 있는 공간
		//인스턴스 변수는 인스턴스를 거친 오브젝트를 통하지 않으면 접근할 수 없다
		//클래스는 설계도 이므로 조립하지 않으면 사용할 수 없고
		//클래스 내부에 만들어진 변수도 아직 조립되지 않은것이라 조립전에는 사용할 수 없다
		//만들어진 객체는 다른 객체에 영향을 미치지 않는다
	}
}
class Phone {
	String os;
	String name;
	String number;
	int battery;
}	
class goods {
	int price;		
	String category;
	String name;	
	boolean sale; 	//판매여부
	int qty; 		//재고량
	String text; 	//상품 설명
	String img;;	//이미지
}
class Shop{
	goods[] goods;
}