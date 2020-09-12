package com.manipal.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.manipal.serivice.Player;

public interface PlayerDaoInterfae {

	public JdbcTemplate getJdbeTemplate();
	public void setJdbeTemplate(JdbcTemplate jdbeTemplate);
	public int addPlayer(Player player);
	public List<Player> getAllPlayer();
}
