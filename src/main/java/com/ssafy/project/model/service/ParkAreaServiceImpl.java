package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.project.model.dao.ParkAreaDao;
import com.ssafy.project.model.dto.Park;

@Service
public class ParkAreaServiceImpl implements ParkAreaService{

private ParkAreaServiceImpl() {}
	
	@Autowired
	ParkAreaDao parkAreaDao;

	@Override
	public List<Park> getPark(String gugun) throws SQLException {
		
		return parkAreaDao.getPark(gugun);
	}

}
