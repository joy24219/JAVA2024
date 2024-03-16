package vo;

import lombok.Data;
/**게시판구분테이블**/

@Data
public class BoardCatecoryVo {
	 private int ctr_no;      //게시판구분번호
	 private String ctr_name; //게시판구분명
	 private String ctr_note; //게시판구분설명
}
