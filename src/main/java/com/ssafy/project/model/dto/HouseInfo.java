package com.ssafy.project.model.dto;

public class HouseInfo {
	private int no;
	private String dong;
	private String aptName;
	private String code;
	private int buildYear;
	private String jibun;
	private double lat, lng;
	
	
	public HouseInfo() {
		super();
	}
	
	public HouseInfo(int no, String dong, String aptName, String code, int buildYear, String jibun, double lat,
			double lng) {
		super();
		this.no = no;
		this.dong = dong;
		this.aptName = aptName;
		this.code = code;
		this.buildYear = buildYear;
		this.jibun = jibun;
		this.lat = lat;
		this.lng = lng;
	}
	public final int getNo() {
		return no;
	}
	public final void setNo(int no) {
		this.no = no;
	}
	public final String getDong() {
		return dong;
	}
	public final void setDong(String dong) {
		this.dong = dong;
	}
	public final String getAptName() {
		return aptName;
	}
	public final void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public final String getCode() {
		return code;
	}
	public final void setCode(String code) {
		this.code = code;
	}
	public final int getBuildYear() {
		return buildYear;
	}
	public final void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}
	public final String getJibun() {
		return jibun;
	}
	public final void setJibun(String jibun) {
		this.jibun = jibun;
	}
	public final double getLat() {
		return lat;
	}
	public final void setLat(double lat) {
		this.lat = lat;
	}
	public final double getLng() {
		return lng;
	}
	public final void setLng(double lng) {
		this.lng = lng;
	}
	
	
}
