package dao;

import java.util.List;

import util.JDBCUtil;
import vo.CharacterVo;
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

	public CharacterVo characterNew(List<Object> param) {
		String sql = "INSERT INTO CHARACTER (CHAR_NO, CHAR_NAME, MEM_NO) VALUES (SEQ_CHARACTER.nextval, ?, ? )";
		jdbc.update(sql, param);
		
		String sqlSel = "SELECT CHAR_NO FROM CHARACTER WHERE CHAR_NAME = ? AND MEM_NO = ?";
		return jdbc.selectOne(sqlSel,param,CharacterVo.class);
	}

	public void characterDelete(List<Object> param) {
		String sql = "UPDATE CHARACTER SET CHAR_DELYN = 'Y' WHERE CHAR_NO = ?";
		jdbc.update(sql, param);
	}

	public void characterUpDate(List<Object> param) {
		String sql = "UPDATE CHARACTER SET CHAR_NAME = ? WHERE CHAR_NO = ?";
		jdbc.update(sql, param);
		
	}

	
}
