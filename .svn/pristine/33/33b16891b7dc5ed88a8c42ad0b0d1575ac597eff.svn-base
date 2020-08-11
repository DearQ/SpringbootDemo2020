package com.t05g1.pojo;

import java.util.List;

public class Role {
    private Long id;

    private String name;

    private String desc_;
    
    //非数据库字段
    List<Permission> psList;
    
	public List<Permission> getPsList() {
		return psList;
	}

	public void setPsList(List<Permission> psList) {
		this.psList = psList;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc_() {
        return desc_;
    }

    public void setDesc_(String desc_) {
        this.desc_ = desc_ == null ? null : desc_.trim();
    }

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", desc_=" + desc_ + "]";
	}
    
}