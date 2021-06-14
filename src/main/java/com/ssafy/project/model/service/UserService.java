package com.ssafy.project.model.service;

import java.sql.SQLException;

import com.ssafy.project.model.dto.UserDto;
public interface UserService {
	public UserDto getPwd(String email, String name, String phone) throws SQLException;
	public void join(UserDto userDto) throws Exception;
	public UserDto login(String userid, String userpwd) throws Exception;
	public void modifyInfo(UserDto userDto) throws SQLException;
	public UserDto getInfo(String userid) throws Exception;
	public void delete(String userid) throws Exception;
}
