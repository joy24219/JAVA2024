package _06_class.singleton.service;

import java.io.DataOutput;
import java.util.List;

import _06_class.singleton.BoardVo;
import _06_class.singleton.dao.BoardRepository;

public class BoardServiceImpl implements IBoardService {
	private BoardRepository dao = BoardRepository.getInstance();

	@Override
	public List<BoardVo> selectBoardList() {
		return dao.getboardList();
	}

}
