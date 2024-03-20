package dao;

import java.util.List;

import util.JDBCUtil;

public class BoardDao {
	private static BoardDao instance = null;

	private BoardDao() {

	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public void postInsert(List<Object> param) {
		String sql ="";
		if(param.size()==4) sql = "INSERT INTO BOARD (BRD_NO, BRD_TITLE, BRD_CONTENT,CTR_NO,MEM_NO) VALUES (SEQ_BORAD.nextval, ? , ? , ? , ?)";
		if(param.size()==5) sql = "INSERT INTO BOARD (BRD_NO, BRD_TITLE, BRD_CONTENT,CTR_NO,MEM_NO, BRD_COMMENT) VALUES (SEQ_BORAD.nextval, ? , ? , ? , ?, ?)";
		jdbc.update(sql,param);
	}

	public void postUpDate(List<Object> param) {
		String sql ="UPDATE BOARD SET BRD_TITLE=?, BRD_CONTENT=?  WHERE CTR_NO =? AND MEM_NO=? AND BRD_NO = ?";
		jdbc.update(sql,param);
	}

	public void postDelect(List<Object> param) {
		String sql ="UPDATE BOARD SET BRD_DELYN='Y' WHERE BRD_NO = ?";
		jdbc.update(sql,param);
	}
}
