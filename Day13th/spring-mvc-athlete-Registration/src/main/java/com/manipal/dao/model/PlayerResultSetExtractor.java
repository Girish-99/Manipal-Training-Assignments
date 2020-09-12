package com.manipal.dao.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.serivice.Player;

public class PlayerResultSetExtractor implements ResultSetExtractor<List<Player>> {

	public List<Player> extractData(ResultSet rs) throws SQLException, DataAccessException {


		List<Player> listPlayer= new ArrayList<>();
		while(rs.next()) {
			Player player= new Player();
			player.setAthleteID(rs.getInt(1));
			player.setAthleteName(rs.getString(2));
			player.setGender(rs.getString(3));
			player.setCategory(rs.getString(4));
			player.setEmail(rs.getString(5));
			player.setNumber(rs.getString(6));
			
			listPlayer.add(player);
			
		}
		return listPlayer;
	}

}
