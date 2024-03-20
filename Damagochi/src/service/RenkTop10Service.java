package service;

import java.util.List;

import dao.RenkTop10Dao;
import vo.RenkTop10Vo;

public class RenkTop10Service {
	private static RenkTop10Service instance = null;

	private RenkTop10Service() {

	}

	public static RenkTop10Service getInstance() {
		if (instance == null) {
			instance = new RenkTop10Service();
		}
		return instance;
	}
	RenkTop10Dao renkTop10Dao = RenkTop10Dao.getInstance();

	public List<RenkTop10Vo> top10List() {
		return renkTop10Dao.top10List();
	}
}
