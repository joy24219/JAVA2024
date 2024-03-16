package dao;

import util.JDBCUtil;

public class DefaultSetDao {
	private static DefaultSetDao instance = null;

	private DefaultSetDao() {
	
	}
	
	public static DefaultSetDao getInstance() {
		if (instance == null) {
			instance = new DefaultSetDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();
}
