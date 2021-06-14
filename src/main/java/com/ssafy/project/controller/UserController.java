package com.ssafy.project.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.project.model.dto.UserDto;
import com.ssafy.project.model.service.JwtServiceImpl;
import com.ssafy.project.model.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = {"*"})
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private JwtServiceImpl jwtService;
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "새로운 사원 정보를 입력한다. 그리고 그 사원의 사원 번호를 반환한다.", response = Integer.class)
	@PostMapping("/join")
	public ResponseEntity<String>  join(@RequestBody UserDto userDto) throws Exception {
		logger.info("5-------------addUser-----------------------------"+userDto);
		userService.join(userDto);
		if(userDto != null) {
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("fail", HttpStatus.OK);
	}

//	@PostMapping("/login")
//	public ResponseEntity<UserDto> login(@RequestBody UserDto userDto) throws Exception {
//
//		logger.info("1-------------login-----------------------------"+new Date());
//		Map<String, String> login = new HashMap<>();
//		login.put("email", userDto.getEmail());
//		login.put("pass", userDto.getPass());
//		
//		UserDto userDtologin = userService.login(login.get("email"), login.get("pass"));
//		if(userDtologin == null) {
//			logger.debug("로그인 실패");
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//		}
//
//		return new ResponseEntity<UserDto>(userDtologin, HttpStatus.OK);
//
//	}
	@Transactional
	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody UserDto userDto, HttpServletResponse res) throws Exception {

		logger.info("1-------------login-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		ResponseEntity<Map<String, Object>> entity = null;
	    String token="";
		try {
			UserDto userDtologin = userService.login(userDto.getEmail(), userDto.getPass());
		
			token = jwtService.create(userDtologin);
			
			resultMap.putAll(jwtService.get(token));
			
			resultMap.put("status", true);
			resultMap.put("data", userDtologin);
			resultMap.put("token", token);

			entity = ResponseEntity.accepted().header("access-token", token).body(resultMap);
		}catch(RuntimeException e) {
			logger.info("로그인 실패", e);
			resultMap.put("message", e.getMessage());
			entity = ResponseEntity.badRequest().body(resultMap);
		}
		
		return entity;

	}
	@Transactional
	@PostMapping("/logininfo")
	public ResponseEntity<Map<String, Object>> getInfo(@RequestBody UserDto userDto, HttpServletRequest req) throws Exception {

		logger.info("1-------------login-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		//System.out.println("resultMap"+resultMap);
		HttpStatus status = null;
		try {
			resultMap.putAll(jwtService.get(req.getHeader("access-token")));
			resultMap.put("status", true);
			resultMap.put("data", userDto);
			status = HttpStatus.ACCEPTED;
		}catch(RuntimeException e) {
			logger.info("회원 정보 가져오기 실패", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<Map<String, Object>>(resultMap, status);

	}
	@Transactional
	@PostMapping("/info")
	public ResponseEntity<Map<String, Object>> gettokenInfo(HttpServletRequest req) throws Exception {

		logger.info("2-------------getinfo-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		//System.out.println("resultMap"+resultMap);
		HttpStatus status = null;
		try {
			resultMap.putAll(jwtService.get(req.getHeader("access-token")));
			resultMap.put("status", true);

			status = HttpStatus.ACCEPTED;
		}catch(RuntimeException e) {
			logger.info("회원 정보 가져오기 실패", e);
			resultMap.put("message", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<Map<String, Object>>(resultMap, status);

	}
//	//@ApiOperation(value = "회원 정보를 반환한다.", response = List.class)
//	@RequestMapping(value = "/info", method = RequestMethod.GET)
//	public ResponseEntity<UserDto> getInfo(@PathVariable String userid) throws Exception{
//		UserDto userDto = userService.getInfo(userid);
//		if(userDto == null) {
//			logger.debug("정보 반환 실패");
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//		}
//		return new ResponseEntity<UserDto> (userDto, HttpStatus.OK);
//		
//	}
//	
	@Transactional
	@GetMapping("/interest")
	public String interest() {
		return "user/interest";
	}
	
//	@GetMapping("/logout")
//	public String logout(HttpSession session) {
//		session.invalidate();
//		return "happyhouse";
//	}
	@Transactional
	@PutMapping("/modifyuserinfo")
	public ResponseEntity<Map<String, Object>> modifyInfo(@RequestBody UserDto userDto, HttpServletRequest req) throws SQLException {
		logger.info("1-------------modify-----------------------------"+new Date());
		Map<String, Object> resultMap = new HashMap<>();
		//System.out.println("resultMap"+resultMap);
		String token = "";
		ResponseEntity<Map<String, Object>> entity = null;
		try {
			userService.modifyInfo(userDto);
			token = jwtService.create(userDto);
			
			resultMap.put("status", true);
			resultMap.put("data", userDto);
			
			entity = ResponseEntity.accepted().header("access-token", token).body(resultMap);
		}catch(RuntimeException e) {
			logger.info("회원 수정 실패", e);
			resultMap.put("message", e.getMessage());
			entity = ResponseEntity.badRequest().body(resultMap);
		}

		return entity;
	}
	@Transactional
	@DeleteMapping(value = "/delete")
	public ResponseEntity<String> delete(@RequestBody String email) throws Exception {
		if(email != null) {
			userService.delete(email);
			return new ResponseEntity<String> ("success", HttpStatus.OK);
		}

		return new ResponseEntity<String> ("fail", HttpStatus.NO_CONTENT);
		
	}
}
