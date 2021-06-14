package com.ssafy.project.model.dto;

public class Park {
	private int num;
	private String parkName;
	private String area;
	private String img;
	private String gugun;
	private String address;
	private String management;
	private String tel;
	private String lat;
	private String lng;
	private String siteLink;
	public Park(int num, String parkName, String area, String img, String gugun, String address, String management,
			String tel, String lat, String lng, String siteLink) {
		super();
		this.num = num;
		this.parkName = parkName;
		this.area = area;
		this.img = img;
		this.gugun = gugun;
		this.address = address;
		this.management = management;
		this.tel = tel;
		this.lat = lat;
		this.lng = lng;
		this.siteLink = siteLink;
	}
	public Park() {
		super();
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getManagement() {
		return management;
	}
	public void setManagement(String management) {
		this.management = management;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getSiteLink() {
		return siteLink;
	}
	public void setSiteLink(String siteLink) {
		this.siteLink = siteLink;
	}
	@Override
	public String toString() {
		return "Park [num=" + num + ", parkName=" + parkName + ", area=" + area + ", img=" + img + ", gugun=" + gugun
				+ ", address=" + address + ", management=" + management + ", tel=" + tel + ", lat=" + lat + ", lng="
				+ lng + ", siteLink=" + siteLink + "]";
	}
	
}
