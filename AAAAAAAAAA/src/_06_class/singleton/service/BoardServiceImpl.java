package _06_class.singleton.service;

import java.io.DataOutput;
import java.util.List;

import _06_class.singleton.BoardVo;
import _06_class.singleton.dao.BoardRepository;

public class BoardServiceImpl implements IBoardService {
	private BoardRepository dao = BoardRepository.getInstance();
	
	private static BoardServiceImpl instance = null;
	private BoardServiceImpl() {}
	public static BoardServiceImpl getInstance() {
		if (instance == null) {
			instance = new BoardServiceImpl();
		}
		return instance;
	}
	
	
	@Override
	public List<BoardVo> selectBoardList() {
		return dao.getboardList();
	}

}
