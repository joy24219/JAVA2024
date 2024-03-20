package vo;

import lombok.Data;
/**플레이중인 캐릭터 테이블**/

@Data
public class PlayingCharacterVo {
	 private int char_no;
	 private String char_name;
	 private int char_age;
	 private int char_full;
	 private int char_intimacy;
	 private int char_clean;
	 private int char_joy;
	 private int char_knowledge;
	 private int char_money;
	 private String char_delyn;
	 private int mem_no;
}
