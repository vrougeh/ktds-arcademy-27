package com.ktdsuniversity.edu.board;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.BoardDao;
import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class TestMain {
	
	public static void main(String[] args) {
		//게시글 작성(DB 게시글 생성)
		BoardVO newArticle = new BoardVO();
		newArticle.setTitle("새로운 게시글입니다.");
		newArticle.setContent("새로운 게시글의 내용입니다.");
		
//		BoardDao boardDao = new BoardDao();
//		int insertCount = boardDao.createNewArticle(newArticle);
//		System.out.println(insertCount + "개의 게시글이 생성되었습니다.");
		
		BoardDao boardDao = new BoardDao();
		boardDao.createNewArticle2(newArticle);
		
		
		BoardVO modifyArticle = new BoardVO();
		modifyArticle.setId("BO-20260303-000006");
		modifyArticle.setTitle("제목이 수정되었습니다.");
		modifyArticle.setContent("내용이 수정되었습니다.");
		boardDao.modifyArticle(modifyArticle);
		
		
		
		boardDao.deleteArticle("BO-20260303-000003");
		
		
		
		//게시글 조회
		BoardVO article = boardDao.readArticle("BO-20260303-000007");
//		System.out.println(article);
		
		
		List<BoardVO> articleList = boardDao.readAllArticle();
		System.out.println(articleList);
		
		
		
		ReplyVO newTopReply = new ReplyVO();
		newTopReply.setboardId("BO-20260304-000016");
		newTopReply.settopId(null);
		newTopReply.setContent("test123456");
		
		ReplyVO newReply = new ReplyVO();
		newReply.setboardId("BO-20260304-000016");
		newReply.settopId("RP-20260304-000041");
		newReply.setContent("ASDFAS431");
		
		
		
		ReplyDao replyDao = new ReplyDao();
		replyDao.createNewReply(newTopReply);
		
		replyDao.createNewReply(newReply);
		
		
		ReplyVO modifyReply = new ReplyVO();
		modifyReply.setId("RP-20260304-000038");
		modifyReply.setContent("내용이 수정되었습니다.");
		replyDao.modifyReply(modifyReply);
		
		
		replyDao.deleteReply("RP-20260304-000004");
		
		
		
		ReplyVO reply = replyDao.readReply("RP-20260304-000001");
		System.out.println(reply);
		
		
		List<ReplyVO> replyList = replyDao.readAllReply("BO-20260304-000016");
		System.out.println(replyList);
		
		
		List<ReplyVO> replyList2 = replyDao.readReplys("RP-20260304-000001");
		System.out.println(replyList2);
	}

}
