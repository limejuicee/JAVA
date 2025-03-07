package cla;

public class Sample1 {
	public static void main(String[] args) {
		//class를 이용하려면 먼저 객체를 만들어야 한다.
		
		Student s;
		s=new Student();
		Student l;
		l=new Student();
		s.name="이영준";
		l.name="이승구";

		System.out.println(s.name);
		System.out.println(l.name);
		
		//메서드는 반드시 객체를 통해서 시켜야 한다
		String str;
		str=l.check();
		System.out.println(str+"님 성공하였습니다");
		l.study();
	}
}
//클래스	:	클래스는 필드, 메서드, 생성자를 가질 수 있다.
//메서드	:	클래스 내부에 작성되어 객체가 수행하는 동작
class Student{
	String name;	//학생의 이름을 저장할 공간
	int number;		//학생의 학번을 저장할 공간
	int kor;		//국어 성적을 저장할 공간
	int eng;		//영어 성적을 저장할 공간
	int math;		//수학 성적을 저장할 공간
	//메서드
	//리턴타입 이름(){동작이 실행되면 수행할 문장;}
	//한번 리턴이 이루어지면 그 이후로는 다른 명령을 시킬 수 없다
	String check() {	//출석체크를 하는 기능입니다
		System.out.println("지문을 체크합니다...");
		return name;
		//System.out.println("지문 체크 완료"); return이 실행되면 그 이후로는 다른 명령 불가
	}
	//리턴이 존재하지 않는 메서드의 경우 리턴타입 자리에 void 라고 적는다
	void study() {
		System.out.println("공부를 열심히 합니다");
	}
}