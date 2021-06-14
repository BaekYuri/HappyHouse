package com.ssafy.project.model.dto;

import java.util.Arrays;

public class HousePageBean {
	private String city;
	private String dong;
	private String dongcode;
	private String aptname;
	private String dealtype;
	private boolean[] searchType;
	private String pagelink;
	private int pageNo;
	private int interval;
	private int start;
	private int end;
	
	
	public HousePageBean() {
		super();
	}
	public HousePageBean(String city, String dong, String dongcode, String aptname, String dealtype,
			boolean[] searchType, String pagelink, int pageNo, int interval, int start, int end) {
		super();
		this.city = city;
		this.dong = dong;
		this.dongcode = dongcode;
		this.aptname = aptname;
		this.dealtype = dealtype;
		this.searchType = searchType;
		this.pagelink = pagelink;
		this.pageNo = pageNo;
		this.interval = interval;
		this.start = start;
		this.end = end;
	}
	public final String getCity() {
		return city;
	}
	public final void setCity(String city) {
		this.city = city;
	}
	public final String getDong() {
		return dong;
	}
	public final void setDong(String dong) {
		this.dong = dong;
	}
	public final String getDongcode() {
		return dongcode;
	}
	public final void setDongcode(String dongcode) {
		this.dongcode = dongcode;
	}
	public final String getAptname() {
		return aptname;
	}
	public final void setAptname(String aptname) {
		this.aptname = aptname;
	}
	public final String getDealtype() {
		return dealtype;
	}
	public final void setDealtype(String dealtype) {
		this.dealtype = dealtype;
	}
	public final boolean[] getSearchType() {
		return searchType;
	}
	public final void setSearchType(boolean[] searchType) {
		this.searchType = searchType;
	}
	public final String getPagelink() {
		return pagelink;
	}
	public final void setPagelink(String pagelink) {
		this.pagelink = pagelink;
	}
	public final int getPageNo() {
		return pageNo;
	}
	public final void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public final int getInterval() {
		return interval;
	}
	public final void setInterval(int interval) {
		this.interval = interval;
	}
	public final int getStart() {
		return start;
	}
	public final void setStart(int start) {
		this.start = start;
	}
	public final int getEnd() {
		return end;
	}
	public final void setEnd(int end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "HousePageBean [city=" + city + ", dong=" + dong + ", dongcode=" + dongcode + ", aptname=" + aptname
				+ ", dealtype=" + dealtype + ", searchType=" + Arrays.toString(searchType) + ", pagelink=" + pagelink
				+ ", pageNo=" + pageNo + ", interval=" + interval + ", start=" + start + ", end=" + end + "]";
	}

	
}
