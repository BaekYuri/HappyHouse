package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ssafy.project.model.dto.BaseAddress;
import com.ssafy.project.model.dto.HouseDeal;
import com.ssafy.project.model.dto.HousePageBean;

public interface HouseService {
	List<HouseDeal> searchAll(HousePageBean bean) throws SQLException;
	HouseDeal search(int no) throws SQLException;
	List<String> getDong(String gugun) throws SQLException;
	List<String> getGu() throws SQLException;
	BaseAddress getAddress(Map<String,String> addr) throws SQLException; 
	List<HouseDeal> selectDistinct(HousePageBean bean) throws SQLException;
}
