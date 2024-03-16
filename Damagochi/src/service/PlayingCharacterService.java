package service;

import java.util.List;

import dao.PlayingCharacterDao;
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
}
