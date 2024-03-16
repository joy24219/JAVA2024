package dao;

import java.util.List;

import util.JDBCUtil;
import vo.PlayingCharacterVo;

public class PlayingCharacterDao {
	private static PlayingCharacterDao instance = null;

	private PlayingCharacterDao() {

	}

	public static PlayingCharacterDao getInstance() {
		if (instance == null) {
			instance = new PlayingCharacterDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<PlayingCharacterVo> playGame(List<Object> param) {
		String sql = "SELECT * FROM PLAYING_CHARACTER WHERE MEM_NO = ?";
		return jdbc.selectList(sql, param, PlayingCharacterVo.class);
	}

	
}
