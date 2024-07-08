package frame;

import java.awt.*;			//그림요소들이 들어있음
import java.awt.event.*;	//이벤트들이 들어있음

public class Sample01 extends Frame {
	Sample01() {
		//setTitle("화면만들기");
		super("이것도 가능");
		Button b=new Button("click"); //버튼 객체, Component
		b.setBounds(100,40,100,60);		//크기위치조절(X좌표, Y좌표, 너비, 높이)
		//객체.addActionListener 해당객체가 특정 동작에 반응하도록 설정
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("클릭이 수행되었습니다");
			}
		});
		
		add(b);				//생성된 Component객체를 Container에 연결하는 메서드
		setSize(300,300);	//크기조절(가로,세로)
		setLayout(null);	//화면 배치 규칙
		setVisible(true);	//화면이 눈에 보이도록 설정
	}
	public static void main(String[] args) {
		new Sample01();
	}
}
//Frame : 윈도우 창, 가장 큰 Container
//Component : 레이아웃에 배치될 수 있는 요소, 버튼, 문자, 그림 등
//Container : 요소들을 감쌀 수 있는 가상의 상자
//Panel : Container 내부에 배치되는 Container, Container 이자 Component의 역할 수행
//Layout : 화면 배치 규칙, 무규칙일 경우에만 자유 배치 가능