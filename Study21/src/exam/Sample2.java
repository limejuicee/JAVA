package exam;

public class Sample2 {
	public static void main(String[] args) {
		Student s=new Student("홍길동",50,6,70);
		System.out.println(s.name);
		s.show();
		System.out.println(s);
		
	}
}
//이름과 수학성적, 영어성적, 국어성적을 가질 수 있는 학생 객체를 만드려 한다
//Student 클래스를 제작하여 필드를 작성하시오

//생성자를 이용하여 이름을 입력할 수 있도록 마련하시오
//메서드를 제작해서 학생객체가 본인이 가지고 있는 점수와 이름을 출력하도록 제작하시오
class Student {
	String name;
	int math;
	int eng;
	int kor;
	//리턴타입이 적혀있지 않고 이름이 클래스와 똑같은 메서드처럼 생겼다
	void show() {
		System.out.println("이름 : "+name+" 수학 : "+math+" 영어 : "+eng+" 국어 : "+kor);
	}
	//오버라이드 : 기존에 있던 기능을 재정의해서 사용하는 기법
	//클래스 내부에 toString()을 재정의하면 객체를 출력시 주소가 아니라 해당 내용을 출력한다
	public String toString() {
		return "exam.Student@532760d8";
	}
	Student (String str) {
		name=str;
	}
	
	Student (String n, int a, int b, int c) {
		name=n; math=a; eng=b; kor=c;
	}
//	
//	Student () {
//	}
}