package vo;

import lombok.Data; 
/** 상호작용테이블 **/

@Data
public class InteractionVo {
	 private int int_no;      //상호작용번호
	 private String int_name; //상호작용명
	 private String int_note; //상호작용설명
}
