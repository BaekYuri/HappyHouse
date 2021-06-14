package com.ssafy.project.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.project.model.dto.CountryMarketDto;
import com.ssafy.project.model.service.MarketService;

@RestController
@RequestMapping("/Market")
@CrossOrigin(origins = {"*"})
public class CountryMarketController {
	private static final Logger logger = LoggerFactory.getLogger(CountryMarketController.class);

	@Autowired
	private MarketService marketService;
	
	@PostMapping("/marketinfo")
	public ResponseEntity<Map<String, Object>> getMarketInfo(@RequestBody Map<String, String> mmap , HttpServletRequest req) throws SQLException{

		logger.info("3-------------CountryMarketinfo-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		
		HttpStatus status = null;
		CountryMarketDto countrymarketDto = null;
		try {
			countrymarketDto = marketService.getMarket(mmap);
			
			resultMap.put("data", countrymarketDto);
			
			status = HttpStatus.ACCEPTED;
		}catch(RuntimeException e){
			logger.info("market error", e);
			status = HttpStatus.BAD_REQUEST;
		}
		
		
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
	
	@GetMapping("/allavginfo")
	public ResponseEntity<Map<String, Object>> getAllAvgInfo(HttpServletRequest req) throws SQLException{

		logger.info("3-------------getAllAvgInfo-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		
		HttpStatus status = null;
		CountryMarketDto countrymarketDto = null;
		try {
			countrymarketDto = marketService.getSumAvg();
			resultMap.put("data", countrymarketDto);
			
			status = HttpStatus.ACCEPTED;
		}catch(RuntimeException e){
			logger.info("market error", e);
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
	
	@GetMapping("/guavginfo/{gugun}")
	public ResponseEntity<Map<String, Object>> getGuAvgInfo(@PathVariable String gugun, HttpServletRequest req) throws SQLException{

		logger.info("3-------------getAllAvgInfo-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		
		HttpStatus status = null;
		CountryMarketDto countrymarketDto = null;
		try {
			countrymarketDto = marketService.getGuAvg(gugun);
			resultMap.put("data", countrymarketDto);
			
			status = HttpStatus.ACCEPTED;
		}catch(RuntimeException e){
			logger.info("market error", e);
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
	
	@GetMapping("/maxinfo")
	public ResponseEntity<Map<String, Object>> getMaxInfo(HttpServletRequest req) throws SQLException{

		logger.info("3-------------getAllAvgInfo-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		
		HttpStatus status = null;
		CountryMarketDto countrymarketDto = null;
		try {
			countrymarketDto = marketService.getMax();
			resultMap.put("data", countrymarketDto);
			
			status = HttpStatus.ACCEPTED;
		}catch(RuntimeException e){
			logger.info("market error", e);
			status = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Map<String, Object>>(resultMap, status);
	}
}
