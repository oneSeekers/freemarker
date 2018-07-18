package com.fly.freemarker.test.pojo;

public class User {
	private Integer id;
	
	private String name;
	
	private byte sex;
	
	private String address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, byte sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", address=" + address + "]";
	}

}
