package controller;

import java.util.HashMap;
import java.util.Map;

import util.ScanUtil;
import util.View;
import vo.MemberVo;
import vo.PlayingCharacterVo;

public class GameController {

	static public Map<String, Object> sessionStorage = new HashMap<>();
	
	public static void main	(String[] args) { new GameController().start();	}
	
	public static View gameStart() { return View.GAME_START; }
	
	private void start() {
		View view = View.HOME;
		while (true) {
			switch (view) {
			case GAME_START:
				view = game_start();
				break;
			default:
				break;
			}
		}
	}

	public static View game_start() {
		// TODO Auto-generated method stub
		
		MemberVo member = (MemberVo) sessionStorage.get("member");
		PlayingCharacterVo cha = (PlayingCharacterVo) sessionStorage.get("char");
		
		System.out.println(member.getMem_id());
		System.out.println(cha.getChar_name());
		
		
		ScanUtil.menu();
		
		return null;
	}
}
