package com.ssafy.project.model.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ssafy.project.model.dto.UserDto;

public interface UserDao {
	public UserDto getPwd(String email, String name, String phone) throws SQLException;
	public void join(UserDto userDto);
	public UserDto login(Map<String, String> map) throws SQLException;
	public void modifyInfo(UserDto userDto) throws SQLException;
	public UserDto getInfo(String email) throws SQLException;
	public void delete(String email) throws SQLException;
}
