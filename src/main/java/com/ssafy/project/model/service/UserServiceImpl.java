package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.project.model.dao.UserDao;
import com.ssafy.project.model.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDto getPwd(String email, String name, String phone) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getPwd(email, name, phone);
	}

//	@Override
//	public void join(UserDto userDto) throws Exception {
//		if (userDto.getEmail() == null || userDto.getPass() == null || userDto.getName() == null || userDto.getAddr() == null || userDto.getPhone() == null) {
//			return null;
//		}
//		System.out.println("join서비스실행");
//		return sqlSession.getMapper(UserDao.class).join(userDto);
//	}
	

	@Override
	public void join(UserDto userDto) throws Exception {
		if (userDto.getEmail() == null || userDto.getPass() == null || userDto.getName() == null || userDto.getAddr() == null || userDto.getPhone() == null) {
			throw new Exception();  
		}
		System.out.println("join서비스실행");
		userDao.join(userDto);
	}

	@Override
	public UserDto login(String email, String userpwd) throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("email", email);
		map.put("userpwd", userpwd);
		
		
		if(email == null || userpwd == null)
			throw new Exception();  
		return userDao.login(map);
	}

	@Override
	public void modifyInfo(UserDto userDto) throws SQLException {
		userDao.modifyInfo(userDto);
		
	}

	@Override
	public UserDto getInfo(String email) throws SQLException {
		return userDao.getInfo(email);
	}

	@Override
	public void delete(String email) throws SQLException {
		userDao.delete(email);
	}


}
