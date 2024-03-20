package vo;

import lombok.Data;
/**캐릭터 상태 리스트(뷰) 테이블**/

@Data
public class CharacterStateVo {
	 private int char_no;
	 private int state_no; 
//	 private String char_name;
//	 private String state_name;
	 private int state_cnt;
}
