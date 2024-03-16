package vo;

import lombok.Data;
/**초기값 테이블**/

@Data
public class DefaultSetVo {
	 private int def_no;        //초기값코드
	 private String def_name;   //선택지명
	 private String def_age;    //선택지나이제한
	 private int def_money;     //선택지금액
	 private int def_full;      //선택지포만감
	 private int def_intimacy;  //선택지친밀도
	 private int def_clean;     //선택지청결도
	 private int def_joy;       //선택지즐거움
	 private int def_knowledge; //선택지지식
	 private String def_content;//선택지설명
	 private int def_count;     //선택지재고 : 상호적용이 특수상점인 경우에만 사용
	 private int int_no;        //상호작용번호
}
