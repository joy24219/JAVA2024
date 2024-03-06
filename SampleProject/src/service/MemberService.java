package service;

import java.util.List;
import java.util.Map;

import controller.MainController;
import dao.MemberDao;

public class MemberService {
	private static MemberService instance = null;

	private MemberService() {

	}

	public static MemberService getInstance() {
		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
		
		
	}
	
	MemberDao memberDao = MemberDao.getInstance(); 
	
	public List<Map<String, Object>> memberList(List<Object> param){
		return memberDao.memberList(param);
	}

	public boolean login(List<Object> param) {
		Map<String, Object> map = memberDao.login(param);
		if(map == null || map.isEmpty()) {
			return false;
		}else {
			MainController.sessionStorage.put("member",map);
			return true;
		}	
	}
}
