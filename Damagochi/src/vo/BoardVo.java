package vo;

import lombok.Data;
/**게시판테이블**/


@Data
public class BoardVo {
	 private int brd_no;        //게시글번호
	 private String brd_title;  //게시글제목
	 private String brd_content;//게시글내용
	 private String brd_date;   //게시글작성일자
	 private int brd_comment;   //게시글댓글여부
	 private String brd_delyn;  //게시글삭제여부
	 private int ctr_no;        //게시판구분번호
	 private int mem_no;        //회원번호
}
