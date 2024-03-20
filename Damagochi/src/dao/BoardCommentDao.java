package dao;

import java.util.List;

import util.JDBCUtil;
import vo.BoardCommentVo;

public class BoardCommentDao {
	private static BoardCommentDao instance = null;

	private BoardCommentDao() {

	}

	public static BoardCommentDao getInstance() {
		if (instance == null) {
			instance = new BoardCommentDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<BoardCommentVo> commentList(List<Object> param) {
		String sql = "";
		if(param.size()==1)sql = "SELECT * FROM BOARD_COMMENT WHERE POST_NO = ?";
		if(param.size()==2)sql = "SELECT * FROM BOARD_COMMENT WHERE POST_NO = ? AND MEM_NO = ?";
		return jdbc.selectList(sql, param, BoardCommentVo.class);
	}
}
