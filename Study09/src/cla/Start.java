package cla;
	
public class Start {
	public static void main(String[] args) {
		Student a=new Student();
		/*a.number=1;
		a.name="이승구";
		a.phone="010-0000-0000";
		
		Student b=new Student();
		b.number=2;
		b.name="고희선";
		b.phone="010-0000-0001";
		a.name="별이";
		System.out.println("이름:"+a.name);
		System.out.println("이름:"+b.name);*/
		/*2 System.out.println(a.number);
		System.out.println(a.name);
		System.out.println(a.phone);
		System.out.println(a.check); 2*/
		Student.jjajang=4;
		System.out.println(Student.jjajang);
	}

}
class Student{
	int number;   //학번을 저장할 공간
	String name;  //이름을 저장할 공간
	String phone; //연락처를 저장할 공간
	boolean check; //출석여부를 저장할 공간
	static int jjajang;
}
