package dao;

import java.util.List;

import util.JDBCUtil;
import vo.StoreVo;

public class StoreDao {
	private static StoreDao instance = null;

	private StoreDao() {

	}

	public static StoreDao getInstance() {
		if (instance == null) {
			instance = new StoreDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<StoreVo> itemList() {
		String sql = "SELECT * FROM STORE";
		return jdbc.selectList(sql, StoreVo.class);
	}
}
