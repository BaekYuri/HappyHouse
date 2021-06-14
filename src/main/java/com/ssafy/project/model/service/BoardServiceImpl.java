package com.ssafy.project.model.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.project.model.dao.BoardDao;
import com.ssafy.project.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	
	@Autowired
	private BoardDao boardDao;

	@Override
	public List<Board> getList() throws SQLException {
		// TODO Auto-generated method stub
		return boardDao.getList();
	}

	@Override
	public void regist(Board boardDto) throws Exception {
		if(boardDto.getContent() == null || boardDto.getWriter() == null || boardDto.getTitle() == null) {
			throw new Exception();
		}
		System.out.println("글 등록 실행");
		boardDao.regist(boardDto);
	}

	@Override
	public void modify(Board boardDto) throws Exception {
		boardDao.modify(boardDto);
		
	}


	@Override
	public void delete(int no) throws SQLException {
		boardDao.delete(no);
		
	}

	@Override
	public List<Board> Search(Map<String, String> searchmap) throws SQLException {

		return boardDao.Search(searchmap);
	}

	@Override
	public Board view(int no) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.view(no);
	}

}
