package vo;

import lombok.Data;
/**게시판구분테이블**/

@Data
public class BoardCategoryVo {
	 private int ctr_no;          //게시판구분번호
	 private String ctr_name;     //게시판구분명
	 private String ctr_note;     //게시판구분설명
	 private String ctr_delyn;    //삭제여부
	 private String ctr_readonly; //관리자외의 읽기만 가능한경우
	 
}
