package service;

import java.util.List;

import dao.CharacterDao;
import vo.CharacterVo;

public class CharacterService {
	private static CharacterService instance = null;

	private CharacterService() {

	}

	public static CharacterService getInstance() {
		if (instance == null) {
			instance = new CharacterService();
		}
		return instance;
	}
	CharacterDao characterDao = CharacterDao.getInstance();

	
}
