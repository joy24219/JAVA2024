package _06_class.singleton.dao;

import java.util.ArrayList;
import java.util.List;

import _06_class.singleton.BoardVo;

public class BoardRepository {

	//나자신에 인스턴스를 얻어올 수 있도록 변수로 선언 및 초기화를 해준다. 
	private static BoardRepository instance = null;
	//나자신을 생성자를 통해서 인스턴스를 만들지 못하게 한다. 
	private BoardRepository() {
		// 게시글 정보 1개를 초기화
		// boardVo 클래스 선언해서 게시글 정보 1개를 만들어준다.
		BoardVo boardVo = new BoardVo();
		boardVo.setBoNo(1);
		boardVo.setBoTitle("게시판 제목입니다.1");
		boardVo.setBoWriter("a001");
		boardVo.setBoContent("게시판 내용입니다.");
		boardVo.setBoDate("2024-03-13 20:19");
		boardVo.setBoHit(0);
		
		//게시판 1개의 정보를 List에 저장합니다.
		boardList.add(boardVo);
		
		
	}
	//나자신에 대한 인스턴스를 얻어올 수 있는 방법은 오로지 
	//메서드인 getInstance() 라는 메서드로만 가능하다!
	public static BoardRepository getInstance() {
		if(instance == null) {
			instance =  new BoardRepository();
		}
		return instance;
	}
	private List<BoardVo> boardList = new ArrayList<BoardVo>();
	
	//게시글 정보가 저장된 목록 데이터 전부를 조회합니다.
	public List<BoardVo> getboardList(){
		return boardList;
	}
	
	// 게시글 1개의 정보를 list 정보에 저장합니다.
	public void addBoard(BoardVo boardVo) {
		boardList.add(boardVo);
	}
}
