package vo;

import lombok.Data;
/**포스트 (뷰)테이블**/


@Data
public class BoardPostVo {
	 private int no;
	 private String title;
	 private String content;
	 private String brd_date;
	 private String mem_name;
	 private int mem_no;
	 private int ctr_no;
}
