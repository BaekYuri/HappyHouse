package com.ssafy.project.model.dto;

public class BaseAddress {
	private String city;
	private int code;
	private int dongCode;
	private String gugun;
	private String dong;
	private double lat;
	private double lng;
	
	
	public BaseAddress() {
		super();
	}
	public BaseAddress(String city, int code, int dongCode, String gugun, String dong, double lat, double lng) {
		super();
		this.city = city;
		this.code = code;
		this.dongCode = dongCode;
		this.gugun = gugun;
		this.dong = dong;
		this.lat = lat;
		this.lng = lng;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getDongCode() {
		return dongCode;
	}
	public void setDongCode(int dongCode) {
		this.dongCode = dongCode;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	
}
