package com.ssafy.project.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.project.model.dto.BaseAddress;
import com.ssafy.project.model.dto.HouseDeal;
import com.ssafy.project.model.dto.HousePageBean;
import com.ssafy.project.model.service.HouseService;

@RestController
@RequestMapping("/main")
@CrossOrigin(origins = {"*"})
public class MainRestController {
	
	@Autowired
	HouseService houseService;
	
	@RequestMapping("/gugun")
	public List<String> getGu() throws SQLException{
		return houseService.getGu();
	}
	
	@RequestMapping("/dong/{gugun}")
	public List<String> getDong(@PathVariable String gugun) throws SQLException{
		return houseService.getDong(gugun);
	}
	
	@PostMapping("/search")
	@Transactional
	public List<HouseDeal> searchAll(@RequestBody HousePageBean bean) throws SQLException{
		
		return houseService.searchAll(bean);
	}
	
	@PostMapping("/searchDistinct")
	@Transactional
	public List<HouseDeal> searchDistinct(@RequestBody HousePageBean bean) throws SQLException{
		
		return houseService.selectDistinct(bean);
	}
	@RequestMapping("/addr/{gugun}/{dong}")
	public BaseAddress getAddr(@PathVariable String gugun, @PathVariable String dong) throws SQLException {
		Map<String, String> addrMap = new HashMap<String, String>();
		addrMap.put("gugun",gugun);
		addrMap.put("dong",dong);
		return houseService.getAddress(addrMap);
	}
}
