package pack2;

import pack1.Data;

public class Sample1 {
	public static void main(String[] args) {
		Data d=new Data();
		//d.pri=10; private는 클래스를 벗어나면 사용할 수 없다
		//d.pro=20; protected는 패키지를 벗어나면 사용할 수 없다
		//d.def=30; default(아무것도 안적은것)는 패키지를 벗어나면 사용할 수 없다
		d.pub=40;	//public은 패키지를 벗어나도 사용할 수 있다
		System.out.println(d.pub);
	}
}
