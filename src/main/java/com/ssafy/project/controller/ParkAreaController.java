package com.ssafy.project.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.project.model.dto.Park;
import com.ssafy.project.model.service.ParkAreaService;

@Controller
@RequestMapping("/like")
@CrossOrigin(origins = {"*"})
public class ParkAreaController {
	@Autowired
	ParkAreaService parkAreaService;
	
	
	@ResponseBody
	@GetMapping("/park/{gugun}")
	public List<Park> getPark(@PathVariable String gugun) throws SQLException{
		List<Park> parkList = new ArrayList<Park>();
		
		parkList = parkAreaService.getPark(gugun);
		
		return parkList;
	}
}
