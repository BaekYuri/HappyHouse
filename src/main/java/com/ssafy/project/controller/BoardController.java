package com.ssafy.project.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.project.model.dto.Board;
import com.ssafy.project.model.service.BoardService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/board")
@CrossOrigin(origins = {"*"})
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@ApiOperation(value = "모든 사원의 정보를 반환한다.", response = List.class)
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Board>> getBoardList() throws Exception {
		logger.info("1-------------getBoardList-----------------------------"+new Date());
		List<Board> boardList = boardService.getList();
		if (boardList.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Board>>(boardList, HttpStatus.OK);
	}
	@ApiOperation(value = " 새로운 사원을 정보를 입력한다. 그리고 그 사원의 사원번호를 반환한다.", response = Integer.class)
   	@PostMapping("/create")
   	public ResponseEntity<Integer> addBoard(@RequestBody Board board) throws Exception {
   		logger.info("5-------------addBoard-----------------------------"+new Date());
   		logger.info("5-------------addBoard-----------------------------"+board);
   		boardService.regist(board);
   		return new ResponseEntity<Integer>(1, HttpStatus.OK);
   	}
	
	@GetMapping("/view/{no}")
	public ResponseEntity<Board> viewBoard(@PathVariable int no) throws Exception{
		Board result = boardService.view(no);
		return new ResponseEntity<Board>(result, HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<Integer> modify(@RequestBody Board board) throws Exception{
		logger.info("5-------------modifyBoard-----------------------------"+board);
		boardService.modify(board);
		return new ResponseEntity<Integer>(0, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{no}")
	public ResponseEntity<Integer> deleteBoard(@PathVariable int no) throws Exception{
		boardService.delete(no);
		return new ResponseEntity<Integer>(0, HttpStatus.OK);
	}
	
	@GetMapping("/search/{keyword}/{text}")
	public ResponseEntity<List<Board>> searchBoard(@PathVariable String keyword, @PathVariable String text) throws Exception {
		logger.info("1-------------searchBoard-----------------------------"+new Date());
		Map<String,String> search = new HashMap<>();
		search.put("keyword", keyword);
		search.put("text", text);
		List<Board> boardList = boardService.Search(search);
		if (boardList.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Board>>(boardList, HttpStatus.OK);
	}
}
