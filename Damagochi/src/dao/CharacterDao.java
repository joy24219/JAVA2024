package dao;

import java.util.List;

import util.JDBCUtil;
import vo.CharacterVo;

public class CharacterDao {
	private static CharacterDao instance = null;

	private CharacterDao() {

	}

	public static CharacterDao getInstance() {
		if (instance == null) {
			instance = new CharacterDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	
}
