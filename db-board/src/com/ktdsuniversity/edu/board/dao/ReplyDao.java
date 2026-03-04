package com.ktdsuniversity.edu.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

/**
 * Dao : Data Access Object
 * - java에서 DB로 데이터 생성 ,수정 ,삭제 ,조회를 하기위한 클래스
 */
public class ReplyDao {
	
	
	
	
	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회 (대댓글 포함) - 계층조회
	
	public List<ReplyVO> readAllReply(String articleId){
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		try {
			List<ReplyVO> result = new ArrayList<>();
			dah.preparedStatement(ReplyQuery.makeSelectAllQuery(), (pstmt) -> {
				pstmt.setString(1, articleId);
			});
			dah.executeQuery(SQLType.SELECT, rs -> {
				ReplyVO eachReply = new ReplyVO();
				eachReply.setId(rs.getString("ID"));
				eachReply.setboardId(rs.getString("BOARD_ID"));
				eachReply.settopId(rs.getString("TOP_ID"));
				eachReply.setContent(rs.getString("CONTENT"));
				eachReply.setwriteDate(rs.getString("WRITE_DATE"));
				result.add(eachReply);
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
	
	
	
	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		try {
			ReplyVO result = new ReplyVO();
			dah.preparedStatement(ReplyQuery.makeSelectOneQuery(), (pstmt) -> {
				pstmt.setString(1, replyId);
			});
			dah.executeQuery(SQLType.SELECT, rs -> {
				result.setId(rs.getString("ID"));
				result.setboardId(rs.getString("BOARD_ID"));
				result.settopId(rs.getString("TOP_ID"));
				result.setContent(rs.getString("CONTENT"));
				result.setwriteDate(rs.getString("WRITE_DATE"));
				
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
	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회 (대댓글 포함) - 계층조회
	public List<ReplyVO> readReplys(String replyId){
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		try {
			List<ReplyVO> result = new ArrayList<>();
			dah.preparedStatement(ReplyQuery.makeSelectreplyQueryByReplyId(), (pstmt) -> {
				pstmt.setString(1, replyId);
			});
			dah.executeQuery(SQLType.SELECT, rs -> {
				ReplyVO eachReply = new ReplyVO();
				eachReply.setId(rs.getString("ID"));
				eachReply.setboardId(rs.getString("BOARD_ID"));
				eachReply.settopId(rs.getString("TOP_ID"));
				eachReply.setContent(rs.getString("CONTENT"));
				eachReply.setwriteDate(rs.getString("WRITE_DATE"));
				result.add(eachReply);
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
	
	
	
	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newReply) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			dah.preparedStatement(ReplyQuery.makeInsertQuery(), (pstmt) -> {
				pstmt.setString(1, newReply.getboardId());
				pstmt.setString(2, newReply.gettopId());
				pstmt.setString(3, newReply.getContent());
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
	
	// void 댓글 수정(ReplyVO)
	public void modifyReply(ReplyVO modifyReply) {
		
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		
		try {
			dah.preparedStatement(ReplyQuery.makeUpdateQuery(), (pstmt) -> {
				pstmt.setString(1, modifyReply.getContent() );
				pstmt.setString(2, modifyReply.getId() );
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
	
	// void 댓글 삭제(댓글 아이디)
	public void deleteReply(String ReplyId) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD","BOARD");
		try {
			dah.preparedStatement(ReplyQuery.makeDeleteQuery(), (pstmt) -> {
				pstmt.setString(1, ReplyId);
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

}
