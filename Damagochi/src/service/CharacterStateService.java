package service;

import java.util.List;

import dao.CharacterStateDao;

public class CharacterStateService {
	private static CharacterStateService instance = null;

	private CharacterStateService() {

	}

	public static CharacterStateService getInstance() {
		if (instance == null) {
			instance = new CharacterStateService();
		}
		return instance;
	}
	CharacterStateDao characterStateDao = CharacterStateDao.getInstance();

	public void characterStateNew(List<Object> param) {
		characterStateDao.characterStateNew(param);
	}
}
