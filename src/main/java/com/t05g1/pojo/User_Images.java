package com.t05g1.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User_Images implements Serializable {
	private Integer id;
	private String uriDa;
	private String uriZ;
	private String uriX;
	private Integer commId;
	private Integer colourId;
	private Integer uriType;
	
	//伪属性
	private String uriDZ;
	
	
	public String getUriDZ() {
		return uriDZ;
	}
	public void setUriDZ(String uriDZ) {
		this.uriDZ = uriDZ;
	}
	//封装
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUriDa() {
		return uriDa;
	}
	public void setUriDa(String uriDa) {
		this.uriDa = uriDa;
	}
	public String getUriZ() {
		return uriZ;
	}
	public void setUriZ(String uriZ) {
		this.uriZ = uriZ;
	}
	public String getUriX() {
		return uriX;
	}
	public void setUriX(String uriX) {
		this.uriX = uriX;
	}
	public Integer getCommId() {
		return commId;
	}
	public void setCommId(Integer commId) {
		this.commId = commId;
	}
	public Integer getColourId() {
		return colourId;
	}
	public void setColourId(Integer colourId) {
		this.colourId = colourId;
	}
	public Integer getUriType() {
		return uriType;
	}
	public void setUriType(Integer uriType) {
		this.uriType = uriType;
	}
	/*
	 * public String[] getUriDZ() { return uriDZ; } public void setUriDZ(String[]
	 * uriDZ) { this.uriDZ = uriDZ; }
	 */

	
	
	
	
}
