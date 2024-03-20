package vo;

import lombok.Data;

@Data
public class BoardCommentVo {
	 private int post_no;
	 private int no;
	 private String title;
	 private String brd_date;
	 private String mem_name;
	 private int mem_no;
	 private int ctr_no;
}
