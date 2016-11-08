package exam_01_composition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {

	// Database 처리만 나와요
	public ArrayList<BookEntity> selectAll(String keyword) {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<BookEntity> list = null;
		
		try {
			
			// 1. Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 데이터베이스 접속
			String url = "jdbc:mysql://localhost:3306/library";
			String id = "jQuery";
			String password = "jQuery";
			con = DriverManager.getConnection(url, id, password);
			
			// 3. PreparedStatement 생성(SQL을 가지고 있는)
			String sql = "SELECT bisbn, btitle, bauthor FROM book WHERE btitle LIKE ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			
			// 4. Query 실행
			rs = pstmt.executeQuery();
			
			// 5. 결과처리
			list = new ArrayList<BookEntity>();
			while(rs.next()){
				BookEntity entity = new BookEntity();
				entity.setBauthor(rs.getString("bauthor"));
				entity.setBisbn(rs.getString("bisbn"));
				entity.setBtitle(rs.getString("btitle"));
				
				list.add(entity);
			}
			
			
		} catch(Exception e){
			System.out.println(e);
		} finally {
			
			// 6. 사용한 resource 해제.
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2){
				
			}
		}
		
		return list;
	}

}
