package service;

import java.util.List;

import dao.BoardCommentDao;
import vo.BoardCommentVo;

public class BoardCommentService {
	private static BoardCommentService instance = null;

	private BoardCommentService() {

	}

	public static BoardCommentService getInstance() {
		if (instance == null) {
			instance = new BoardCommentService();
		}
		return instance;
	}
	BoardCommentDao boardCommentDao = BoardCommentDao.getInstance();

	public List<BoardCommentVo> commentList(List<Object> param) {
		return boardCommentDao.commentList(param);
	}
	
	
}
