package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.BoardPostDao;
import vo.BoardPostVo;

public class BoardPostService {
	private static BoardPostService instance = null;

	private BoardPostService() {

	}

	public static BoardPostService getInstance() {
		if (instance == null) {
			instance = new BoardPostService();
		}
		return instance;
	}
	BoardPostDao boardPostDao = BoardPostDao.getInstance();

	public List<BoardPostVo> postList(List<Object> param) {
		return boardPostDao.postList(param);
	}

	public BoardPostVo post(List<Object> param) {
		return boardPostDao.post(param);
	}
	public List<Object> getPaging(Map<String, Integer> map) {
		int size = 5;
		if(map.containsKey("size")) size = map.get("size");
		int pageNo = 1;
		if (map.containsKey("page")) pageNo = map.get("page");
		// 1페이지 : 1+0*size = 1 시작
		// 2페이지 : 1+1*size = 6 11 21 등으로 시작
		int startNo = 1+(pageNo-1)*size ;
		// 1페이지 : 1*size = 5 10 20 등으로 끝
		int endNo = pageNo*size;
		List<Object> result = new ArrayList<Object>();
		result.add(endNo);
		result.add(startNo);
		return result;
	}


	
}
