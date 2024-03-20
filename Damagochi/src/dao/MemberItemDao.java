package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.MemberItemVo;
import vo.MemberVo;

public class MemberItemDao {
	private static MemberItemDao instance = null;

	private MemberItemDao() {

	}

	public static MemberItemDao getInstance() {
		if (instance == null) {
			instance = new MemberItemDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public void itemUpDate(List<Object> param) {
//		String sqlSel = "SELECT count(*) FROM member_item WHERE DEF_NO = ? AND MEM_NO = ?";
//		String sql="";
//		
//		Map<String, Object> resultMap = jdbc.selectOne(sqlSel, param);
//		int itemCount = ((Number) resultMap.get("COUNT(*)")).intValue();
//		
//		if(itemCount > 0) { 
//			sql = "INSERT INTO member_item (DEF_NO, MEM_NO, ITM_ID) VALUES (?,?,1)";
//		}else{
//			sql = "UPDATE member_item SET DEF_NO = ? , MEM_NO = ? , ITM_ID = ITM_ID+1";
//		}
//		jdbc.update(sql,param);
		
		String sqlSel = "SELECT count(*) FROM member_item WHERE DEF_NO = ? AND MEM_NO = ?";
	    String sql = "";

	    Map<String, Object> resultMap = jdbc.selectOne(sqlSel, param);
	    int itemCount = ((Number) resultMap.get("COUNT(*)")).intValue();

	    if (itemCount > 0) {
	        // 이미 해당 조건으로 레코드가 존재하는 경우, 해당 레코드를 업데이트합니다.
	        sql = "UPDATE member_item SET ITM_ID = ITM_ID + 1 WHERE DEF_NO = ? AND MEM_NO = ?";
	        jdbc.update(sql, param);
	    } else {
	        // 해당 조건으로 레코드가 존재하지 않는 경우, 새로운 레코드를 추가합니다.
	        sql = "INSERT INTO member_item (DEF_NO, MEM_NO, ITM_ID) VALUES (?, ?, 1)";
	        jdbc.update(sql, param);
	    }
	}
}
