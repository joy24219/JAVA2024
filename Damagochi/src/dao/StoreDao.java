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
		String sql = "SELECT * FROM STORE WHERE STR_DELYN ='N' AND STR_COUNT >0 ORDER BY STR_NO";
		return jdbc.selectList(sql, StoreVo.class);
	}
	
	// 특별상점 아이템 추가
	public void insert(List<Object> param) {
		String sql = "INSERT INTO DEFAULT_SET (DEF_NO, DEF_NAME, DEF_AGE, DEF_MONEY, DEF_FULL, DEF_INTIMACY, DEF_CLEAN, DEF_JOY, DEF_KNOWLEDGE, DEF_CONTENT, DEF_COUNT, INT_NO,DEF_DELYN)\r\n"
				+ "VALUES (seq_default_set.NEXTVAL, ?, '00-10', ?, ? , ? , ? , ?, ?, ?,?,9,'N')";
		jdbc.update(sql, param);
	}

	// 특별상점 아이템 수정
	public void storeUpdate(int sel, List<Object> param) {
		String sql ="UPDATE DEFAULT_SET "
				+	" SET ";

		
		if (sel == 1 || sel == 2) {
		    sql += "DEF_NAME = ? , ";
		    sql += "DEF_CONTENT = ?";
		    if (sel == 1) sql += ", ";
		}
		if (sel == 1 || sel == 3) {
		    sql += "DEF_COUNT = ? , ";
		    sql += "DEF_MONEY = ? ";
		    if (sel == 1 && (sel != 4)) sql += ", ";
		}
		if (sel == 1 || sel == 4) {
		    sql += "DEF_FULL = ? , ";
		    sql += "DEF_INTIMACY = ? , ";
		    sql += "DEF_CLEAN = ? , ";
		    sql += "DEF_JOY = ? , ";
		    sql += "DEF_KNOWLEDGE = ? ";
		} 

		sql += "WHERE DEF_NAME = ?";

		jdbc.update(sql, param);

	}
	
	// 특별상점 아이템 삭제
	public void storeDelete(List<Object> param) {
		String sql = "UPDATE DEFAULT_SET\r\n"
				+ "SET DEF_DELYN ='Y'\r\n"
				+ "WHERE DEF_NAME = ? ";
		jdbc.update(sql, param);
	}
}
