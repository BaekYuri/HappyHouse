package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.List;

import com.ssafy.project.model.dto.Park;

public interface ParkAreaService {
	List<Park> getPark(String gugun) throws SQLException;
}
