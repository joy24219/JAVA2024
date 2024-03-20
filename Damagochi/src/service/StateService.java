package service;

import java.util.List;

import dao.StateDao;
import vo.StateVo;

public class StateService {
	private static StateService instance = null;

	private StateService() {

	}

	public static StateService getInstance() {
		if (instance == null) {
			instance = new StateService();
		}
		return instance;
	}
	StateDao stateDao = StateDao.getInstance();

	public List<StateVo> stateList() {
		return stateDao.stateList();
	}
	
}
