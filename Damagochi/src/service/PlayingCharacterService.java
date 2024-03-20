package service;

import java.util.List;

import dao.PlayingCharacterDao;
import vo.CharacterVo;
import vo.PlayingCharacterVo;

public class PlayingCharacterService {
	private static PlayingCharacterService instance = null;

	private PlayingCharacterService() {

	}

	public static PlayingCharacterService getInstance() {
		if (instance == null) {
			instance = new PlayingCharacterService();
		}
		return instance;
	}
	PlayingCharacterDao playingCharacterDao = PlayingCharacterDao.getInstance();

	public List<PlayingCharacterVo> playGame(List<Object> param) {
		return playingCharacterDao.playGame(param);
	}

	public CharacterVo characterNew(List<Object> param) {
		return playingCharacterDao.characterNew(param);		
	}

	public void characterDelete(List<Object> param) {
		playingCharacterDao.characterDelete(param);
	}

	public void characterUpDate(List<Object> param) {
		playingCharacterDao.characterUpDate(param);
		
	}
}
