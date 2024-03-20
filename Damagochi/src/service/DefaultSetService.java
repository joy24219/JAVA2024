package service;

import java.util.List;

import dao.DefaultSetDao;
import vo.DefaultSetVo;

public class DefaultSetService {
	private static DefaultSetService instance = null;

	private DefaultSetService() {

	}

	public static DefaultSetService getInstance() {
		if (instance == null) {
			instance = new DefaultSetService();
		}
		return instance;
	}
	DefaultSetDao defaultSetDao = DefaultSetDao.getInstance();

	public void defaultUpdate(int sel, List<Object> param) {
		defaultSetDao.defaultUpdate(sel, param);
		
	}

	public List<DefaultSetVo> itemList(int intNo) {
		return defaultSetDao.itemList(intNo);
	}

	public boolean itemUpDate(List<Object> param) {
		return defaultSetDao.itemUpDate(param);
	}
}
