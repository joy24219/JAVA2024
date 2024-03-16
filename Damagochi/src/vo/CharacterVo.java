package vo;

import lombok.Data;
/**캐릭터 테이블**/


@Data
public class CharacterVo { 
	 private int char_no;       //캐릭터번호
	 private String char_name;  //캐릭터이름
	 private int char_age;      //캐릭터개월수(턴수)
	 private int char_full;     //캐릭터포만감상태
	 private int char_intimacy; //캐릭터친밀도상태
	 private int char_clean;    //캐릭터청결도상태
	 private int char_joy;      //캐릭터즐거움상태
	 private int char_knowledge;//캐릭터지식상태
	 private int char_money;    //캐릭터자본상태
	 private String char_delyn; //캐릭터삭제여부
	 private int mem_no;        //회원번호
}
