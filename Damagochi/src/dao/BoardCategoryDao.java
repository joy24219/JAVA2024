package dao;

import java.util.List;

import util.JDBCUtil;
import vo.BoardCategoryVo;

public class BoardCategoryDao {
	private static BoardCategoryDao instance = null;

	private BoardCategoryDao() {

	}

	public static BoardCategoryDao getInstance() {
		if (instance == null) {
			instance = new BoardCategoryDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<BoardCategoryVo> boardList() {
		String sql = "SELECT CTR_NO, CTR_NAME, CTR_READONLY FROM BOARD_CATEGORY WHERE CTR_DELYN = 'N'";
		return jdbc.selectList(sql, BoardCategoryVo.class);
	}
	
}
