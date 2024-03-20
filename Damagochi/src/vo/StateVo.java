package vo;

import lombok.Data;
/** 상태구분테이블 **/


@Data
public class StateVo {
	 private int state_no;       //상태구분번호
	 private String state_name;  //상태구분명
	 private String state_note;  //상태구분설명
	 private String state_delyn; //상태삭제여부	 
}
