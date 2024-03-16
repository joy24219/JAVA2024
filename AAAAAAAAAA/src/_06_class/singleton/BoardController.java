package _06_class.singleton;

import java.util.List;

import _06_class.singleton.service.BoardServiceImpl;
import _06_class.singleton.service.IBoardService;

public class BoardController {
	private IBoardService service = BoardServiceImpl.getInstance();
	public void selectBoardList() {
		List<BoardVo> boardList =  service.selectBoardList();
		
		for(BoardVo board : boardList) {
			System.out.println("번호 : "+ board.getBoNo());
			System.out.println("제목 : "+ board.getBoTitle());
			System.out.println("작성자 : "+ board.getBoWriter());
			System.out.println("내용 : "+ board.getBoContent());
			System.out.println("작성일 : "+ board.getBoDate());
			System.out.println("조회수 : "+ board.getBoHit());
		}
	}
}
