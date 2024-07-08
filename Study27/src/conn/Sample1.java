package conn;

import java.sql.*; //spl을 이용할 때 필요한 데이터 규격
public class Sample1 {
	public static void main(String[] args) {
		//jdbc가 있어야 데이터베이스와 통신이 가능
		Connection conn;	//접속회선
		Statement stmt;		//쿼리문을 전송하기 위한 규격
		ResultSet rs;		//select문의 결과를 받아오기 위한 규격
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";	//접속위치
		String db_id="root";						//접속 아이디
		String db_pw="iotiot";						//접속 비번
		String sql="select * from student;";
		
		try {
			conn=DriverManager.getConnection(url, db_id, db_pw);	//회선 가져옴
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("접속 이상 없음");
			boolean result;
			result=rs.next();
//			rs.next();	//한줄의 데이터를 읽어오는 명령어
			
			while (rs.next()) {
				String num=rs.getString(1);
				String name=rs.getString(2);
				String kor=rs.getString(3);
				String math=rs.getString(4);
				String eng=rs.getString(5);
				String sum=rs.getString(6);
				System.out.println(num+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+sum);
			}
		}catch(Exception e) {
			System.out.println("접속중 오류발생 : "+e);
		}
	}
}
