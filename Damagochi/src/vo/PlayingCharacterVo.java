package vo;

import lombok.Data;
/**플레이중인 캐릭터 테이블**/

@Data
public class PlayingCharacterVo {
	 private int play_no;
	 private String play_name;
	 private int play_age;
	 private int play_full;
	 private int play_intimacy;
	 private int play_clean;
	 private int play_joy;
	 private int play_knowledge;
	 private int play_money;
	 private String play_delyn;
	 private int mem_no;
}
