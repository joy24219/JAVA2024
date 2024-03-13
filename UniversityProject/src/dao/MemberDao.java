package dao;

import java.util.List;

import util.JDBCUtil;
import vo.MemberVo;

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

	public MemberVo login(List<Object> paramList) {
		String sql ="SELECT MEM_NO, MEM_ID, MEM_NAME, MEM_BIR, MAJ_NO, SORT_NO FROM YJ_MEMBER WHERE MEM_DELYN = 'N' AND MEM_ID = ? AND MEM_PW = ?";
		return jdbc.selectOne(sql, paramList, MemberVo.class);
	}
	
	
}
