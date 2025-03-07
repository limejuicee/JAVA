package close;

import java.sql.*;	//Connection, Statement, ResultSet

public class Sample2 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String db_id="root";
		String db_pw="iotiot";
		//String sql="select * from student;";
		String sql="insert into student (name,kor,math,eng,sum)";
		sql+="values('이영준',50,50,50,150);";
		
		try {
			conn=DriverManager.getConnection(url, db_id, db_pw);
			stmt=conn.createStatement();
//			rs=stmt.executeQuery(sql);
			stmt.execute(sql);	//insert문은 resultset이 없다
			//Statement의 Query전송 메서드들, 용도에 따라 맞게 사용해야 한다
			//stmt.execute(sql);	return boolean; resultset의 존재여부에 따라 true false
			//stme.executeQuery(sql);	return resultset;	결과화면을 반환
			//stmt.executeUpdate(sql);	return int;	변화한 수를 반환
//			while(rs.next()) {
//				String num=rs.getString("num");
//				String name=rs.getString("name");
//				String kor=rs.getString("kor");
//				String math=rs.getString("math");
//				String eng=rs.getString("eng");
//				String sum=rs.getString("sum");
//				System.out.println(num+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+sum);
//			}
		}catch(Exception e) {
			System.out.println("접속 중 오류발생 : "+e);
		}finally {
			//회선 종료처리도 try-catch안에 제작해야함
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("접속 해제 중 오류발생 : "+ex);
			}
		}
	}
}
