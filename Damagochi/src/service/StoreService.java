package service;

import java.util.List;

import dao.StoreDao;
import vo.StoreVo;

public class StoreService {
	private static StoreService instance = null;

	private StoreService() {

	}

	public static StoreService getInstance() {
		if (instance == null) {
			instance = new StoreService();
		}
		return instance;
	}
	
    StoreDao storeDao = StoreDao.getInstance(); 
    
	public List<StoreVo> itemList() {
		return storeDao.itemList();
	}

	public void insert(List<Object> param) {
		storeDao.insert(param);
	}

	public void storeUpdate(int sel, List<Object> param) {
		storeDao.storeUpdate(sel, param);
	}

	public void storeDelete(List<Object> param) {
		storeDao.storeDelete(param);
	}
	
}
