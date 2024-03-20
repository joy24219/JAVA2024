package dao;

import java.util.List;

import util.JDBCUtil;

public class CharacterStateDao {
	private static CharacterStateDao instance = null;

	private CharacterStateDao() {

	}

	public static CharacterStateDao getInstance() {
		if (instance == null) {
			instance = new CharacterStateDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public void characterStateNew(List<Object> param) {
		String sql = "INSERT INTO CHARACTER_STATE VALUES (?, ?, 0)";
		jdbc.update(sql, param);
	}
}
