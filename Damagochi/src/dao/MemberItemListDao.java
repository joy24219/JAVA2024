package dao;

import java.util.List;

import util.JDBCUtil;
import vo.MemberItemListVo;

public class MemberItemListDao {
	private static MemberItemListDao instance = null;

	private MemberItemListDao() {

	}

	public static MemberItemListDao getInstance() {
		if (instance == null) {
			instance = new MemberItemListDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public List<MemberItemListVo> itemList(List<Object> param) {
		String sql = "SELECT * FROM MEMBER_ITEM_LIST WHERE MEM_NO = ? AND COUNT > 0";
		return jdbc.selectList(sql, param, MemberItemListVo.class);
	}
	
}
