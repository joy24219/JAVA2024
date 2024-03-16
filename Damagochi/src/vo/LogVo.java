package vo;

import lombok.Data;
/**로그테이블**/


@Data
public class LogVo {
	 private int log_no;  //로그번호
	 private int log_age; //해당개월수(턴수)
	 private int def_no;  //선택지코드(초기값코드)
	 private int char_no; //캐릭터번호
}
