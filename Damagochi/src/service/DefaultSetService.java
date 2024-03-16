package service;

import dao.DefaultSetDao;

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
	DefaultSetDao deffaultSetDao = DefaultSetDao.getInstance();
}
