package com.manipal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.manipal.dao.model.PlayerResultSetExtractor;
import com.manipal.serivice.Player;

public class PlayerDao implements PlayerDaoInterfae{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbeTemplate() {
		return jdbcTemplate;
	}

	public void setJdbeTemplate(JdbcTemplate jdbeTemplate) {
		this.jdbcTemplate = jdbeTemplate;
	}
	
	public int addPlayer(Player player) {
		String query="INSERT INTO USER VALUES(?,?,?,?,?,?)" ;
		int status= jdbcTemplate.update(query, player.getAthleteID(),player.getAthleteName(),player.getGender(),player.getCategory(),player.getEmail(), player.getNumber());
//			String query1=		"SELECT * FROM USER WHERE athleteName==player.getAthleteName() && gender==,player.getGender()&& category==player.getCategory() && email==player.getEmail() && number== player.getNumber()"  ;
//					=jdbcTemplate.query(query1, );
		return player.getAthleteID();
		
	}

	public List<Player> getAllPlayer() {
		String query= "SELECT * FROM USER";
		List<Player>  listPlayer= jdbcTemplate.query(query, new PlayerResultSetExtractor());
		return listPlayer;
	}
	 
	
}

//CREATE TABLE USER(`ATHLETE ID` INT ,`ATHLETE NAME` VARCHAR(25), GENDER VARCHAR(25), CATEGORY VARCHAR(25),EMAIL VARCHAR(25),MOBILE VARCHAR(25));