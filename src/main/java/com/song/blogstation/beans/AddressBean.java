package com.song.blogstation.beans;

import java.io.Serializable;

public class AddressBean implements Serializable {

	/**
	 * 随机
	 */
	private static final long serialVersionUID = -6913804281535928256L;

	private Integer id;

	private String address;

	public AddressBean() {
	}

	public AddressBean(Integer id, String address) {
		this.id = id;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
