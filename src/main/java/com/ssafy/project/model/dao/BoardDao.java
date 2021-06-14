package com.ssafy.project.model.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ssafy.project.model.dto.Board;


public interface BoardDao {
	public List<Board> getList() throws SQLException;
	public void regist(Board boardDto) throws Exception;
	public void modify(Board boardDto) throws Exception;
	public Board view(int no) throws Exception;
	public List<Board> Search(Map<String,String> searchmap) throws SQLException;
	public void delete(int no) throws SQLException;
}
