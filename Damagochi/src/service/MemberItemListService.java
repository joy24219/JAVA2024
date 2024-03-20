package service;

import java.util.List;

import dao.MemberItemListDao;
import vo.MemberItemListVo;

public class MemberItemListService {
	private static MemberItemListService instance = null;

	private MemberItemListService() {

	}

	public static MemberItemListService getInstance() {
		if (instance == null) {
			instance = new MemberItemListService();
		}
		return instance;
	}
	MemberItemListDao memberItemListDao = MemberItemListDao.getInstance();

	public List<MemberItemListVo> itemList(List<Object> param) {
		return memberItemListDao.itemList(param);
	}
}
