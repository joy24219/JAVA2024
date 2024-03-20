package service;

import java.util.List;

import dao.BoardCategoryDao;
import vo.BoardCategoryVo;

public class BoardCategoryService {
	private static BoardCategoryService instance = null;

	private BoardCategoryService() {

	}

	public static BoardCategoryService getInstance() {
		if (instance == null) {
			instance = new BoardCategoryService();
		}
		return instance;
	}
	BoardCategoryDao boardCatecoryDao = BoardCategoryDao.getInstance();

	public List<BoardCategoryVo> boardList() {
		return boardCatecoryDao.boardList();
	}
	
	
	
}
