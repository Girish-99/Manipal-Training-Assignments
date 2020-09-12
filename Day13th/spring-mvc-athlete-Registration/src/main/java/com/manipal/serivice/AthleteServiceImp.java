package com.manipal.serivice;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.dao.PlayerDao;

public class AthleteServiceImp implements AthleteService {

	@Autowired
	PlayerDao playerDao;
	
	public int addPlayer(Player player) {
		int id= playerDao.addPlayer(player);
		return id;
	}

}
