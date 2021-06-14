package com.ssafy.project.model.dto;

public class UserDto {
	private String email;
	private String pass;
	private String name;
	private String addr;
	private String phone;
	
	public UserDto() {}
	public UserDto(String email, String pass, String name, String addr, String phone) {
		super();
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserDto [email=" + email + ", pass=" + pass + ", name=" + name + ", addr=" + addr + ", phone=" + phone
				+ "]";
	}
	public final String getEmail() {
		return email;
	}
	public final void setEmail(String email) {
		this.email = email;
	}
	public final String getPass() {
		return pass;
	}
	public final void setPass(String pass) {
		this.pass = pass;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getAddr() {
		return addr;
	}
	public final void setAddr(String addr) {
		this.addr = addr;
	}
	public final String getPhone() {
		return phone;
	}
	public final void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
