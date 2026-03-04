package com.ktdsuniversity.edu.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.query.BoardQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.BoardVO;

/**
 * Dao : Data Access Object
 * - java에서 DB로 데이터 생성 ,수정 ,삭제 ,조회를 하기위한 클래스
 */
public class BoardDao {
	
	public void deleteArticle(String ArticleId) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			dah.preparedStatement(BoardQuery.makeDeleteQuery(), (pstmt) -> {
				pstmt.setString(1, ArticleId);
			});
			dah.executeQuery(SQLType.DELETE, null);
			dah.commit();
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally {
			dah.close();
		}
	}
	
	
	
	public void modifyArticle(BoardVO modifyArticle) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			dah.preparedStatement(BoardQuery.makeUpdateQuery(), (pstmt) -> {
				pstmt.setString(1, modifyArticle.getTitle());
				pstmt.setString(2, modifyArticle.getContent());
				pstmt.setString(3, modifyArticle.getId());

			});
			dah.executeQuery(SQLType.UPDATE, null);
			dah.commit();
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally {
			dah.close();
		}
	}
	
	
	
	
	
	public void createNewArticle2(BoardVO newArticle) {
		
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			dah.preparedStatement(BoardQuery.makeInsertQuery(), (pstmt) -> {
				pstmt.setString(1, newArticle.getTitle());
				pstmt.setString(2, newArticle.getContent());
			});
			dah.executeQuery(SQLType.INSERT, null);
			dah.commit();
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally {
			dah.close();
		}
	}
	
	
	
	public int createNewArticle(BoardVO newArticle) {
		// 오래된 코드
		//1. ojdc11.jar 파일이 프로젝트에 존재하는지 확인.
		try {
			// oracle.jdbc.driver.OracleDriver 클래스를 불러온다
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			//oracle.jdbc.driver.OracleDriver를 찾지 못했을 때
			//실행되는 예외처리 블럭
			System.out.println("오라클 데이터 베이스에 접속하기 위한 라이브러리가 없습니다.");
			return 0;
		}
		
		//2. OracleDB에 접속 - 파이프 생성
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","BOARD","BOARD");
			//MANUAL COMMIT 으로 변경. - transaction
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("DB에 연결을 할 수 없습니다.");
			System.out.println("사유 : " + e.getMessage());
			return 0;
		}
		
		//3. INSERT Query 작성
		StringBuffer query = new StringBuffer();
		
		query.append(" INSERT INTO BOARD                                                             ");
		query.append("  (ID                                                                          ");
		query.append(" , TITLE                                                                       ");
		query.append(" , CONTENT                                                                     ");
		query.append(" , WRITE_DATE)                                                                 ");
		query.append(" VALUES                                                                        ");
		query.append("  ('BO-' || TO_CHAR(SYSDATE, 'YYYYMMDD-') || LPAD(SEQ_BOARD_PK.NEXTVAL,6,'0')  ");
		query.append(" , ?                                                                           ");
		query.append(" , ?                                                                           ");
		query.append(" , SYSDATE)                                                                    ");
		
		//3-1. ?에 데이터 할당하기 -- 파이프 생성
		PreparedStatement pstmt = null;
		try {
			pstmt = connection.prepareStatement(query.toString());
			pstmt.setString(1, newArticle.getTitle());
			pstmt.setString(2, newArticle.getContent());
		} catch (SQLException e) {
			//pstmt의 파이프가 만들어져 있는 상태에서 예외가 발생했다면
			//닫는다
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {}
			}
			
			//연결된 connection을 닫는다 - 파이프 제거
			try {
				connection.close();
			} catch (SQLException e1) {}
			
			// 데이터베이스와 연결이 끊어져 있을 떄
			// 작성된 쿼리의 내용이 잘못되었을 때
			System.out.println("쿼리 내용에 문제가 있습니다.");
			System.out.println("사유 : " + e.getMessage());
			return 0;
		}
		
		//4. INSERT Query 실행
		int insertCount = 0;
		try {
			insertCount = pstmt.executeUpdate();
			//commit 수행.
			connection.commit();
			return insertCount;
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {}
			
			//1. Insert 쿼리에 할당이 잘못 되었을 때(예> ?는 2개인데 할당한 데이터는 1개일 때
			//2. PK가 중복되었을 때
			//3. 컬럼의 타입과 INSERT 하는 값이 다를 때
			//4. 컬럼이 허용하는 최대길이보다 값의 길이가 더 클때
			System.out.println("쿼리 실행을 실패했습니다.");
			System.out.println("사유 : " + e.getMessage());
			return 0;
		} finally { //위의 try-catch가 어떻게 되든 연결을 끊어야함으로 finally 사용한다 순서는 만들어진 역순으로, return 전에 수행 후 return 사용됨
			try {
				pstmt.close();
			} catch (SQLException e) {}
			
			try {
				connection.close();
			} catch (SQLException e) {}
		}
	}
	
	public BoardVO readArticle(String articleId) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			//UPDATE > 조회수 1 증가
			dah.preparedStatement(BoardQuery.makeupdateViewCountQuery(), (pstmt) -> {
				pstmt.setString(1, articleId);
			});
			dah.executeQuery(SQLType.UPDATE, null);
			
			
			//SELECT > 게시글의 내용을 조회
			BoardVO result = new BoardVO();
			dah.preparedStatement(BoardQuery.makeSelectOneQuery(), (pstmt) -> {
				pstmt.setString(1, articleId);
			});
			dah.executeQuery(SQLType.SELECT, rs -> {
				result.setId(rs.getString("ID"));
				result.setTitle(rs.getString("TITLE"));
				result.setContent(rs.getString("CONTENT"));
				result.setViewCount(rs.getInt("VIEW_COUNT"));
				result.setWriteDate(rs.getString("WRITE_DATE"));
				result.setLatestModifyDate(rs.getString("LATEST_MODIFY_DATE"));
			});
			
			dah.commit();
			
			return result;
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally {
			dah.close();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	public List<BoardVO> readAllArticle() {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			//SELECT > 게시글의 내용을 조회
			List<BoardVO> result = new ArrayList<>();
			dah.preparedStatement(BoardQuery.makeSelectAllQuery(),null);
			dah.executeQuery(SQLType.SELECT, rs -> {
				BoardVO eachArticle = new BoardVO();
				eachArticle.setId(rs.getString("ID"));
				eachArticle.setTitle(rs.getString("TITLE"));
				eachArticle.setContent(rs.getString("CONTENT"));
				eachArticle.setViewCount(rs.getInt("VIEW_COUNT"));
				eachArticle.setWriteDate(rs.getString("WRITE_DATE"));
				eachArticle.setLatestModifyDate(rs.getString("LATEST_MODIFY_DATE"));
				result.add(eachArticle);
			});
			
			dah.commit();
			
			return result;
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally {
			dah.close();
		}
		
		return null;
	}
	
	
	
	
	
	

}