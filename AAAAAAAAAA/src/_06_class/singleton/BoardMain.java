package _06_class.singleton;

public class BoardMain {
	public static void main(String[] args) {
		// 게시판 목록 데이터를 조회
		// 저장된 게시글 모두를 가져온다. 
		BoardController controller = new BoardController();
		controller.selectBoardList();
		
	}
}
