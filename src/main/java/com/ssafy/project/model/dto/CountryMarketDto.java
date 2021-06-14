package com.ssafy.project.model.dto;

public class CountryMarketDto {
	private String gugun;
	private String dong;
	private String registnum;
	private String registstore;
	private String registarea;
	private String recognizednum;
	private String recognizedstore;
	private String recognizedarea;
	private String shoppingstreetnum;
	private String shoppingstreetstore;
	private String shoppingstreetarea;
	
	public CountryMarketDto() {
		super();
	}
	
	
	public CountryMarketDto(String gugun, String dong, String registnum, String registstore, String registarea,
			String recognizednum, String recognizedstore, String recognizedarea, String shoppingstreetnum,
			String shoppingstreetstore, String shoppingstreetarea) {
		super();
		this.gugun = gugun;
		this.dong = dong;
		this.registnum = registnum;
		this.registstore = registstore;
		this.registarea = registarea;
		this.recognizednum = recognizednum;
		this.recognizedstore = recognizedstore;
		this.recognizedarea = recognizedarea;
		this.shoppingstreetnum = shoppingstreetnum;
		this.shoppingstreetstore = shoppingstreetstore;
		this.shoppingstreetarea = shoppingstreetarea;
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
	public String getRegistnum() {
		return registnum;
	}
	public void setRegistnum(String registnum) {
		this.registnum = registnum;
	}
	public String getRegiststore() {
		return registstore;
	}
	public void setRegiststore(String registstore) {
		this.registstore = registstore;
	}
	public String getRegistarea() {
		return registarea;
	}
	public void setRegistarea(String registarea) {
		this.registarea = registarea;
	}
	public String getRecognizednum() {
		return recognizednum;
	}
	public void setRecognizednum(String recognizednum) {
		this.recognizednum = recognizednum;
	}
	public String getRecognizedstore() {
		return recognizedstore;
	}
	public void setRecognizedstore(String recognizedstore) {
		this.recognizedstore = recognizedstore;
	}
	public String getRecognizedarea() {
		return recognizedarea;
	}
	public void setRecognizedarea(String recognizedarea) {
		this.recognizedarea = recognizedarea;
	}
	public String getShoppingstreetnum() {
		return shoppingstreetnum;
	}
	public void setShoppingstreetnum(String shoppingstreetnum) {
		this.shoppingstreetnum = shoppingstreetnum;
	}
	public String getShoppingstreetstore() {
		return shoppingstreetstore;
	}
	public void setShoppingstreetstore(String shoppingstreetstore) {
		this.shoppingstreetstore = shoppingstreetstore;
	}
	public String getShoppingstreetarea() {
		return shoppingstreetarea;
	}
	public void setShoppingstreetarea(String shoppingstreetarea) {
		this.shoppingstreetarea = shoppingstreetarea;
	}
	@Override
	public String toString() {
		return "CountryMarket [gugun=" + gugun + ", dong=" + dong + ", registnum=" + registnum + ", registstore="
				+ registstore + ", registarea=" + registarea + ", recognizednum=" + recognizednum + ", recognizedstore="
				+ recognizedstore + ", recognizedarea=" + recognizedarea + ", shoppingstreetnum=" + shoppingstreetnum
				+ ", shoppingstreetstore=" + shoppingstreetstore + ", shoppingstreetarea=" + shoppingstreetarea + "]";
	}

	
}
