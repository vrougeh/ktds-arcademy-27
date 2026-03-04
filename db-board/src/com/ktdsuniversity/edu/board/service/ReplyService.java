package com.ktdsuniversity.edu.board.service;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

/**
 * 트랜잭션 처리
 */
public class ReplyService {
	
	private DataAccessHelper dah;
	private ReplyDao replyDao;
	
	public ReplyService(DataAccessHelper dah) {
		this.dah = dah;
		this.replyDao = new ReplyDao(dah);
	}
	
	
	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회 (대댓글 포함) - 계층조회
	
	public List<ReplyVO> readAllReply(String articleId){
		List<ReplyVO> result = this.replyDao.readAllReply(articleId);
		return result;
	}
	
	
	
	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
		ReplyVO result = this.replyDao.readReply(replyId);
		return result;
	}
	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회 (대댓글 포함) - 계층조회
	public List<ReplyVO> readReplys(String replyId){
		List<ReplyVO> result = this.replyDao.readReplys(replyId);
		return result;
	}
	
	
	
	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newReply) {
		try {
			this.replyDao.createNewReply(newReply);
			this.dah.commit();
		} catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
	
	// void 댓글 수정(ReplyVO)
	public void modifyReply(ReplyVO modifyReply) {
		try {
			this.replyDao.modifyReply(modifyReply);
			this.dah.commit();
		} catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
	
	// void 댓글 삭제(댓글 아이디)
	public void deleteReply(String ReplyId) {
		try {
			this.replyDao.deleteReply(ReplyId);
			this.dah.commit();
		} catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
}
