package com.ssafy.project.model.dto;

import java.sql.Date;

public class Board {	
	private String no;
	private String writer;
	private String title;
	private String content;
	private Date regtime;
	
	
	
	
	public Board() {
		super();
	}



	public Board(String no, String writer, String title, String content, Date regtime) {
		super();
		this.no = no;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
	}



	public Board(String writer, String title, String content) {
		super();
		this.no="";
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regtime = new Date(0);
	}

	

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}



	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getRegtime() {
		return regtime;
	}


	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}


	@Override
	public String toString() {
		return "Board [writer=" + writer + ", title=" + title + ", content=" + content + ", regtime=" + regtime + "]";
	}
	
	
}
