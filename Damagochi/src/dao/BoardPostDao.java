package dao;

import java.util.List;

import util.JDBCUtil;
import vo.BoardPostVo;

public class BoardPostDao {
	private static BoardPostDao instance = null;

	private BoardPostDao() {

	}

	public static BoardPostDao getInstance() {
		if (instance == null) {
			instance = new BoardPostDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<BoardPostVo> postList(List<Object> param) {
		String sql ="SELECT substr(title,1,20)||'...' title, brd_date, MEM_NAME, NO FROM BOARD_POST WHERE CTR_NO = ? ORDER BY NO DESC";
		return jdbc.selectList(sql, param, BoardPostVo.class);
	}

	public BoardPostVo post(List<Object> param) {
		String sql ="SELECT * FROM BOARD_POST WHERE NO = ? ORDER BY NO DESC";
		return jdbc.selectOne(sql, param, BoardPostVo.class);
	}
	
}
