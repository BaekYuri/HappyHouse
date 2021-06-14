package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.project.model.dao.HouseDao;
import com.ssafy.project.model.dto.BaseAddress;
import com.ssafy.project.model.dto.HouseDeal;
import com.ssafy.project.model.dto.HousePageBean;

@Service
public class HouseServiceImpl implements HouseService {
	
	@Autowired
	HouseDao houseDao;
	
	@Override
	public List<HouseDeal> searchAll(HousePageBean bean) throws SQLException {
		// TODO Auto-generated method stub
		return houseDao.searchAll(bean);
	}

	@Override
	public HouseDeal search(int no) throws SQLException {
		// TODO Auto-generated method stub
		return houseDao.search(no);
	}

	@Override
	public List<String> getDong(String gugun) throws SQLException {
		
		return houseDao.getDong(gugun);
	}

	@Override
	public List<String> getGu() throws SQLException {
		// TODO Auto-generated method stub
		return houseDao.getGu();
	}

	@Override
	public BaseAddress getAddress(Map<String, String> addr) throws SQLException {
		// TODO Auto-generated method stub
		return houseDao.getAddress(addr);
	}

	@Override
	public List<HouseDeal> selectDistinct(HousePageBean bean) throws SQLException {
		// TODO Auto-generated method stub
		return houseDao.selectDistinct(bean);
	}
	
	

}
