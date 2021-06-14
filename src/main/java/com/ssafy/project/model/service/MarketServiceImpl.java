package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.project.model.dao.CountryMarketDao;
import com.ssafy.project.model.dto.CountryMarketDto;

@Service
public class MarketServiceImpl implements MarketService{
	
	private static final Logger logger = LoggerFactory.getLogger(MarketServiceImpl.class);
	
	
	@Autowired
	private CountryMarketDao marketDao;

	@Override
	public CountryMarketDto getMarket(Map<String, String> mmap) throws SQLException {

		return marketDao.getMarket(mmap);
	}

	@Override
	public CountryMarketDto getSumAvg() throws SQLException {
		return marketDao.getSumAvg();
	}

	@Override
	public CountryMarketDto getGuAvg(String gugun) throws SQLException {
		return marketDao.getGuAvg(gugun);
	}

	@Override
	public CountryMarketDto getMax() throws SQLException {
		return marketDao.getMax();
	}
	
	
}
