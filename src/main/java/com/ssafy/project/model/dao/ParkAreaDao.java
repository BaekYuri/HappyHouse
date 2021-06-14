package com.ssafy.project.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.project.model.dto.Park;

public interface ParkAreaDao {
	List<Park> getPark(String gugun) throws SQLException;
}
