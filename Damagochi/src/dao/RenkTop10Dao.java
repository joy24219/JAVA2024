package dao;

import java.util.List;

import util.JDBCUtil;
import vo.RenkTop10Vo;

public class RenkTop10Dao {
	private static RenkTop10Dao instance = null;

	private RenkTop10Dao() {

	}

	public static RenkTop10Dao getInstance() {
		if (instance == null) {
			instance = new RenkTop10Dao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<RenkTop10Vo> top10List() {
		String sql = "SELECT * FROM RENK_TOP10";
		return jdbc.selectList(sql,RenkTop10Vo.class);
	}
}
