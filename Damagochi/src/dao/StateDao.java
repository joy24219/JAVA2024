package dao;

import java.util.List;

import util.JDBCUtil;
import vo.StateVo;

public class StateDao {
	private static StateDao instance = null;

	private StateDao() {

	}

	public static StateDao getInstance() {
		if (instance == null) {
			instance = new StateDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<StateVo> stateList() {
		String sql = "SELECT STATE_NO, STATE_NAME FROM STATE WHERE STATE_DELYN = 'N'";
		return jdbc.selectList(sql,StateVo.class);
	}

	
	
}
