package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.PlayerDao;
import com.manipal.serivice.AthleteServiceImp;
import com.manipal.serivice.Player;

@Controller
public class AthleteController {
	@Autowired
	PlayerDao playerDao;
	
	@Autowired
	AthleteServiceImp athleteServiceImp;
	
	@RequestMapping( value="/addPlayer", method = RequestMethod.GET)
	public String addPlayer() {
		return "athleteForm";
	}
	
	@RequestMapping( value="/playerAdded", method = RequestMethod.POST)
	public ModelAndView addMessage(@ModelAttribute Player player) {
//		player.setAthleteID(Player.count++);
		int id=athleteServiceImp.addPlayer(player);
		
		return new ModelAndView("addMessage", "athleteId" ,id );
	}
	
	@RequestMapping(value="/showPlayer")
	public ModelAndView showPlayer() {
		List<Player> listPlayer= playerDao.getAllPlayer();
		return new ModelAndView("displayPlayer", "listPlayer",listPlayer  );
	}

}
