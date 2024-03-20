package service;

import java.util.List;

import dao.BoardDao;

public class BoardService {
	private static BoardService instance = null;

	private BoardService() {

	}

	public static BoardService getInstance() {
		if (instance == null) {
			instance = new BoardService();
		}
		return instance;
	}
	BoardDao boardDao = BoardDao.getInstance();

	public void postInsert(List<Object> param) {
		boardDao.postInsert(param);
	}

	public void postUpDate(List<Object> param) {
		boardDao.postUpDate(param);
	}

	public void postDelect(List<Object> param) {
		boardDao.postDelect(param);
	}
}
