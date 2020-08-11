package com.t05g1.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User_Category implements Serializable {
    private Integer id;

    private String name;
    //一个分类下的商品
    private List<User_Commodity> ucomm=new ArrayList<User_Commodity>();

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
        this.name = name == null ? null : name.trim();
    }

	public List<User_Commodity> getUcomm() {
		return ucomm;
	}

	public void setUcomm(List<User_Commodity> ucomm) {
		this.ucomm = ucomm;
	}
    
    
}