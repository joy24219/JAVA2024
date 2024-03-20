package service;

import java.util.List;

import dao.MemberItemDao;

public class MemberItemService {
	private static MemberItemService instance = null;

	private MemberItemService() {

	}

	public static MemberItemService getInstance() {
		if (instance == null) {
			instance = new MemberItemService();
		}
		return instance;
	}
	
	MemberItemDao memberItemDao = MemberItemDao.getInstance();

	public void itemUpDate(List<Object> param) {
		memberItemDao.itemUpDate(param);
	}
}
