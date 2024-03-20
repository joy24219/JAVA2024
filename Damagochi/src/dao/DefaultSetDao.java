package dao;

import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.DefaultSetVo;

public class DefaultSetDao {
	private static DefaultSetDao instance = null;

	private DefaultSetDao() {
	
	}
	
	public static DefaultSetDao getInstance() {
		if (instance == null) {
			instance = new DefaultSetDao();
		}
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();

	public void defaultUpdate(int sel, List<Object> param) {
        String sql ="UPDATE DEFAULT_SET "
                + " SET ";
        sql += "DEF_NAME = ? , ";
        sql += "DEF_AGE = ? , ";
        sql += "DEF_MONEY = ? , ";
        sql += "DEF_FULL = ? , ";
        sql += "DEF_INTIMACY = ? , ";
        sql += "DEF_CLEAN = ? , ";
        sql += "DEF_JOY = ? , ";
        sql += "DEF_KNOWLEDGE = ? , ";
        sql += "INT_NO = ? ";
        sql += "WHERE DEF_NO = ?";

        jdbc.update(sql, param);
    }

	public List<DefaultSetVo> itemList(int intNo) {
        String sql = "SELECT * FROM DEFAULT_SET WHERE INT_NO = ? AND DEF_DELYN = 'N'";
        List<Object> param = new ArrayList<>();
        param.add(intNo);
        return jdbc.selectList(sql, param, DefaultSetVo.class);
    }

	public boolean itemUpDate(List<Object> param) {
		String sqlSel = "SELECT DEF_COUNT FROM DEFAULT_SET WHERE DEF_NO = ? ";
		DefaultSetVo chk= jdbc.selectOne(sqlSel, param, DefaultSetVo.class);
		
		String sql = "UPDATE DEFAULT_SET SET DEF_COUNT = DEF_COUNT - 1 WHERE DEF_NO = ? ";
		if(chk.getDef_count()>0) {
			jdbc.update(sql, param);
			return true;
		}else {
			return false;
		}
	}
}
