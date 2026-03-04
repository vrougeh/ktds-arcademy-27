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
	
	private DataAccessHelper dah;
	
	public ReplyDao(DataAccessHelper dah) {
		this.dah = dah;
	}
	
	
	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회 (대댓글 포함) - 계층조회
	
	public List<ReplyVO> readAllReply(String articleId){
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
		
		return result;
	}
	
	
	
	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
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
		return result;

	}
	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회 (대댓글 포함) - 계층조회
	public List<ReplyVO> readReplys(String replyId){
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
		return result;
	}
	
	
	
	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newReply) {
		dah.preparedStatement(ReplyQuery.makeInsertQuery(), (pstmt) -> {
			pstmt.setString(1, newReply.getboardId());
			pstmt.setString(2, newReply.gettopId());
			pstmt.setString(3, newReply.getContent());
		});
		dah.executeQuery(SQLType.INSERT, null);
		
	}
	
	// void 댓글 수정(ReplyVO)
	public void modifyReply(ReplyVO modifyReply) {
		dah.preparedStatement(ReplyQuery.makeUpdateQuery(), (pstmt) -> {
			pstmt.setString(1, modifyReply.getContent() );
			pstmt.setString(2, modifyReply.getId() );
		});
		dah.executeQuery(SQLType.UPDATE, null);
	}
	
	// void 댓글 삭제(댓글 아이디)
	public void deleteReply(String ReplyId) {
		dah.preparedStatement(ReplyQuery.makeDeleteQuery(), (pstmt) -> {
			pstmt.setString(1, ReplyId);
		});
		dah.executeQuery(SQLType.DELETE, null);
		
	}

}
