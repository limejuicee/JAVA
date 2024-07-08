package exam;

public class Exam01 {
	public static void main(String[] args) {
		People[] school=new People[4];
		school[0]=new Student(15,"홍길동");
		school[1]=new Teacher(45,"김철수");
		school[2]=new Student(16,"왕건");
		school[3]=new Student(17,"이순신");
		for(int i=0; i<school.length; i++) {
			school[i].work();
		}
//		p.age=15;
//		p.name="김철수";
//		System.out.println(p.age);
//		System.out.println(p.name);
//		p.show();	//이거 헷갈렸음 -> void show() 까지 만들어놓고 어떻게 실행해야 되는지 몰랐음
	}
}

//이름이 People인 클래스를 제작하시오
//People 클래스는 나이를 저장할 수 있는 age필드와 이름을 저장할수 있는 name 필드를 가지고 있다
//People의 생성자를 제작하여 객체 생성시 age와 name의 값을 입력할 수 있도록 하시오
//People 내부에 void타입의 메서드를 제적하여 age와 name의 값을 출력하도록 제작하시오
//이름이 Student인 클래스를 만들어서 People을 상속받으시오
//Student 클래스 내부에 kor, eng, math 성적을 입력할 수 있는 필드를 제작하시오
//void 타입의 메서드 input을 제작하여 숫자 3개로 이루어진 배열을 매개변수로 받아
//각각의 필드에 입력하도록 제작하시오
//Student의 show메서드를 오버라이드 하여 점수까지 보이도록 수정하시오
//다음 상속이 성립하도록 Student를 수정하시오
//추상 클래스는 추상 메서드를 가질 수 있다
//클래스는 추상 메서드를 가질 수 없다
//추상 메서드를 가진 추상 클래스를 상속받은 일반 클래스는 반드시 추상 메서드의 몸통을 구현하여야 한다
//이름이 Teacher인 클래스를 제작하여 People을 상속 받으시오
//Teacher 클래스는 내부에 String subject필드를 가지고 있다
//abstract class가 abstract 메서드를 가진 경우
//이를 상속받은 class는 반드시 abstract 메서드의 몸통을 구현하여야 한다
abstract class People {
	int age;
	String name;

	People(int a,String b) {
		age=a; name=b;
	}
	void show() {
		System.out.println("이름 : "+age);
		System.out.println("나이 : "+name);
	}
	abstract void work();
}

class Student extends People {
	int kor;
	int eng;
	int math;
	
	Student(int a, String b) {
		super(a,b);
	};
	void input(int[] arr) {
		kor=arr[0];
		eng=arr[1];
		math=arr[2];
	};
	void show() {
		super.show();
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
	};
	void work() {		
		System.out.println("공부합니다");
	};
}
class Teacher extends People {
	String subject;
	void work() {
		System.out.println("수업합니다");
	};
	
	Teacher(int a, String b) {
		super(a, b);
	};
}