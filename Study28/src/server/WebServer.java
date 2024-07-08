package server;

import java.net.*;
import java.io.*;

public class WebServer {
	public static void main(String[] args) {
		try {
			ServerSocket srvr=new ServerSocket(1234);
			System.out.println("서버정보 : "+srvr.getInetAddress().getLocalHost());
			System.out.println("클라이언트 접속 대기중...");
			while(true) {
				Socket socket=srvr.accept();
				System.out.println("클라이언트 접속 확인");
				BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				String s;
				while((s=in.readLine())!=null) {
					System.out.println(s);
					if(s.isEmpty()) {
						break;
					}
				}
				//출력부분
				out.write("HTTP/1.0 200 OK\r\n");
				out.write("Content-Type:text/html\r\n");
				out.write("\r\n");
				out.write("<meta charset='utf-8'>");
				out.write("<title>제목</title>");
				out.write("<h1>접속을 환영합니다</h1>");
				out.close();
				in.close();
				socket.close();
			}
		}catch(Exception e) {
			System.out.println("서버 가동 중 오류발생 : "+e);
		}
	}
}
