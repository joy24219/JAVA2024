package service;

import java.util.List;

import controller.MainController;
import dao.MemberDao;
import util.JDBCUtil;
import vo.MemberVo;
import vo.SemesterVo;

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

	public boolean login(List<Object> paramList) {
		MemberVo mem = memberDao.login(paramList);
		if(mem == null) return false;
		MainController.sessionStorage.put("member", mem);
		return true;
	}

	public List<SemesterVo> semester() {
		return memberDao.semester();
		
	}
}
