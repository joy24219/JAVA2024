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

	public void sing(List<Object> param) {
		String sql = "INSERT INTO MEMBER (mem_no, mem_id, mem_pw, mem_name, mem_telno, mem_bir, mem_money, mem_admin, mem_delyn) VALUES (SEQ_MEMBER.nextval, ?, ?, ?, ?, ?, 0, 'N', 'N')";
		jdbc.update(sql, param);
	}

	public MemberVo login(List<Object> param) {
		String sql = "SELECT mem_no, mem_id, mem_name, mem_telno, mem_bir, mem_money, mem_admin FROM MEMBER WHERE MEM_ID= ? AND MEM_PW = ? AND MEM_DELYN = 'N'";
		return jdbc.selectOne(sql, param, MemberVo.class);		
	}

	public MemberVo idChk(List<Object> param) {
		String sql = "SELECT mem_id FROM MEMBER WHERE mem_id = ?";
		return jdbc.selectOne(sql, param, MemberVo.class);
	}

	public MemberVo memberInfoUpDate(List<Object> param, int size) {
		String sql ="";
		if (size==5) sql = "UPDATE MEMBER SET mem_name = ?, mem_pw =?, mem_telno = ?, mem_bir = ? WHERE mem_no = ?";
		else if (size==4) sql = "UPDATE MEMBER SET mem_name = ?, mem_telno = ?, mem_bir = ? WHERE mem_no = ?";
		else if (size==2) sql = "UPDATE MEMBER SET MEM_MONEY = MEM_MONEY + ? WHERE mem_no = ?";
		jdbc.update(sql, param);
		
		Object no = param.get(param.size()- 1); // 마지막 항목을 가져오기 위해 param의 크기에서 1을 빼줍니다.
		param.clear();
		param.add(no);
		
		String sqlSel ="SELECT mem_no, mem_id, mem_name, mem_telno, mem_bir, mem_money, mem_admin FROM MEMBER WHERE MEM_NO= ? AND MEM_DELYN = 'N'";
		return jdbc.selectOne(sqlSel, param, MemberVo.class);
	}

	public MemberVo adminUpDate(List<Object> param) {
		String sql ="UPDATE MEMBER SET MEM_PW = ? WHERE MEM_NO = ?";
		jdbc.update(sql, param);
		
		Object no = param.get(param.size()- 1); // 마지막 항목을 가져오기 위해 param의 크기에서 1을 빼줍니다.
		param.clear();
		param.add(no);
		
		String sqlSel ="SELECT mem_no, mem_id, mem_name, mem_telno, mem_bir, mem_money, mem_admin FROM MEMBER WHERE MEM_NO= ? AND MEM_DELYN = 'N'";
		return jdbc.selectOne(sqlSel, param, MemberVo.class);
	}
}
