package vo;

import lombok.Data;
/**앤딩로그테이블**/


@Data
public class EndingLogVo {
	 private int endlog_no;      //앤딩로그번호
	 private int endlog_score;   //앤딩에 대한 총점
	 private String endlog_date; //앤딩일시
	 private int end_no;         //앤딩번호
	 private int char_no;        //캐릭터번호
}
