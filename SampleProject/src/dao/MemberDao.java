package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDao {
	private static MemberDao instance = null;

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		if (instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> memberList(List<Object> param){
		String sql = "SELECT MEM_ID, MEM_NAME, MEM_MAIL, MEM_JOB, MEM_LIKE FROM MEMBER WHERE MEM_LIKE LIKE ?";
		return jdbc.selectList(sql, param);
	}

	public Map<String, Object> login(List<Object> param) {
		String sql ="SELECT *\r\n" + 
					"FROM MEMBER\r\n" + 
					"WHERE MEM_ID =?\r\n" + 
					"AND MEM_PASS =?";
		return jdbc.selectOne(sql, param);
		
	}
}
