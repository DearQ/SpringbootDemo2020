package com.t05g1.pojo;

import java.io.Serializable;

public class User_Property implements Serializable {
	private Integer id;
	private Integer cid;
	private String name;
	//封装
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
