package pack3;

public class Sample3 {
	public static void main(String[] args) {
		//객체를 만들어서 상품명이랑 가격을 입련한 뒤
		//객체의 show()를 실행해서 출력하시오
		Product p=new Product();
		p.name="텀블러";
		p.price=20000;
		
		p.show(p);
		System.out.println(p.getName());
		
	}
}
class Product{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int price;
	
	public void setPrice(int price) {
		if(price<0) {
			System.out.println("잘못된 물건값을 입력하셨습니다. 0으로 초기화 합니다.");
		}else {
		this.price=price;
		}
	}
	void show() {
		System.out.println("상품명 : "+name+", 가격 : "+price);
	}
}