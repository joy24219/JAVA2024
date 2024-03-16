package vo;

import lombok.Data;
/**회원테이블**/

@Data
public class MemberVo {
	 private int mem_no;       //회원번호
	 private String mem_id;    //회원아이디
	 private String mem_pw;    //회원비밀번호
	 private String mem_name;  //회원이름
	 private String mem_telno; //회원연락처
	 private String mem_bir;   //회원생년월일
	 private int mem_money;    //회원보유머니
	 private String mem_admin; //회원관리자여부
	 private String mem_delyn; //회원탈퇴여부
}
