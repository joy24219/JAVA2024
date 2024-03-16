package vo;

import lombok.Data;
/** 앤딩구분테이블 **/

@Data
public class EndingVo {
	 private int end_no;      //앤딩번호
	 private int end_rank;    //앤딩등수 (랭킹에서 보는 우선순위)
	 private String end_name; //앤딩명
}
